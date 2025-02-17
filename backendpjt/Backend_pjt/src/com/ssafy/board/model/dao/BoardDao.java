package com.ssafy.board.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.board.model.dto.Board;

public interface BoardDao {
	// 전체 게시글을 몽땅 들고 오세용
	public List<Board> selectAll();
	
	// id에 해당하는 게시글 하나 가져오기
	public Board selectOne(int id) ;
	// 게시글 등록
	public void InsertBoard(Board board) throws SQLException;
	// 게시글 삭제
	public void deleteBoard(int id);
	
	// 게시글 수정
	public void updateBoard(Board board);
	

}
