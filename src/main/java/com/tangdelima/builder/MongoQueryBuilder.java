package com.tangdelima.builder;

public class MongoQueryBuilder implements QueryBuilder{
	
	private MongoQuery query = new MongoQuery();
	
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
