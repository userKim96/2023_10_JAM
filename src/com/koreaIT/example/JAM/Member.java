package com.koreaIT.example.JAM;

import java.time.LocalDateTime;
import java.util.Map;

public class Member {
	
	public int id;
	public LocalDateTime regDate;
	public LocalDateTime updateDate;
	public String name;
	public String loginId;
	public String loginpw;

	public Member(Map<String, Object> articleMap) {
		this.id = (int) articleMap.get("id");
		this.regDate = (LocalDateTime) articleMap.get("regDate");
		this.updateDate = (LocalDateTime) articleMap.get("updateDate");
		this.name = (String) articleMap.get("name");
		this.loginId = (String) articleMap.get("loginId");
		this.loginpw = (String) articleMap.get("loginpw");
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", regDate=" + regDate + ", updateDate=" + updateDate + ", name=" + name
				+ ", loginId=" + loginId + ", loginpw=" + loginpw +"]";
	}



}



