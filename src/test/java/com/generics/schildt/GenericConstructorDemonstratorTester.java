package com.generics.schildt;

import com.generics.schildt.GenericConstructorDemonstrator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenericConstructorDemonstratorTester {
	
	private static final Logger logger = LoggerFactory.getLogger(GenericConstructorDemonstrator.class);

	@Test
	public void test() {
		GenericConstructorDemonstrator constructorDemonstrator = new GenericConstructorDemonstrator();
		
		int i = 4;
		GenericConstructorDemonstrator.Summation intSummation = constructorDemonstrator.new Summation(i);
		logger.debug("Int summation is {}", intSummation.getSummation());
		
		double j = 10.5;
		GenericConstructorDemonstrator.Summation doubleSummation = constructorDemonstrator.new Summation(j);
		logger.debug("Double summation is {}", doubleSummation.getSummation());
		
	}

}
