package com.tangdelima.abstractfactory;

public class BlueWidgetFactory implements WidgetFactory {

	public Window createWindow() {
		return new BlueWindow();
	}

	public ScrollBar createScrollBar() {
		return new BlueScrollBar();
	}

}
