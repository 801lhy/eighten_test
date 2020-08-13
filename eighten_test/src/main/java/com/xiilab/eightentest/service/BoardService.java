package com.xiilab.eightentest.service;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.xiilab.eightentest.VO.BoardVO;
import com.xiilab.eightentest.VO.Criteria;

@Service
public interface BoardService {
	
		public List<BoardVO> selectBoard() throws Exception;
		
		// 공지 게시글 목록 조회
		public List<BoardVO> selectBoardList(Criteria criteria) throws Exception;

		// 게시글 상세조회
		public BoardVO readBoardContent(int post_idx) throws Exception;
		
		// 게시글 작성
		public void write(BoardVO boardVO, MultipartHttpServletRequest mpRequest) throws Exception;
		
		// 게시글 목록 갯수 조회
		public int countBoardList(Criteria criteria) throws Exception;
}