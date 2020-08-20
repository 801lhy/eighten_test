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
	
	//  1. 공지 게시글 목록 조회
	@RequestMapping(value="/notice", method=RequestMethod.GET)
	public String selectBoardList(Model model, Criteria criteria) throws Exception {
		
		logger.info(" ==== selectBoardList called  ====");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCriteria(criteria);
//		pageMaker.setTotalCount(service.countBoardList(criteria)); // 전체 게시글의 갯수를 구하는 로직
		pageMaker.setTotalCount(service.countSearchedContents(criteria));
		
//		model.addAttribute("boardList", service.selectBoardList(criteria));
		model.addAttribute("boardList",service.searchBoardList(criteria));
		model.addAttribute("pageMaker", pageMaker);
		
		return "/board/notice";
	}
	
	// 1-2. 게시글 조건 검색
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
	
	// 1-3. 갤러리 게시글 목록 조회
	@RequestMapping(value = "/gallery", method = RequestMethod.GET)
	public String boardGallery(Locale locale, Model model) {
		
		return "/board/gallery";
	}
	
	
	// 2. 게시글 상세조회
	@RequestMapping(value = "/boardContent", method = RequestMethod.GET)
	public String readboardContent(BoardVO boardVO, Model model) throws Exception {
		
		logger.info(" ==== read boardContent called | getPost_idx: "+ boardVO.getPost_idx() +" ====");
		
		model.addAttribute("readList", service.readBoardContent(boardVO.getPost_idx())) ;
		
		return "/board/boardContent";
	}
	
	// 3-1. 게시글 작성 화면
	@RequestMapping(value = "/boardWrite", method = RequestMethod.GET)
	public String boardWrite() throws Exception {
		
		logger.info(" ==== boardWrite called ====");
		
		return "/board/boardWrite";
	}

	// 3-2. 게시글 작성
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String Write(BoardVO boardVO, MultipartHttpServletRequest mpRequest) throws Exception{
		
		logger.info(" ==== Write called ====");
		service.write(boardVO, mpRequest);
		
		return "redirect:/board/notice";
	}
	
	// 
	
}
