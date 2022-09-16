package com.ssafy.review.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.review.model.dto.Review;

public interface ReviewDao {
	
	// boardIdx에 해당하는 리뷰들 다 가지고 와라 
	public List<Review> selectAll(int boardIdx);
	
	// idx에 해당하는 리뷰 하나 가져오기 
	public Review selectOne(int idx);
	
	//리뷰 등록
	public void InsertReview(Review review) throws SQLException;
	
	// 리뷰 삭제
	public void deleteReview(int idx);
	
	// 리뷰 수정
	public void updateReview(Review review);
	
	// 리뷰 조회수 증가
	public void updateView(int id);
	
}
