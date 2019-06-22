package com.cmy.design.factory.func;


import com.cmy.design.factory.Audi;
import com.cmy.design.factory.Car;

public class AudiFactory implements Factory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}
