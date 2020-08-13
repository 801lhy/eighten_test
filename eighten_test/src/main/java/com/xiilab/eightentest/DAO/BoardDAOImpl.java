package com.xiilab.eightentest.DAO;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.xiilab.eightentest.VO.BoardVO;
import com.xiilab.eightentest.VO.Criteria;

@Repository // @Repository 는 DAO를 스프링으로 인식시켜준다.
public class BoardDAOImpl implements BoardDAO {
	
	private static final String namespace = "com.xiilab.eightentest.boardMapper";

	@Inject
	private SqlSession sqlSession;
	
	
	@Override
	public List<BoardVO> selectBoard() throws Exception{
		
		return sqlSession.selectList(namespace+".selectBoard");

	}
	// 공지 게시글 목록 조회
	@Override
	public List<BoardVO> selectBoardList(Criteria criteria) throws Exception{
		
		return sqlSession.selectList(namespace+".selectBoardList", criteria);
	}
	
	// 게시글 상세 조회
	@Override
	public BoardVO readBoardContent(int post_idx) throws Exception{
		return sqlSession.selectOne(namespace+".readBoardContent", post_idx);
	}
	
	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert(namespace+".insert",boardVO);
	}
	
	// 첨부파일 업로드
	@Override
	public void insertFile(Map<String, Object> map) throws Exception{
		
		sqlSession.insert(namespace+".insertFile",map);
	}
	
	// 게시글 목록 갯수 조회
	@Override
	public int countBoardList(Criteria criteria) throws Exception{
		return sqlSession.selectOne(namespace+".countBoardList",criteria);
	}
}
