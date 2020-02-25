package com.generics.schildt;

/**
 * Demonstrates that a non-generic class can have a generic constructor
 * 
 * @author kaliyugantagonist
 *
 */
public class GenericConstructorDemonstrator {

	public class Summation {

		private double sum = 0;

		<T extends Number> Summation(T number) {

			for (int i = 0; i <= number.intValue(); i++) {
				sum += i;
			}
		}

		double getSummation() {
			return sum;
		}
	}
}
