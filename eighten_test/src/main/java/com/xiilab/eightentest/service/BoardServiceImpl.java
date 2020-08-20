package com.xiilab.eightentest.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.xiilab.eightentest.DAO.BoardDAO;
import com.xiilab.eightentest.VO.BoardVO;
import com.xiilab.eightentest.VO.Criteria;
import com.xiilab.eightentest.util.FileUtils;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO dao;
	
	@Resource(name="fileUtils")
	private FileUtils fileUtils;
	

	@Override
	public List<BoardVO> selectBoard() throws Exception {
		
		return dao.selectBoard();
	}
	
	// �Խñ� ��� ��ȸ
	@Override
	public List<BoardVO> selectBoardList(Criteria criteria) throws Exception {

		return dao.selectBoardList(criteria);
	}
	
	// �˻� ��� ����
	@Override
	public List<BoardVO> searchBoardList(Criteria criteria) throws Exception{
		return dao.searchBoardList(criteria);
	}
	
	// �˻��� �Խñ� ���� ����
	@Override
	public int countSearchedContents(Criteria criteria) throws Exception{
		return dao.countSearchedContents(criteria);
	}
	
	// �Խñ� �� ��ȸ
	@Override
	public BoardVO readBoardContent(int post_idx) throws Exception{
		
		return dao.readBoardContent(post_idx);
	}
	
	 // �Խñ� �ۼ�
	@Override
	public void write(BoardVO boardVO, MultipartHttpServletRequest mpRequest) throws Exception{
		
		dao.write(boardVO);
		
		List<Map<String,Object>> list = fileUtils.parseInsertFileInfo(boardVO, mpRequest);
		int size = list.size();
		for(int i=0; i<size; i++) {
			dao.insertFile(list.get(i));
		}
	}
	
	// �Խñ� ��� ���� ��ȸ
	@Override
	public int countBoardList(Criteria criteria) throws Exception{
		return dao.countBoardList(criteria);
	}

}
