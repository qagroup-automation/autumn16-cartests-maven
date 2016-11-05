package com.qagroup.lec2oop.enc;

/**
 * Represents a car in a one-dimentional Car Race game.
 * 
 * @author romanik-roma
 *
 */
public class Car {
	/**
	 * Controls the speed of this car. Intentionally made public to show how
	 * breaking the encapsulation principle may cause bugs.
	 */
	public int speed;

	/**
	 * Controls maximum speed value.
	 */
	private static final int MAX_SPEED = 140;

	/**
	 * Controls minimum speed value.
	 */
	private static final int MIN_SPEED = 0;

	/**
	 * Constructor.
	 */
	public Car() {
	}

	/**
	 * Controls the change of this car speed change. The parameter {@code value}
	 * represents the desired change in speed, but the real speed change depends
	 * on the car internals.
	 * 
	 * @param value
	 *            desired speed change
	 */
	public void increaseSpeedBy(int value) {
		int possibleFinalSpeed = this.speed + value;

		if (MAX_SPEED < possibleFinalSpeed) {
			this.speed = MAX_SPEED;
		} else if (MIN_SPEED > possibleFinalSpeed) {
			this.speed = MIN_SPEED;
		} else
			this.speed = possibleFinalSpeed;
	}

	/**
	 * Returns the current speed of this car
	 * 
	 * @return speed of this car
	 */
	public int getSpeed() {
		return this.speed;
	}

}
