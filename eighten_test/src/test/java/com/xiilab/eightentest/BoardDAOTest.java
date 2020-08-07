package com.xiilab.eightentest;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xiilab.eightentest.DAO.BoardDAO;
import com.xiilab.eightentest.VO.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/*.xml" })
public class BoardDAOTest {
	
	@Inject
	private BoardDAO dao;

//	@Test
//	public void testTime() throws Exception {
//		System.out.println("현재 시간 : " + dao.getTime());
//	}

	@Test
	public void testInsertMember() throws Exception {
		BoardVO vo = new BoardVO();

		Date d = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		vo.setPost_type(0);
		vo.setPost_idx(1);
		vo.setViews(0);
		vo.setPost_title("test");
		vo.setPost_writer("현영");
		vo.setPost_date(d);
		vo.setPost_content("가나다라마바사abcdefg");
		vo.setFile_path("D:\\");
		vo.setFile_name("clear.jpg");
		
//		dao.insertBoard(vo);
	}

}
