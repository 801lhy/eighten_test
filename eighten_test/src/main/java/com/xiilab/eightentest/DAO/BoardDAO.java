package com.xiilab.eightentest.DAO;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.xiilab.eightentest.VO.BoardVO;
import com.xiilab.eightentest.VO.Criteria;

// 2. DOA �������̽� �ۼ�
// ���̺� �� ������ Ŭ���� ������ �� ������ ���ؾ� �ϴ� �۾��� �������̽��� �����Ѵ�.
// ������ ���� �����ͺ��̽� ���� ����� ����Ǿ, DAO �� �����ؼ� ó���Ҽ� �ִ�.
@Repository
public interface BoardDAO {
	
	public List<BoardVO> selectBoard() throws Exception;

	// ���� �Խñ� ��� ��ȸ
	public List<BoardVO> selectBoardList(Criteria criteria) throws Exception;
	
	// �Խñ� �� ��ȸ
	public BoardVO readBoardContent(int post_idx) throws Exception;
	
	// �Խñ� �ۼ�
	public void write(BoardVO boardVO) throws Exception;
	
	// ÷������ ���ε�
	public void insertFile(Map<String, Object> map) throws Exception;
	
	// �Խñ� ��� ���� ��ȸ
	public int countBoardList(Criteria criteria) throws Exception;
	
}
