package com.tangdelima.abstractfactory;

import org.junit.Test;

import junit.framework.Assert;

public class AbstractFactoryTest {

	@Test
	public void createRedWidgets() {
		WidgetFactory factory = new RedWidgetFactory();
		Window window = factory.createWindow();
		ScrollBar scrollBar = factory.createScrollBar();
		
		Assert.assertTrue(window instanceof RedWindow);
		Assert.assertTrue(scrollBar instanceof RedScrollBar);
	}
	
	@Test
	public void createBlueWidgets() {
		WidgetFactory factory = new BlueWidgetFactory();
		Window window = factory.createWindow();
		ScrollBar scrollBar = factory.createScrollBar();
		
		Assert.assertTrue(window instanceof BlueWindow);
		Assert.assertTrue(scrollBar instanceof BlueScrollBar);
	}
	
}
