package com.generics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * First, baby step towards learning Java generics. Merely demonstrates how the type parameters work.
 * The generic syntax:

 class class-name<comma-separated type parameters>{
 
 }
 
 * @author kaliyugantagonist
 *
 * @param <T>
 * @param <V>
 */
public class BasicGenericsDemonstrator<T,V> {

	private T tRef;
	private V vRef;
	
	private static final Logger logger = LoggerFactory.getLogger(BasicGenericsDemonstrator.class);
	
	public BasicGenericsDemonstrator(T tRef, V vRef) {
		
		this.tRef = tRef;
		this.vRef = vRef;
	}
	
	public void printTypeClass() {
		logger.debug("The parameter T is of type {}",tRef.getClass().getName());
		logger.debug("The parameter V is of type {}",vRef.getClass().getName());
	}
	
	public T getTInstance() {
		return tRef;
	}
	
	public V getVInstance() {
		return vRef;
	}
}
