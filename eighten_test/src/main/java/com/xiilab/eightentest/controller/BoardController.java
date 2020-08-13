package com.xiilab.eightentest.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.xiilab.eightentest.VO.BoardVO;
import com.xiilab.eightentest.VO.Criteria;
import com.xiilab.eightentest.VO.PageMaker;
import com.xiilab.eightentest.service.BoardService;

@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService service;
	
	
	@RequestMapping(value ="/main", method = RequestMethod.GET)
	public String mainPage(Locale locale, Model model) {
		
		return "main";
	}

	@RequestMapping(value = "/introduce/company", method = RequestMethod.GET)
	public String introduceCom(Locale locale, Model model) {
		
		return "/introduce/company";
	}
	
	@RequestMapping(value = "/introduce/education", method = RequestMethod.GET)
	public String introduceEdu(Locale locale, Model model) {
		
		return "/introduce/education";
	}
	
	@RequestMapping(value = "/introduce/value", method = RequestMethod.GET)
	public String introduceVal(Locale locale, Model model) {
		
		return "/introduce/value";
	}
	
	@RequestMapping(value = "/edusystem/curriculum", method = RequestMethod.GET)
	public String eduSystem(Locale locale, Model model) {
		
		return "/edusystem/curriculum";
	}
	
	//  1. 공지 게시글 목록 조회
	@RequestMapping(value="/board/notice", method=RequestMethod.GET)
	public String selectBoardList(Model model, Criteria criteria) throws Exception {
		
		logger.info(" ==== selectBoardList called  ====");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCriteria(criteria);
		pageMaker.setTotalCount(service.countBoardList(criteria)); // 전체 게시글의 갯수를 구하는 로직
		
		model.addAttribute("boardList", service.selectBoardList(criteria));
		model.addAttribute("pageMaker", pageMaker);
		
		return "/board/notice";
	}
	
	// 1-2. 갤러리 게시글 목록 조회
	@RequestMapping(value = "/board/gallery", method = RequestMethod.GET)
	public String boardGallery(Locale locale, Model model) {
		
		return "/board/gallery";
	}
	
	// 2. 게시글 상세조회
	@RequestMapping(value = "/board/boardContent", method = RequestMethod.GET)
	public String readboardContent(BoardVO boardVO, Model model) throws Exception {
		
		logger.info(" ==== read boardContent called | getPost_idx: "+ boardVO.getPost_idx() +" ====");
		
		model.addAttribute("readList", service.readBoardContent(boardVO.getPost_idx())) ;
		
		return "/board/boardContent";
	}
	
	// 3-1. 게시글 작성 화면
	@RequestMapping(value = "/board/boardWrite", method = RequestMethod.GET)
	public String boardWrite() throws Exception {
		
		logger.info(" ==== boardWrite called ====");
		
		return "/board/boardWrite";
	}

	// 3-2. 게시글 작성
	@RequestMapping(value = "*/board/write", method = RequestMethod.POST)
	public String Write(BoardVO boardVO, MultipartHttpServletRequest mpRequest) throws Exception{
		
		logger.info(" ==== Write called ====");
		service.write(boardVO, mpRequest);
		
		return "redirect:/board/notice";
	}
	
	@RequestMapping(value = "/introduce/test", method = RequestMethod.GET)
	public String testAPI(Locale locale, Model model) {
		
		return "/introduce/test";
	}
	
	@RequestMapping(value = "/question/join", method = RequestMethod.GET)
	public String questionJoin(Locale locale, Model model) {
		
		return "/question/join";
	}
	
	@RequestMapping(value = "/question/admission", method = RequestMethod.GET)
	public String questionAdmission(Locale locale, Model model) {
		
		return "/question/admission";
	}
	
	
	
	@RequestMapping(value="/selectList",method=RequestMethod.GET)
	public String selectBoard(Model model) throws Exception {
		List<BoardVO> list;
		list = service.selectBoard();
		model.addAttribute("list",list);
		logger.info("BoardController Called ====================");
		return "selectList"; 
		
	}
	
//	// 2020.08.03 에 했던거
//	@RequestMapping(value = "/introduce/*", method = RequestMethod.GET)
//	public String introducePage(HttpServletRequest request) {
//		String RequestURI=request.getRequestURI();
//		String contextPath=request.getContextPath();
//		String command=RequestURI.substring(contextPath.length());
//		
//		logger.info("BoardController-introducePage Called ====================");
//		logger.info("RequestURL : " + RequestURI);
//		logger.info("contextPath : " + contextPath);
//		logger.info("command : " + command);
//				
//		return command;
//	}
	
}
