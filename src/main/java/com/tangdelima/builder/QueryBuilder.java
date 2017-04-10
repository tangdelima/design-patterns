package com.tangdelima.builder;

/**
 * Builder Pattern<br/><br/>
 * 
 * Complex object creation separated<br/>
 * Creates a creation process in Directors.<br/>
 * Correct Builder to create object is defined and is given to directors that defines the process. 
 * 
 * @author andrei
 *
 */
public interface QueryBuilder {
	/**
	 * Defines the from clause of query.
	 * @param from String containing the from information.
	 * @return The query builder configured.
	 */
	public QueryBuilder from(String from);
	
	/**
	 * Defines the where clause of query.
	 * @param where String containing the where information.
	 * @return the query builder confiuged
	 */
	public QueryBuilder where(String where);
	
	/**
	 * @return The query created by this builder.
	 */
	public Query getQuery();
}
