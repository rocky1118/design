package com.cmy.design.factory.abstr;


import com.cmy.design.factory.Bmw;
import com.cmy.design.factory.Car;

public class BmwFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Bmw();
	}

}
