package com.xiilab.eightentest.controller;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.inject.Inject;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import com.xiilab.eightentest.VO.BoardVO;
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
	public String selectBoardList(Model model) throws Exception {
		
		logger.info("selectBoardList called ====");
		model.addAttribute("boardList",service.selectBoardList());
		
		return "/board/notice";
	}
	
	@RequestMapping(value = "/board/gallery", method = RequestMethod.GET)
	public String boardGallery(Locale locale, Model model) {
		
		return "/board/gallery";
	}
	
	@RequestMapping(value = "/question/join", method = RequestMethod.GET)
	public String questionJoin(Locale locale, Model model) {
		
		return "/question/join";
	}
	
	@RequestMapping(value = "/question/admission", method = RequestMethod.GET)
	public String questionAdmission(Locale locale, Model model) {
		
		return "/question/admission";
	}
	
	// 2. 게시글 상세조회
	@RequestMapping(value = "/board/boardContent", method = RequestMethod.GET)
	public String readboardContent(BoardVO board, Model model) throws Exception {
		
		logger.info("read boardContent called | jsp: board/boardContent.jsp ====");
		model.addAttribute("readList", service.readBoardContent(board.getPost_idx())) ;
		
		return "/board/boardContent";
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
