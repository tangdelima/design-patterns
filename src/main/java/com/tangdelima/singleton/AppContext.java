package com.tangdelima.singleton;

/**
 * Singleton Pattern
 * <br/><br/>
 * - Only one instance of the object is accepted.<br/>
 * - Instance can be shared between threads.<br/>
 * - Unique instance guaranteed by a private static variable and obtained by a public getInstance method.
 * 
 * @author andrei
 */
public class AppContext {
	
	private static AppContext instance = null;
	
	private static synchronized void createInstance(){
		if(instance == null) instance = new AppContext();
	}
	
	/**
	 * @return The unique instance of this Singleton.
	 */
	public static AppContext getInstance(){
		if ( instance == null ) createInstance();
		return instance;
	}
	
	/**
	 * @return A String containing "Message from Singleton"
	 */
	public String getMessage(){
		return "Message from Singleton";
	}

}
