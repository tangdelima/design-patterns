package com.tangdelima.factory;

public class BusFactory extends TransportFactory {

	@Override
	public Transport create() {
		return new Bus();
	}

}
