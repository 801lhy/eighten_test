package com.xiilab.eightentest.service;

import java.util.List;

import javax.inject.Inject;
import org.springframework.stereotype.Service;

import com.xiilab.eightentest.DAO.BoardDAO;
import com.xiilab.eightentest.VO.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO dao;

	@Override
	public List<BoardVO> selectBoard() throws Exception {
		
		return dao.selectBoard();
	}
	
	
	// �Խñ� ��� ��ȸ
	@Override
	public List<BoardVO> selectBoardList() throws Exception {

		return dao.selectBoardList();
	}
	
	// �Խñ� �� ��ȸ
	@Override
	public BoardVO readBoardContent(int post_idx) throws Exception{
		
		return dao.readBoardContent(post_idx);
	}
	


}
