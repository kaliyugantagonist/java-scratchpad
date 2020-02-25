package com.generics.schildt;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Pay attention to the comments!!!
 * 
 * @author kaliyugantagonist
 *
 */
public class BasicGenericsDemonstratorTester {
	
	Logger logger = LoggerFactory.getLogger(BasicGenericsDemonstratorTester.class);

	@Test
	public void testPrintTypeClass() {
		BasicGenericsDemonstrator<String, Integer> basicGenericsDemonstrator = new BasicGenericsDemonstrator<String, Integer>(
				"John", 30);
		basicGenericsDemonstrator.printTypeClass();
	}

	@Test
	public void testGetTInstance() {
		BasicGenericsDemonstrator<String, Integer> basicGenericsDemonstrator = new BasicGenericsDemonstrator<String, Integer>(
				"John", 30);
		/*Note: This not only compiles but also a cast isn't required.*/
		String tRef = basicGenericsDemonstrator.getTInstance();
		
		if(tRef != null && !tRef.isEmpty()) {
			logger.debug("String length is {}", tRef.length());
		}
	}

	@Test
	public void testGetVInstance() {
		BasicGenericsDemonstrator<String, Integer> basicGenericsDemonstrator = new BasicGenericsDemonstrator<String, Integer>(
				"John", 30);
		/*Note: This not only compiles but also a cast isn't required.*/
		Integer vRef = basicGenericsDemonstrator.getVInstance();
		if(vRef != null) {
			logger.debug("Int value is {}", vRef.intValue());
		}
	}

}
