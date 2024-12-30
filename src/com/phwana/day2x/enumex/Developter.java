package com.phwana.day2x.enumex;

enum DevelType{//(3)
	MOBILE, WEB, SERVER, FULLSTACK, FRONTEND, BACKEND
}

public class Developter {
	private String name;
	private long salary;
//	private DeveloperType type;
	private enum DevType{//(2)
		MOBILE, FREONTEND, BACKEDN
	}

}
