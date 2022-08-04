package com.board.domain;

import java.sql.Date;

public class BoardVO {

	
//	CREATE TABLE `tbl_board` (
//			  `bno` int NOT NULL,
//			  `title` varchar(50) NOT NULL,
//			  `content` text NOT NULL,
//			  `writer` varchar(30) NOT NULL,
//			  `ragDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
//			  `viewCnt` int DEFAULT '0',
//			  PRIMARY KEY (`bno`)
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	private int viewCnt;
	
	
	
	
	
	
}
