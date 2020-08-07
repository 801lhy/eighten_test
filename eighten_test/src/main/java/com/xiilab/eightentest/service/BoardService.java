package com.xiilab.eightentest.service;

import java.util.List;
import java.util.Map;

import javax.activation.CommandMap;

import org.springframework.stereotype.Service;

import com.xiilab.eightentest.VO.BoardVO;

@Service
public interface BoardService {
	
		public List<BoardVO> selectBoard() throws Exception;
		
		// 공지 게시글 목록 조회
		public List<BoardVO> selectBoardList() throws Exception;

		// 게시글 상세조회
		public BoardVO readBoardContent(int post_idx) throws Exception;
}