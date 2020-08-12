package com.xiilab.eightentest.VO;


public class PageMaker {

	private int startPage; // 시작
	private int endPage; // 끝
	
	private int totalCount; // 게시글 갯수
	
	private boolean prev;
	private boolean next;
	
	private int displayPageNum = 10; 
	
	private Criteria criteria; // page : 현재 페이지 번호  | perPageNum : 페이지당 보여줄 게시글 갯수
	
	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}

	public Criteria getCriteria() {
		return criteria;
	}
	
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcData();
	}
	
	private void calcData() {
		
		 endPage = (int) (Math.ceil(criteria.getPage() / (double) displayPageNum) * displayPageNum);
		 startPage = (endPage - displayPageNum) + 1;
		
//		endPage = critera.getPage() + 4;
//		startPage = critera.getPage() -4;
		
		
		int tempEndPage = (int) (Math.ceil(totalCount/(double)criteria.getPerPageNum())); // 135개의 게시물을 총 14개의 페이징을 가진다.
		
//		if(startPage<=0) startPage = 1;
		if(endPage > tempEndPage ) endPage = tempEndPage;
		
		setPrev(startPage == 1 ? false:true);
		setNext(endPage * criteria.getPerPageNum() >= totalCount ? false:true);
		
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getDisplayPageNum() {
		return displayPageNum;
	}

	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}

	public int getTotalCount() {
		return totalCount;
	}

	
}
