package com.tangdelima.prototype;

import org.junit.Test;

import junit.framework.Assert;

public class ProtorypeTest {

	private final String IMAGE_URL = "http://tangdelima.com";
	
	@Test
	public void createImageFromPrototype(){
		
		Image baseImage = new Image();
		baseImage.setUrl(IMAGE_URL);
		
		GraphicTool tool = new GraphicTool(baseImage);
		Graphic graphic = tool.createGraphic();
		
		Assert.assertTrue(graphic instanceof Image);
		Assert.assertEquals( IMAGE_URL, ((Image)graphic).getUrl() );
	}

	@Test
	public void createVideoFromPrototype(){
		
		Video baseVideo = new Video();
		baseVideo.setUrl(IMAGE_URL);
		
		GraphicTool tool = new GraphicTool(baseVideo);
		Graphic graphic = tool.createGraphic();
		
		Assert.assertTrue(graphic instanceof Video);
		Assert.assertEquals( IMAGE_URL, ((Video)graphic).getUrl() );
	}
	
}
