package com.tangdelima.prototype;

public class Video extends Image {	
	
	public Video clone() {
		Video clone = new Video();
		clone.setUrl(super.url);
		
		return clone;
	}
	
}
