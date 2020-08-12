package com.xiilab.eightentest.VO;

public class Criteria {
	
	private int page;		// ���� ������ ��ȣ
	private int perPageNum;	// �������� ������ �Խñ��� ����	
	
	// �Խñ� ������ ��ȣ
	public int getPageStart() {
		return(this.page-1)*perPageNum; // 3�������� 20���� �����Ѵ�.
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
	
	
	

}
