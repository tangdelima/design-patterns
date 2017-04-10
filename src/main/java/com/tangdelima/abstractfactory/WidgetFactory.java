package com.tangdelima.abstractfactory;

/**
 * Allow the criation of Family of classes.<br/>
 * Family of a class: Classes which are externally related(By the architecture, 
 * but not necessarily interdependents.)<br/>
 * Loose coupling<br/>
 * <b>Disvantages</b><br/>
 * When a new member enters the family all concrete factories 
 * must be updated. 
 * 
 * @author andrei
 *
 */
public interface WidgetFactory {
	
	public Window createWindow();
	public ScrollBar createScrollBar();
	
}
