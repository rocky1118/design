package com.cmy.design.factory.func;


import com.cmy.design.factory.Bmw;
import com.cmy.design.factory.Car;

public class BmwFactory implements Factory {

	@Override
	public Car getCar() {
		return new Bmw();
	}

}
