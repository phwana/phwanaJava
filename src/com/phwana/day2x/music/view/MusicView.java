package com.phwana.day2x.music.view;

import java.util.List;
import java.util.Scanner;

import com.phwana.day2x.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);

	public int mainMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 정보수정");
		System.out.println("6. 특정 곡 삭제");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.println("메뉴 선택 >>");
		int choice = sc.nextInt();
//		sc.close();
		return choice;
	}
	//Todo 메인 출력 메소드
	
	//Todo 곡명, 가수명 입력받는 메소드
	
	public Music inputMusic() {
		sc.nextLine();	//개행제거★
		System.out.println("곡명: ");
		String title = sc.nextLine();
		System.out.println("가수명: ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	}

	public void printMusicInfo(List<Music> mList) {
		System.out.println("=== === 음악 정보 출력 === ===");
		for(Music music: mList) {
			System.out.printf("\t곡 : %s\n", music.getTitle());
			System.out.printf("\t가수 : %s\n", music.getSinger());
			System.out.println("==============================");
		}
	}
	//메시지 출력
	public void printMsg(String msg) {
		System.out.println(msg);
		
	}
	
	public String inputTitle(String category){
		sc.nextLine();	//개행제거★
		System.out.println(category+"할 곡명: ");
		String title = sc.nextLine();
		return null;//??
	}
	
	//전체 음악 정보 출력(메소드 오버로딩)
	public void printMusicInfo(Music music) {
		System.out.println("=== === 음악 정보 출력 === ===");
		System.out.printf("\t곡 : %s\n", music.getTitle());
		System.out.printf("\t가수 : %s\n", music.getSinger());
		System.out.println("==============================");
	}


	//수정할 정보 입력
	public Music modifyMusic(Music music) {
		System.out.println("=== === 수정할 정보 입력 === ===");
		System.out.println("곡명 : ");
		String title = sc.nextLine();
		System.out.println("가수명 : ");
		String singer = sc.nextLine();
		music = new Music(title, singer);
		return music;
	}
		
	}
