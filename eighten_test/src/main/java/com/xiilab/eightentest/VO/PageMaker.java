package com.xiilab.eightentest.VO;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageMaker {

	private int startPage; // ����
	private int endPage; // ��
	private int nowPage;
	
	private int totalCount; // �Խñ� ����
	
	private boolean prev;
	private boolean next;
	
	private int displayPageNum = 10; 
	
	private Criteria criteria; // page : ���� ������ ��ȣ  | perPageNum : �������� ������ �Խñ� ����
	
	private int tempStartPage;
	private int tempEndPage;
	
	
	private void calcData() {
		
//		// ���� ����ߴ� ���
//		endPage = (int) (Math.ceil(criteria.getPage() / (double) displayPageNum) * displayPageNum);
//		startPage = (endPage - displayPageNum) + 1;
//		
//		int tempEndPage = (int) (Math.ceil(totalCount/(double)criteria.getPerPageNum())); // 135���� �Խù��� �� 14���� ����¡�� ������.
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
	
	/* UriComponentsBilder, UriComponents : URI�� �ۼ��� �� ������ �ִ� Ŭ���� */
	public String makeQuery(int page) {
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.queryParam("page", page)
				.queryParam("pagePageNum", criteria.getPerPageNum())
				.build();
		
		return uriComponents.toUriString();
	}
				
	
	/* URL �� �ڵ����� ����  | makeSearch : �˻�����, �˻� Ű���� ó�� | encoding : �˻� Ű���� ���ڵ� ó�� */
	public String makeSearch(int page) {
		
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.queryParam("page", page)
				.queryParam("pagePageNum", criteria.getPerPageNum())
				.queryParam("searchType", ((SearchCriteria)criteria).getSearchType())
				.queryParam("keeyword", encoding(((SearchCriteria) criteria).getKeyword()))
				.build();
 		
		return uriComponents.toUriString();
	}
	
	private String encoding(String keyword) {
		
		if(keyword == null || keyword.trim().length() == 0) {
			return "";
		}
		
		try {
			return URLEncoder.encode(keyword,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
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
