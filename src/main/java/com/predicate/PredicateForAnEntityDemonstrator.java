package com.predicate;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class PredicateForAnEntityDemonstrator {

	private final short thresholdAge = 50;

	public boolean isPersonOld(Person person) {

		return Period.between(person.getDob().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now())
				.getYears() >= thresholdAge;

	}

	/************************ Entities *****************************/
	public class Person {
		private String firstName;
		private String lastName;
		private Date dob;

		public Person(String firstName, String lastName, Date dob) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.dob = dob;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		@Override
		public String toString() {
			return "Person [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
		}

	}
}
