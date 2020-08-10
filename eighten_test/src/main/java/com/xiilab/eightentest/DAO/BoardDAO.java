package com.xiilab.eightentest.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xiilab.eightentest.VO.BoardVO;

// 2. DOA 인터페이스 작성
// 테이블 및 도메인 클래스 구성후 에 실제로 행해야 하는 작업을 인터페이스로 정의한다.
// 실제로 향후 데이터베이스 관련 기술이 변경되어도, DAO 만 변경해서 처리할수 있다.
@Repository
public interface BoardDAO {
	
	public List<BoardVO> selectBoard() throws Exception;

	// 공지 게시글 목록 조회
	public List<BoardVO> selectBoardList() throws Exception;
	
	// 게시글 상세 조회
	public BoardVO readBoardContent(int post_idx) throws Exception;
	
}
