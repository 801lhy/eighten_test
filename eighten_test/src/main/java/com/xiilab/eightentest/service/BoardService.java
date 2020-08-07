package com.xiilab.eightentest.service;

import java.util.List;
import java.util.Map;

import javax.activation.CommandMap;

import org.springframework.stereotype.Service;

import com.xiilab.eightentest.VO.BoardVO;

@Service
public interface BoardService {
	
		public List<BoardVO> selectBoard() throws Exception;
		
		// ���� �Խñ� ��� ��ȸ
		public List<BoardVO> selectBoardList() throws Exception;

		// �Խñ� ����ȸ
		public BoardVO readBoardContent(int post_idx) throws Exception;
}