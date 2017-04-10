package com.tangdelima.prototype;

/**
 * Prototype Pattern<br/>
 * Creates an expected object by cloning a base object.<br/>
 * Base object should be given to the constructor of this Class. But can be changed later by a setter method.<br/>
 * Just like a factory does, this class must have a method that will return the created object.<br/>
 * This is a manner to the architect define the object creation in way that users of the framework 
 * have a bigger control of the creation of objects, by giving the base object, without having access or control 
 * of the creation process.<br/>
 * <b>Disvantages</b><br/>
 * Creating the base object can be expensive or inefficient.
 *  
 * @author andrei
 *
 */
public class GraphicTool {
	
	private Graphic prototype;
	
	/**
	 * @param basePrototype Base object to be used as prototype.
	 * This object will be used to create other objects.
	 * 
	 */
	public GraphicTool(Graphic basePrototype){
		this.prototype = basePrototype;
	}
	
	/**
	 * @return new object created as a clone of the prototype.
	 */
	public Graphic createGraphic(){
		return this.prototype.clone();
	}
	
}
