package com.spring_boot.project.service;

import java.util.ArrayList;

import com.spring_boot.project.model.CommunityPostsVO;
import com.spring_boot.project.model.ProductVO;
import com.spring_boot.project.model.SubCategoryVO;

public interface IProductService {
	// 카테고리 상품 조회 
	public ArrayList<ProductVO> ctgListProduct(String mcId);
	
	// 서브 카테고리 
	public ArrayList<SubCategoryVO> subList(String mcId);
	
	// 상품번호 중복체크
	public String prdNoCheck(String prdNo);
	
	// 상품 추가
	public void insertProduct(ProductVO vo);
	
	// 상품 상세 정보
	public ProductVO prdInfoView(String prdNo);
	
	// 상품 리뷰 찾기
	public ArrayList<CommunityPostsVO> prdReviewList(String prdNo);
	
	// 랜덤 상품 출력
	public ArrayList<ProductVO> randomPrdList(String prdNo);
	
	// 상품 상세 정보 변경
	public void changeProduct(ProductVO vo);
	
	// 상품 삭제
	public void productDelete(String prdNo);
	
	// 베스트 상품
	public ArrayList<ProductVO> bestPrdList();
	
	// 새로운 상품
	public ArrayList<ProductVO> newPrdList();
}
