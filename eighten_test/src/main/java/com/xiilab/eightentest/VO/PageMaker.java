package com.xiilab.eightentest.VO;


public class PageMaker {

	private int startPage; // 시작
	private int endPage; // 끝
	private int nowPage;
	
	private int totalCount; // 게시글 갯수
	
	private boolean prev;
	private boolean next;
	
	private int displayPageNum = 10; 
	
	private Criteria criteria; // page : 현재 페이지 번호  | perPageNum : 페이지당 보여줄 게시글 갯수
	
	private int tempStartPage;
	private int tempEndPage;
	
	
	private void calcData() {
		
//		// 원래 사용했던 방식
//		endPage = (int) (Math.ceil(criteria.getPage() / (double) displayPageNum) * displayPageNum);
//		startPage = (endPage - displayPageNum) + 1;
//		
//		int tempEndPage = (int) (Math.ceil(totalCount/(double)criteria.getPerPageNum())); // 135개의 게시물을 총 14개의 페이징을 가진다.
//		
//		if(endPage > tempEndPage ) endPage = tempEndPage;
//		
//		setPrev(startPage == 1 ? false:true);
//		setNext(endPage * criteria.getPerPageNum() >= totalCount ? false:true);

		nowPage = criteria.getPage();
		startPage = nowPage - 4;
		endPage = nowPage + 4;
		
		tempStartPage = 1;
		tempEndPage = (int) (Math.ceil(totalCount/(double)criteria.getPerPageNum()));
		
		setPrev(true);
		setNext(true);
		
		if(startPage <= tempStartPage ) {
			startPage = tempStartPage;
			setPrev(false);
		}
		
		if(endPage >= tempEndPage ) {
			endPage = tempEndPage;
			setNext(false);
		}
		
	}
	
	// Criteria ================================
	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}
	
	public Criteria getCriteria() {
		return criteria;
	}
	
	// TotalCount ================================
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcData();
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	
	// Prev ================================
	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	// Next ================================
	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	// StartPage ================================
	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	// EndPage ================================
	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	// DisplayPageNum ================================
	public int getDisplayPageNum() {
		return displayPageNum;
	}

	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}
	
	// tempStartPage ================================
	public int getTempStartPage() {
		return tempStartPage;
	}

	public void setTempStartPage(int tempStartPage) {
		this.tempStartPage = tempStartPage;
	}

	// tempEndPage ================================
	public int getTempEndPage() {
		return tempEndPage;
	}

	public void setTempEndPage(int tempEndPage) {
		this.tempEndPage = tempEndPage;
	}

	// NowPage ================================
	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	

	
}
