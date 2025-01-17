package com.phwana.jdbc.day03.pstmt.member.controller.run;

import com.phwana.jdbc.day03.pstmt.common.Singleton;
import com.phwana.jdbc.day03.pstmt.member.controller.view.MemberView;

public class Run {

	public static void main(String[] args) {
		MemberView view = new MemberView();
		view.startProgram();
		Singleton singleton = Singleton.getInstance(); //new Singleton();
	}

}
