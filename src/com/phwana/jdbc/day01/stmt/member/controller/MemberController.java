package com.phwana.jdbc.day01.stmt.member.controller;

import java.util.List;

import com.phwana.jdbc.day01.stmt.member.model.dao.MemberDAO;
import com.phwana.jdbc.day01.stmt.member.model.vo.Member;

public class MemberController {
	
	private MemberDAO mDao;
	
	public MemberController() {
		mDao = new MemberDAO();
	}

	public Member findOneById(String memberId) {
		Member member = mDao.selectOneById(memberId);
		return member;
	}
	public List<Member> showMemberList() {
		List<Member> mList = mDao.selectList();
		return mList;
	}

	public int registerMember(Member member) {
		int result = mDao.insertMember(member);
		return result;
	}



	
	

}
