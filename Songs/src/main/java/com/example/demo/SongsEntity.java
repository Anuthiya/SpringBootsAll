package com.example.demo;

public class SongsEntity {
	private String songName;
	private String singer;
	private String musicDirector;
	
	public void setSongName(String songName) {
		this.songName=songName;
	}
	public void setSinger(String singer) {
		this.singer=singer;
	}
	public void setMusicDirector(String musicDirector) {
		this.musicDirector=musicDirector;
	}
	public String getSongName() {
		return songName;
	}
	public String getSinger() {
		return singer;
	}
	public String getMusicDirector() {
		return musicDirector;
		
	}

}
