package com.xiilab.eightentest.controller;

import java.util.Locale;

import javax.inject.Inject;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.xiilab.eightentest.VO.BoardVO;
import com.xiilab.eightentest.VO.Criteria;
import com.xiilab.eightentest.VO.PageMaker;
import com.xiilab.eightentest.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService service;
	
	//  1. ���� �Խñ� ��� ��ȸ
	@RequestMapping(value="/notice", method=RequestMethod.GET)
	public String selectBoardList(Model model, Criteria criteria) throws Exception {
		
		logger.info(" ==== selectBoardList called  ====");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCriteria(criteria);
//		pageMaker.setTotalCount(service.countBoardList(criteria)); // ��ü �Խñ��� ������ ���ϴ� ����
		pageMaker.setTotalCount(service.countSearchedContents(criteria));
		
//		model.addAttribute("boardList", service.selectBoardList(criteria));
		model.addAttribute("boardList",service.searchBoardList(criteria));
		model.addAttribute("pageMaker", pageMaker);
		
		return "/board/notice";
	}
	
	// 1-2. �Խñ� ���� �˻�
	@RequestMapping(value="/boardSearch", method = RequestMethod.GET)
	public String boardSearch(Model model, Criteria criteria) throws Exception {
		logger.info(" ==== BoardSearch called ====");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCriteria(criteria);
		pageMaker.setTotalCount(service.countBoardList(criteria));
		
		model.addAttribute("boardList", service.selectBoardList(criteria));
		model.addAttribute("pageMaker", pageMaker);
		
		return "/board/notice";
	}
	
	// 1-3. ������ �Խñ� ��� ��ȸ
	@RequestMapping(value = "/gallery", method = RequestMethod.GET)
	public String boardGallery(Locale locale, Model model) {
		
		return "/board/gallery";
	}
	
	
	// 2. �Խñ� ����ȸ
	@RequestMapping(value = "/boardContent", method = RequestMethod.GET)
	public String readboardContent(BoardVO boardVO, Model model) throws Exception {
		
		logger.info(" ==== read boardContent called | getPost_idx: "+ boardVO.getPost_idx() +" ====");
		
		model.addAttribute("readList", service.readBoardContent(boardVO.getPost_idx())) ;
		
		return "/board/boardContent";
	}
	
	// 3-1. �Խñ� �ۼ� ȭ��
	@RequestMapping(value = "/boardWrite", method = RequestMethod.GET)
	public String boardWrite() throws Exception {
		
		logger.info(" ==== boardWrite called ====");
		
		return "/board/boardWrite";
	}

	// 3-2. �Խñ� �ۼ�
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String Write(BoardVO boardVO, MultipartHttpServletRequest mpRequest) throws Exception{
		
		logger.info(" ==== Write called ====");
		service.write(boardVO, mpRequest);
		
		return "redirect:/board/notice";
	}
	
	// 
	
}
