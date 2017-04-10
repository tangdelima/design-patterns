package com.tangdelima.factory;

public class CarFactory extends TransportFactory {

	@Override
	public Transport create() {
		return new Car();
	}

}
