package com.tangdelima.builder;

public class QueryDirector {
	
	private QueryBuilder builder;
	
	public QueryDirector(QueryBuilder builder) {
		this.builder = builder;
	}
	
	public Query build(String from, String where){
		return builder.from(from)
					  .where(where)
					  .getQuery();
	}
}
