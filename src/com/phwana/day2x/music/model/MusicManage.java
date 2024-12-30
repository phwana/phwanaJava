package com.phwana.day2x.music.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.phwana.day2x.music.model.vo.AscSinger;
import com.phwana.day2x.music.model.vo.DescSinger;
import com.phwana.day2x.music.model.vo.DescTitle;
import com.phwana.day2x.music.model.vo.Music;

public class MusicManage {
	//Todo 데이터의 최종 저장소가 존재
	List<Music> mList;
	
	public MusicManage() {
		this.mList = new ArrayList<Music>();
	}
	//마지막 위치에 음악 등록
	public void registerMusic(Music music) {
		mList.add(music);
	}
	//첫 위치에 음악 등록
	public void registerMusicAtFirst(Music music) {
		mList.add(0, music);//첫 위치 우선예약이라 0(1아님)
	}
	//곡 정보 수정
	public void modifyMusic(int index, Music music) {
		mList.set(index, music);
	}
		
	//객체를 넘겨받아 mList에서 제거(삭제 기능)
	public void deleteMusic(Music music) {
//		mList.set(0, music);
		mList.remove(music);	
	}
	
	//모든 음악 가져오기
	public List<Music> getAllMusic() {
		return mList;
	}
		
	//곡명으로 음악 찾기
	public Music searchMusicByTitle(String title) {
		if(!"".equals(title)&& title != null) {
			for(Music music: mList) {
				if(title.equals(music.getTitle())) {
					return music;
				}
			}
		}
		return null;
	}
	//곡명으로 인덱스 값 찾기(수정에서 사용됨)
	public int searchIndexByTitle(String title) {
		if(!"".equals(title)&& title != null) {
			for(int i = 0; i< mList.size(); i++) {
				if(title.equals(mList.get(i).getTitle())) {
				return i;
				}
			}
		}
	return -1;
	}
	public void sortByTitleASC() {
		/*
		 * 정렬하는 방법
		 * 1.알고리즘 사용하기
		 * 2.Collections 클래스 사용하기
		 */
		Collections.sort(mList);
		
	}
	public void sortByTitleDESC() {
		Collections.sort(mList, new DescTitle());
		
	}
	public void sortBySingerASC() {
		Collections.sort(mList, new AscSinger());
		
	}
	public void sortBySingerDESC() {
		Collections.sort(mList, new DescSinger());
		
	}
	
	
}
