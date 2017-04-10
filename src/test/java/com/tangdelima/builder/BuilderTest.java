package com.tangdelima.builder;

import org.junit.Test;

import junit.framework.Assert;

public class BuilderTest {
	
	@Test
	public void test1(){
		QueryBuilder builder = new MongoQueryBuilder();
		QueryDirector director = new QueryDirector(builder);
		Query query = director.build("Tabela", "condicao = true");
		
		Assert.assertTrue(query instanceof MongoQuery);
		Assert.assertNotNull(((MongoQuery)query).getFrom());
		Assert.assertNotNull(((MongoQuery)query).getWhere());
	}
	
	@Test
	public void test2(){
		QueryBuilder builder = new SqlQueryBuilder();
		QueryDirector director = new QueryDirector(builder);
		Query query = director.build("Tabela", "condicao = true");
		
		Assert.assertTrue(query instanceof SqlQuery);
		Assert.assertNotNull(((SqlQuery)query).getFrom());
		Assert.assertNotNull(((SqlQuery)query).getWhere());
	}
	
}
