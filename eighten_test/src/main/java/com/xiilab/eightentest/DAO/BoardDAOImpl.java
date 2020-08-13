package com.xiilab.eightentest.DAO;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.xiilab.eightentest.VO.BoardVO;
import com.xiilab.eightentest.VO.Criteria;

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
	public List<BoardVO> selectBoardList(Criteria criteria) throws Exception{
		
		return sqlSession.selectList(namespace+".selectBoardList", criteria);
	}
	
	// �Խñ� �� ��ȸ
	@Override
	public BoardVO readBoardContent(int post_idx) throws Exception{
		return sqlSession.selectOne(namespace+".readBoardContent", post_idx);
	}
	
	// �Խñ� �ۼ�
	@Override
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert(namespace+".insert",boardVO);
	}
	
	// ÷������ ���ε�
	@Override
	public void insertFile(Map<String, Object> map) throws Exception{
		
		sqlSession.insert(namespace+".insertFile",map);
	}
	
	// �Խñ� ��� ���� ��ȸ
	@Override
	public int countBoardList(Criteria criteria) throws Exception{
		return sqlSession.selectOne(namespace+".countBoardList",criteria);
	}
}
