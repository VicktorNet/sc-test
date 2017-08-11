package org.sc.app;

public class Track {

	String title="hello";
	String singer="woi!";

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
 title ="test";
 singer="test2";
		return "Track [title=" + title + ", singer=" + singer + "]";
	}

}
