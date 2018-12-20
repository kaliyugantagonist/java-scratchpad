package com.generics;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoundedTypeDemonstratorTester {

	private static Logger logger = LoggerFactory.getLogger(BoundedTypeDemonstratorTester.class);

	/* Add assert statements if deemed necessary. */
	@Test
	public void test() {
		BoundedTypeDemonstrator boundedTypeDemonstrator = new BoundedTypeDemonstrator();

		/* Compiles as Integer IS-A Number */
		BoundedTypeDemonstrator.NumericCalculator<Integer> integerCalculator = boundedTypeDemonstrator.new NumericCalculator<Integer>(
				50);
		logger.debug("Integer reciprocal: {}", integerCalculator.getReciprocal());
		logger.debug("Integer fraction: {}", integerCalculator.getFraction());

		/* Compiles as Double IS-A Number */
		BoundedTypeDemonstrator.NumericCalculator<Double> doubleCalculator = boundedTypeDemonstrator.new NumericCalculator<Double>(
				75.0);
		logger.debug("Double reciprocal: {}", doubleCalculator.getReciprocal());
		logger.debug("Double fraction: {}", doubleCalculator.getFraction());

		/* Won't compile, String is NOT a Number */
		/*
		 * BoundedTypeDemonstrator.NumericCalculator<String> wtfString =
		 * boundedTypeDemonstrator.new NumericCalculator<String>( "WTF!");
		 */
	}

}
