package com.cmy.design.factory.abstr;


import com.cmy.design.factory.Car;

public class DefaultFactory extends AbstractFactory {

	private AudiFactory defaultFactory = new AudiFactory();
	
	public Car getCar() {
		return defaultFactory.getCar();
	}

}
