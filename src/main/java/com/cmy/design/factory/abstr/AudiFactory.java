package com.cmy.design.factory.abstr;


import com.cmy.design.factory.Audi;
import com.cmy.design.factory.Car;

//具体的业务逻辑封装
public class AudiFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}
