package com.sbs.example.demo.dto;

import java.util.Map;

public class Article extends Dto {
	private int boardId;
	private int memberId;
	private String title;
	private String body;
	private int view;

	public Article() {

	}

	public Article(int boardId, int memberId, String title, String body, int view) {
		this.boardId = boardId;
		this.memberId = memberId;
		this.title = title;
		this.body = body;
		this.view = view;
	}

	public Article(Map<String, Object> row) {
		super((int) row.get("id"), (String) row.get("regDate"));
		this.title = (String) row.get("title");
		this.body = (String) row.get("body");
		this.memberId = (int) row.get("memberId");
		this.boardId = (int) row.get("boardId");
		this.view = (int) row.get("view");
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Article [boardId=" + boardId + ", memberId=" + memberId + ", title=" + title + ", body=" + body
				+ ", view=" + view + ", getId()=" + getId() + ", getRegDate()=" + getRegDate() + "]";
	}

	

}