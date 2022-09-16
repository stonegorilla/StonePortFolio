package com.ssafy.board.model.dto;

public class Board {
	private int idx;
	private String boardId;
	private String title;
	private String content;
	private int writerIdx;
	private String part;
	private String channelName;
	private String url;
	private String createTime;
	
	
//	public Board(String title, String writer, String content) {
//		super();
//		this.title = title;
//		this.writer = writer;
//		this.content = content;
//	}
	public Board() {
		
	}
	// 추가생성자는 이따가


	public int getIdx() {
		return idx;
	}


	public void setIdx(int idx) {
		this.idx = idx;
	}


	public String getBoardId() {
		return boardId;
	}


	public void setBoardId(String boardId) {
		this.boardId = boardId;
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


	public int getWriterIdx() {
		return writerIdx;
	}


	public void setWriterIdx(int writerIdx) {
		this.writerIdx = writerIdx;
	}


	public String getPart() {
		return part;
	}


	public void setPart(String part) {
		this.part = part;
	}


	public String getChannelName() {
		return channelName;
	}


	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getCreateTime() {
		return createTime;
	}


	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}


	@Override
	public String toString() {
		return "Board [idx=" + idx + ", boardId=" + boardId + ", title=" + title + ", content=" + content
				+ ", writerIdx=" + writerIdx + ", part=" + part + ", channelName=" + channelName + ", url=" + url
				+ ", createTime=" + createTime + "]";
	}
	
	
	
	
	
}
