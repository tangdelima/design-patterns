package com.tangdelima.builder;

public class SqlQueryBuilder implements QueryBuilder{
	
	private SqlQuery query = new SqlQuery();
	
	public QueryBuilder from(String from){
		query.setFrom(from);
		return this;
	}
	
	public QueryBuilder where(String where){
		query.setWhere(where);
		return this;
	}
	
	public Query getQuery(){
		return this.query;
	}

}
