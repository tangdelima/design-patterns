package com.tangdelima.factory;

/**
 * Factory Pattern<br/><br/>
 * 
 * Delegate the creation of a object to this Factory.<br/>
 * Important when it not possible to identify which implementation of an interface 
 * should be used in for the developer.<br/>
 * 
 * 
 * @author andrei
 *
 */
public abstract class TransportFactory {
	
	/**
	 * @return A Transport created by the factory.
	 */
	public abstract Transport create();
}
