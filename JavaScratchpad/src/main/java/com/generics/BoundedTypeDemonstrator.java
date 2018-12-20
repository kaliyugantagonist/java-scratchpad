package com.generics;

/**
 * A bounded type demonstrator.
 * 
 * Consider the following scenarios: 1) The generic types need to be of a
 * particular type, say, Number because the class performs mathematical,
 * numerical operations 2) One or more type parameters are
 * compatible(Comparable???)
 * 
 * The generic syntax:
 * 
 * 1: class class-name<T extends superclass-name>{
 * 
 * } 2: class class-name<T, V extends T>{
 * 
 * }
 * 
 * @author p950ojb
 *
 */

public class BoundedTypeDemonstrator {

	/*
	 * Remove the 'extends Number' and check if the methods getReciprocal() and
	 * getFraction() compile
	 */
	public class NumericCalculator<T extends Number> {
		private T number;

		public NumericCalculator(T number) {
			this.number = number;
		}

		double getReciprocal() {
			return 1 / number.doubleValue();
		}

		double getFraction() {
			return number.doubleValue() - number.intValue();
		}
	}
}
