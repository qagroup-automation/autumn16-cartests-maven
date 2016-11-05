package com.qagroup.lec2oop.enc;

/**
 * Represents a logic layer for a one-dimendional Car Race game.
 * 
 * @author romanik-roma
 *
 */
public class CarRaceController {

	/**
	 * Increases the {@code car} speed by {@code speedIncrease}
	 * 
	 * @param car
	 * @param speedIncrease
	 */
	public static void increaseCarSpeed(Car car, int speedIncrease) {
		// We have broken encapsulation in Car class, so someone has taken
		// advantage of it :-)
		car.speed = car.speed + speedIncrease;

		// The correct code should be
		// car.increaseSpeedBy(speedIncrease);
	}
}
