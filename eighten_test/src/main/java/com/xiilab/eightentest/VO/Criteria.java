package com.xiilab.eightentest.VO;

public class Criteria {
	
	private int page;		// 현재 페이지 번호
	private int perPageNum;	// 페이지당 보여줄 게시글의 갯수
	
	private String searchType; // 검색 종류
	private String keyword; // 검색 키워드
	
	
	
	// 게시글 시작행 번호
	public int getPageStart() {
		return(this.page-1)*perPageNum; // 3페이지는 20부터 시작한다.
	}
	
	public Criteria() {
		this.page= 1 ;
		this.perPageNum = 10;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		if(page <= 0) {
			this.page = 1;
		}else {
			this.page = page;
		}
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int pageCount) {
		int cnt = this.perPageNum;
		if(pageCount!=cnt) {
			this.perPageNum = cnt;
		} else {
			this.perPageNum = pageCount;
		}
	}

	// Search
	
	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
	

}
