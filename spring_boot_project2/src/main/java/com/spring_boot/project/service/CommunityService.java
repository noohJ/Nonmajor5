package com.spring_boot.project.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring_boot.project.dao.ICommunityDAO;
import com.spring_boot.project.model.CommunityPostsVO;

@Service
public class CommunityService implements ICommunityService {
	@Autowired
	@Qualifier("ICommunityDAO")
	ICommunityDAO dao;
	
	@Override
	public void insertWrite(CommunityPostsVO vo) {
		dao.insertWrite(vo);
	}
	
	@Override
	public ArrayList<CommunityPostsVO> wirteList(String comuCateId) {
		return dao.wirteList(comuCateId);
	}
	@Override
	public CommunityPostsVO comRead(String postNo) {
		return dao.comRead(postNo);
	}


}
