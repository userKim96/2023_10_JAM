package com.koreaIT.example.JAM.service;

import java.sql.Connection;
import java.util.Map;

import com.koreaIT.example.JAM.Member;
import com.koreaIT.example.JAM.dao.MemberDao;

public class MemberService {
	
	private MemberDao memberDao;
	
	public MemberService(Connection conn) {
		this.memberDao = new MemberDao(conn);
	}

	public boolean isLoginIdDup(String loginId) {
		return memberDao.isLoginIdDup(loginId);
	}

	public void doJoin(String loginId, String loginPw, String name) {
		memberDao.doJoin(loginId, loginPw, name);
	}

	public Member getMemberByLoginId(String loginId) {
		
		Map<String, Object> memberMap = memberDao.getMemberByLoginId(loginId);
		
		if (memberMap.isEmpty()) {
			return null;
		}
		
		return new Member(memberMap);
	}

}