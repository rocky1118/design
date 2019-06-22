package com.cmy.design.factory.abstr;


import com.cmy.design.factory.Benz;
import com.cmy.design.factory.Car;

public class BenzFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Benz();
	}

}
