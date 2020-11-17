package com.revature.beans;

public class Album {

	private int albumID;
	private String title;
	private int artistId;
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Album(int albumID, String title, int artistId) {
		super();
		this.albumID = albumID;
		this.title = title;
		this.artistId = artistId;
	}
	public int getAlbumID() {
		return albumID;
	}
	public void setAlbumID(int albumID) {
		this.albumID = albumID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	@Override
	public String toString() {
		return "Album [albumID=" + albumID + ", title=" + title + ", artistId=" + artistId + "]";
	}
	
	
}
