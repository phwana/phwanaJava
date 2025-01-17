package com.phwana.jdbc.day03.pstmt.member.controller.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.phwana.jdbc.day03.pstmt.common.JDBCTemplate;
import com.phwana.jdbc.day03.pstmt.member.controller.model.dao.MemberDAO;
import com.phwana.jdbc.day03.pstmt.member.controller.model.vo.Member;

public class MemberService {
		private JDBCTemplate jdbcTemplate;//연결을 자신이 하는것이 아니고 템플릿에 부탁
		private MemberDAO mDao;
		
		public MemberService() {
			jdbcTemplate = JDBCTemplate.getInstance();//객체를 한번만 만듦
			//뉴가 여러개가 아닌데 어떻게 여러개 객체?->쓰레드 등 이용해서 가능
			mDao = new MemberDAO();
		}
		
		public int insertMember(Member member) {
			int result = 0;
			Connection conn = null;
			
			try {
				conn = jdbcTemplate.getConnection();
				result = mDao.insertMember(conn, member);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return result;
	}

		public int deleteMember(String memberId) {
			int result = 0;
			Connection conn = null;
			
			try {
				conn = jdbcTemplate.getConnection();
				result = mDao.deleteMember(conn, memberId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			return result;
		}

		public int updateMember(Member member) {
			int result = 0;
			Connection conn = null;
			result = mDao.updateMember(conn, member);
			try {
				conn = jdbcTemplate.getConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return result;
		}
		
		public List<Member> selectList() {
			Connection conn = null;
			List<Member> mList = null;
			try {
				conn = jdbcTemplate.getConnection();
				mList = mDao.selectList(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return mList;
		}

		public Member selectOneById(String memberId) {
			Connection conn = null;
			Member member = null;
			
			try {
				conn = jdbcTemplate.getConnection();
				member = mDao.selectOneById(conn, memberId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return member;
		}


}
