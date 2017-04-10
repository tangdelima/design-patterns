package com.tangdelima.prototype;

/**
 * Prototype Pattern<br/><br/>
 * This interface shall grant the prototype pattern a way to work.<br/>
 * The clone method will be responsible to create other objects based on this one.<br/>
 * This way the objects created by implementations this interface
 * can be used as base objects for prototyping.
 * 
 * @author andrei
 *
 */
public interface Graphic {

	public Graphic clone();
	
}
