package com.phwana.jdbc.day03.pstmt.member.controller.controller;

import java.util.List;

import com.phwana.jdbc.day03.pstmt.member.controller.model.dao.MemberDAO;
import com.phwana.jdbc.day03.pstmt.member.controller.model.service.MemberService;
import com.phwana.jdbc.day03.pstmt.member.controller.model.vo.Member;

public class MemberController {

//	private MemberDAO mDao;
	private MemberService mService;

	public MemberController() {
//		mDao = new MemberDAO();
		mService = new MemberService();
	}
	// 회원가입
	public int insertMember(Member member) {
//		int result = mDao.insertMember(member);
		int result = mService.insertMember(member);
		// return result를 해서 view로 결과값을 보내줌
		return result;
	}
	public int deleteMember(String memberId) {
		int result = mService.deleteMember(memberId);
		return result;
	}
	// 회원 전체 정보 조회
	public List<Member> selectList() {
		List<Member> mList = mService.selectList();
		// View에서 mList를 사용할 수 있도록 리턴해줌
		return mList;
	}
	// 회원 아이디로 검색
	public Member selectOneById(String memberId) {
		// SELECT * FROM MEMBER_TBL WHERE MEMBER_ID = 'memberId';
		Member member = mService.selectOneById(memberId);
		// member를 View에서 사용할 수 있도록 리턴해줌
		return member;
	}
	public int updateMember(Member member) {
		int result = mService.updateMember(member);
		return result;
	}

}