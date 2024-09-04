package com.spring_boot.project.service;

import java.util.HashMap;

import com.spring_boot.project.model.MemberVO;

public interface IMemberService {
	
	// 로그인 체크
	public String loginCheck(HashMap<String, Object> map);
	
	// 회원가입
	public void insertMember(MemberVO vo);
	
	// 관리자 확인
	public String managerCheck(String id);
	
	// 아이디 확인
	public String memIdCheck(String id);
	
	// 아이디 찾기
	public String memIdFind(String memName, String memEmail);
}
