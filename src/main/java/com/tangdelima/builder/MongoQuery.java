package com.tangdelima.builder;

public class MongoQuery implements Query{
	
	private String from;
	
	private String where;
	
	public String getFrom(){
		return this.from;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}

	public String getWhere(){
		return this.where;
	}
	
	public void setWhere(String where) {
		this.where = where;
	}
	
	public void execute(){
		StringBuilder queryString = new StringBuilder();
		queryString
			.append("Executin MongoQuery: 'from ").append(this.from)
			.append(" where ").append(where)
			.append("'");
		System.out.println(queryString.toString());
	}
}
