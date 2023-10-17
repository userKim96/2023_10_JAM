package com.koreaIT.example.JAM.session;

import com.koreaIT.example.JAM.Member;

public class Session {
	
	public static int loginedMemberId;
	public static Member loginedMember;
	
	static {
		loginedMember = null;
		loginedMemberId = -1;
	}
	
	public static void login(Member member) {
		loginedMemberId = member.id;
		loginedMember = member;
	}
	
	public static void logout() {
		loginedMember = null;
		loginedMemberId = -1;
	}
	
	public static boolean isLogined() {
		return loginedMemberId != -1;
	}
}