package com.xiilab.eightentest.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xiilab.eightentest.VO.BoardVO;

// 2. DOA �������̽� �ۼ�
// ���̺� �� ������ Ŭ���� ������ �� ������ ���ؾ� �ϴ� �۾��� �������̽��� �����Ѵ�.
// ������ ���� �����ͺ��̽� ���� ����� ����Ǿ, DAO �� �����ؼ� ó���Ҽ� �ִ�.
@Repository
public interface BoardDAO {
	
	public List<BoardVO> selectBoard() throws Exception;

}