package com.tangdelima.singleton;

/**
 * This class was implemented to validate how singleton works with inheritance.
 * 
 * @author andrei
 *
 */
public class ChildContext extends AppContext{
	
	/*
	 * Different message from parent.
	 */
	@Override
	public String getMessage(){
		return "Message from Child";
	}
	
}
