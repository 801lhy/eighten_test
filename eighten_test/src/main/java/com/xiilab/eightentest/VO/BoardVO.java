package com.xiilab.eightentest.VO;

import java.util.Date;

// 1. 도메인 객체 및 클래스 설계
public class BoardVO {
	private int post_type;
	private int post_idx;
	private int views;
	private String post_title;
	private String post_writer;
	private Date post_date;
	private String post_content;
	private String file_path;
	private String file_name;
	public int getPost_type() {
		return post_type;
	}
	public void setPost_type(int post_type) {
		this.post_type = post_type;
	}
	public int getPost_idx() {
		return post_idx;
	}
	public void setPost_idx(int post_idx) {
		this.post_idx = post_idx;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getPost_title() {
		return post_title;
	}
	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}
	public String getPost_writer() {
		return post_writer;
	}
	public void setPost_writer(String post_writer) {
		this.post_writer = post_writer;
	}
	public Date getPost_date() {
		return post_date;
	}
	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}
	public String getPost_content() {
		return post_content;
	}
	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}
	public String getFile_path() {
		return file_path;
	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	
	
	
}
