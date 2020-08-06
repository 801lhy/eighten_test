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
	


}
