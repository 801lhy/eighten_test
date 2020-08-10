package com.xiilab.eightentest.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.xiilab.eightentest.VO.BoardVO;

@Repository // @Repository �� DAO�� ���������� �νĽ����ش�.
public class BoardDAOImpl implements BoardDAO {
	
	private static final String namespace = "com.xiilab.eightentest.boardMapper";

	@Inject
	private SqlSession sqlSession;
	
	
	@Override
	public List<BoardVO> selectBoard() throws Exception{
		
		return sqlSession.selectList(namespace+".selectBoard");

	}
	
	// ���� �Խñ� ��� ��ȸ
	@Override
	public List<BoardVO> selectBoardList() throws Exception{
		return sqlSession.selectList(namespace+".selectBoardList");
	}
	
	// �Խñ� �� ��ȸ
	@Override
	public BoardVO readBoardContent(int post_idx) throws Exception{
		return sqlSession.selectOne(namespace+".readBoardContent", post_idx);
	}
}
