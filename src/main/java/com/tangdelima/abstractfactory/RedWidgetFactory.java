package com.tangdelima.abstractfactory;

public class RedWidgetFactory implements WidgetFactory {

	public Window createWindow() {
		return new RedWindow();
	}

	public ScrollBar createScrollBar() {
		return new RedScrollBar();
	}

}
