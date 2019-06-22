package com.cmy.design.factory.func;


import com.cmy.design.factory.Benz;
import com.cmy.design.factory.Car;

public class BenzFactory implements Factory {

	@Override
	public Car getCar() {
		return new Benz();
	}

}
