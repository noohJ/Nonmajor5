package com.spring_boot.project.dao;

import java.util.ArrayList;

import com.spring_boot.project.model.CommunityPostsVO;

public interface ICommunityDAO {
	
	// 글 작성
	public void insertWrite(CommunityPostsVO vo);
	
	// 작성글 리스트 불러오기
	public ArrayList<CommunityPostsVO> wirteList(String comuCateId);
	
	// 글 하나 불러오기
	public CommunityPostsVO comRead(String postNo);
}
