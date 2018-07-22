package org.maven.project;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExerciseClass {
	

	
	public static void main(String[] agrs) {
		List<Person> person = Arrays.asList(
				new Person("Ajay","Kamta",27),
				new Person("Vijay","Chada",35),
				new Person("Sumit","Sharma",40),
				new Person("Rakshit","Tyagi",34),
				new Person("Praveen","Kumar",23),
				new Person("Prashant","Ranjan",21)
				);
		
		person.sort(Comparator.comparing(Person::getLastname));
		person.forEach(System.out::println);
	}

}
