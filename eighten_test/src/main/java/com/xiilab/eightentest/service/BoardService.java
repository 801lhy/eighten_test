package com.xiilab.eightentest.service;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.xiilab.eightentest.VO.BoardVO;
import com.xiilab.eightentest.VO.Criteria;

@Service
public interface BoardService {
	
		public List<BoardVO> selectBoard() throws Exception;
		
		// ���� �Խñ� ��� ��ȸ
		public List<BoardVO> selectBoardList(Criteria criteria) throws Exception;

		// �Խñ� ����ȸ
		public BoardVO readBoardContent(int post_idx) throws Exception;
		
		// �Խñ� �ۼ�
		public void write(BoardVO boardVO, MultipartHttpServletRequest mpRequest) throws Exception;
		
		// �Խñ� ��� ���� ��ȸ
		public int countBoardList(Criteria criteria) throws Exception;
}