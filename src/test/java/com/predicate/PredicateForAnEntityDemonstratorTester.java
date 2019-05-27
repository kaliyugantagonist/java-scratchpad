package com.predicate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.function.Predicate;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.predicate.PredicateForAnEntityDemonstrator.Person;

/**
 * 
 * @author kaliyugantagonist
 * TODO: Convert to lambda expressions
 *
 */
public class PredicateForAnEntityDemonstratorTester {

	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	private static final Logger logger = LoggerFactory.getLogger(PredicateForAnEntityDemonstratorTester.class);

	@Test
	public void testIsPersonOld() throws ParseException {

		PredicateForAnEntityDemonstrator predicateForAnEntityDemonstrator = new PredicateForAnEntityDemonstrator();

		Predicate<Person> agedPersonPredicate = new Predicate<PredicateForAnEntityDemonstrator.Person>() {

			@Override
			public boolean test(Person t) {
				return predicateForAnEntityDemonstrator.isPersonOld(t);
			}
		};

		PredicateForAnEntityDemonstrator.Person person = predicateForAnEntityDemonstrator.new Person("John", "Rambo",
				dateFormat.parse("1947-07-06"));

		logger.debug("Is {} old? {}", person, agedPersonPredicate.test(person));

	}

}
