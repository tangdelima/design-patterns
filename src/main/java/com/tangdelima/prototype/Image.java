package com.tangdelima.prototype;

public class Image implements Graphic {

	protected String url;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Image clone() {
		Image clone = new Image();
		clone.setUrl(this.url);
		
		return clone;
	}

}
