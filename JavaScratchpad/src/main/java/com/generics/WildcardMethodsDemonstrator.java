package com.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An unbounded wildcard demonstrator.
 * 
 * @author kaliyugantagonist
 *
 */
public class WildcardMethodsDemonstrator {

	Logger logger = LoggerFactory.getLogger(WildcardMethodsDemonstratorTester.class);

	/*
	 * Note: This is horrible! It can have instances of any type but methods
	 * specific to a particular class cannot be used without casting and how would
	 * you cast???
	 */
	public void printCollection(Collection collection) {

		for (Object o : collection) {
			logger.debug("Raw collection: Object is {}", o);
		}
	}

	/*
	 * Note: This Collection cannot be used for anything else than java.lang.Object!
	 */
	public void printCollectionOfObjects(Collection<Object> collection) {

		for (Object o : collection) {
			logger.debug("Collection<Object>: Object is {}", o);
		}
	}

	/*
	 * Note: Only a Collection<Animal> can be passed, NOT a Collection<Cat>,
	 * Collection<Dog> or any of the Animal subtypes.
	 */
	public void printCollectionOfAnimals(Collection<Animal> animals) {
		for (Animal animal : animals) {
			logger.debug("Animal is {} ", animal);
		}
	}

	/****************** Unbounded Wildcard *************************/
	/*
	 * Note: While this is seems similar to a Collection<Object> due to '?'
	 * signifying 'anything', it's NOT the case. You can pass a Collection<Animal>,
	 * Collection<Cat> OR a Collection<Integer>.
	 */
	public void printWildcardCollection(Collection<?> wildcardCollection) {

		for (Object o : wildcardCollection) {
			logger.debug("What is the object??? {}", o);
		}
	}

	/****************** Bounded Wildcard *************************/
	/* Note: Only an Animal or it' subtypes can be added, not Plant or anything else!!! */
	public void printBoundedWildcardCollectionofAnimals(Collection<? extends Animal> animals) {
		for (Animal animal : animals) {
			logger.debug("Animal is {}. It makes a sound {} and is a {}", animal, animal.getSound(), animal.getDietType());
		}
	}

	/*******************************************
	 * Entities
	 ****************************************************/
	/*
	 * These can be moved to another package and reused in several classes but then
	 * changing any entity would break all of those classes!!!
	 */
	public interface Animal {
		String getSound();

		String getDietType();
	}

	public class Cat implements Animal {

		private String name;
		private String species;
		private String residenceType;

		public Cat(String name, String species, String residenceType) {
			super();
			this.name = name;
			this.species = species;
			this.residenceType = residenceType;
		}

		@Override
		public String getSound() {
			return "Meow!!!";

		}

		@Override
		public String getDietType() {
			return "carnivore";

		}

		@Override
		public String toString() {
			return "Cat [name=" + name + ", species=" + species + ", residenceType=" + residenceType + "]";
		}

	}

	public final class Tom extends Cat {

		public Tom() {
			super("Tom", "Tuxedo Cat", "Domestic");
		}

		public List<String> getHobbies() {
			List<String> hobbies = new ArrayList<>();
			hobbies.add("Chasing Jerry");
			hobbies.add("Fishing");

			return hobbies;
		}
	}

	public class Dog implements Animal {

		private String name;
		private String species;

		public Dog(String name, String species) {
			super();
			this.name = name;
			this.species = species;
		}

		@Override
		public String getSound() {
			return "Bhow! Bhow !! Bhow !!!";

		}

		@Override
		public String getDietType() {
			return "carnivore";

		}

		@Override
		public String toString() {
			return "Dog [name=" + name + ", species=" + species + "]";
		}

	}

	public interface Plant {
		int getOxygenIndex();
	}

	public class Pine implements Plant {

		private String botanicalName;

		public Pine(String botanicalName) {
			super();
			this.botanicalName = botanicalName;
		}

		@Override
		public int getOxygenIndex() {
			return 5;
		}

		@Override
		public String toString() {
			return "Pine [botanicalName=" + botanicalName + "]";
		}

	}
}
