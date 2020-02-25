package com.generics.schildt;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.generics.schildt.WildcardMethodsDemonstrator.Animal;

public class WildcardMethodsDemonstratorTester {
	
	private static final Logger logger = LoggerFactory.getLogger(WildcardMethodsDemonstratorTester.class);

	@Test
	public void testPrintCollection() {
		WildcardMethodsDemonstrator wildcardDemonstratorWithCollection = new WildcardMethodsDemonstrator();

		Collection rawCollection = new ArrayList();
		rawCollection.add(wildcardDemonstratorWithCollection.new Cat("Tom", "Tuxedo", "Domestic"));
		rawCollection.add(wildcardDemonstratorWithCollection.new Dog("Spike", "Bulldog"));
		rawCollection.add(wildcardDemonstratorWithCollection.new Pine("Pinus densiflora"));
		rawCollection.add(new Integer(11));

		wildcardDemonstratorWithCollection.printCollection(rawCollection);
		
		logger.debug("********************************************************************************************************************************");
	}

	@Test
	public void testPrintCollectionOfObjects() {
		WildcardMethodsDemonstrator wildcardDemonstratorWithCollection = new WildcardMethodsDemonstrator();

		Collection<Object> objectCollection = new ArrayList<Object>();
		objectCollection.add(wildcardDemonstratorWithCollection.new Cat("Tom", "Tuxedo", "Domestic"));
		objectCollection.add(wildcardDemonstratorWithCollection.new Dog("Spike", "Bulldog"));
		objectCollection.add(wildcardDemonstratorWithCollection.new Pine("Pinus densiflora"));
		objectCollection.add(new Integer(11));

		wildcardDemonstratorWithCollection.printCollectionOfObjects(objectCollection);
		
		Collection<Integer>intCollection = new ArrayList<>();
		//Won't compile: Only a Collection<Object>can be passed
		//wildcardDemonstratorWithCollection.printCollectionOfObjects(intCollection);
		
		logger.debug("********************************************************************************************************************************");
		
	}

	@Test
	public void testPrintCollectionOfAnimals() {
		WildcardMethodsDemonstrator wildcardDemonstratorWithCollection = new WildcardMethodsDemonstrator();

		Collection<WildcardMethodsDemonstrator.Animal> animalCollection = new ArrayList<Animal>();
		animalCollection.add(wildcardDemonstratorWithCollection.new Cat("Tom", "Tuxedo", "Domestic"));
		animalCollection.add(wildcardDemonstratorWithCollection.new Dog("Spike", "Bulldog"));
		//Won't compile: Pine is NOT an Animal
		//animalCollection.add(wildcardDemonstratorWithCollection.new Pine("Pinus densiflora"));
		//Won't compile: Integer is NOT an Animal
		//animalCollection.add(new Integer(11));
		
		Collection<WildcardMethodsDemonstrator.Cat>catCollection = new ArrayList<>();
		catCollection.add(wildcardDemonstratorWithCollection.new Cat("Tom", "Tuxedo", "Domestic"));
		//Won't compile: A Collection<Cat> or any of the Animal subtypes cannot be passed
		//wildcardDemonstratorWithCollection.printCollectionOfAnimals(catCollection);

		wildcardDemonstratorWithCollection.printCollectionOfAnimals(animalCollection);
		
		logger.debug("********************************************************************************************************************************");
	}

	@Test
	public void testPrintWildcardCollection() {
		WildcardMethodsDemonstrator wildcardDemonstratorWithCollection = new WildcardMethodsDemonstrator();
		
		Collection<WildcardMethodsDemonstrator.Animal> animalCollection = new ArrayList<Animal>();
		animalCollection.add(wildcardDemonstratorWithCollection.new Cat("Tom", "Tuxedo", "Domestic"));
		animalCollection.add(wildcardDemonstratorWithCollection.new Dog("Spike", "Bulldog"));
		
		//Pass a Collection of Animal instances
		wildcardDemonstratorWithCollection.printWildcardCollection(animalCollection);
		
		Collection<WildcardMethodsDemonstrator.Cat>catCollection = new ArrayList<>();
		catCollection.add(wildcardDemonstratorWithCollection.new Cat("Tom", "Tuxedo", "Domestic"));
		//Pass a Collection of Cat instances
		wildcardDemonstratorWithCollection.printWildcardCollection(catCollection);
		
		Collection<Integer>integerCollection = new ArrayList<>();
		integerCollection.add(100);
		//Pass a Collection of Integer instances
		wildcardDemonstratorWithCollection.printWildcardCollection(integerCollection);
		
		logger.debug("********************************************************************************************************************************");
	}

	@Test
	public void testPrintBoundedWildcardCollectionofAnimals() {
		WildcardMethodsDemonstrator wildcardDemonstratorWithCollection = new WildcardMethodsDemonstrator();

		Collection<WildcardMethodsDemonstrator.Animal> animalCollection = new ArrayList<Animal>();
		animalCollection.add(wildcardDemonstratorWithCollection.new Cat("Garfield", "Tabby", "Domestic"));
		animalCollection.add(wildcardDemonstratorWithCollection.new Dog("Spike", "Bulldog"));
		//Won't compile: Pine is NOT an Animal
		//animalCollection.add(wildcardDemonstratorWithCollection.new Pine("Pinus densiflora"));
		//Won't compile: Integer is NOT an Animal
		//animalCollection.add(new Integer(11));
		//Print a Animal Collection
		wildcardDemonstratorWithCollection.printBoundedWildcardCollectionofAnimals(animalCollection);
		
		
		
		Collection<WildcardMethodsDemonstrator.Cat>catCollection = new ArrayList<>();
		catCollection.add(wildcardDemonstratorWithCollection.new Cat("Tom", "Tuxedo", "Domestic"));
		//Print a Cat Collection
		wildcardDemonstratorWithCollection.printBoundedWildcardCollectionofAnimals(catCollection);
		
		
		
		Collection<WildcardMethodsDemonstrator.Dog>dogCollection = new ArrayList<>();
		dogCollection.add(wildcardDemonstratorWithCollection.new Dog("Pluto", "Mixed-breed"));
		//Print a Dog Collection
		wildcardDemonstratorWithCollection.printBoundedWildcardCollectionofAnimals(dogCollection);
		
		logger.debug("********************************************************************************************************************************");
	}

}
