package com.tangdelima.factory;

import org.junit.Test;

import junit.framework.Assert;

public class FactoryTest {

	private TransportFactory factory;
	
	@Test
	public void shouldCreateACar(){
		factory = new CarFactory();
		Transport car = factory.create();
		
		Assert.assertTrue(car instanceof Car);
	}

	@Test
	public void shouldCreateABus(){
		factory = new BusFactory();
		Transport bus = factory.create();
		
		Assert.assertTrue(bus instanceof Bus);
	}
	
	@Test
	public void shouldCreateWhateverItReceives(){
		// Transport implementation decided at runtime.
		final double random = Math.random(); 
		TransportFactory factory = ( random % 2 == 0 ? new CarFactory() 
													 : new BusFactory());
		Transport transport = factory.create();
		
		Assert.assertTrue(transport instanceof Transport);
	}
	
}
