package com.qagroup.lec2oop.enc;

public class ExampleRunner2 {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.getSpeed());

		car.increaseSpeedBy(90);
		System.out.println(car.getSpeed());

		car.increaseSpeedBy(90);
		System.out.println(car.getSpeed());

		car.increaseSpeedBy(90);
		System.out.println(car.getSpeed());

		car.increaseSpeedBy(160);
		System.out.println(car.getSpeed());
	}
}
