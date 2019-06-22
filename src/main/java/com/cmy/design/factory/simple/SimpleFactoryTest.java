package com.cmy.design.factory.simple;


import com.cmy.design.factory.Car;

public class SimpleFactoryTest {

	
	
	public static void main(String[] args) {
	
		//这边就是我们的消费者
		Car car = new SimpleFactory().getCar("Audi");
		System.out.println(car.getName());
		
	}
	
}
