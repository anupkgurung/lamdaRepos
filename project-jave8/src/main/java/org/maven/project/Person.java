package org.maven.project;

public class Person {
	
	private String firstname;
	private String Lastname;
	private int age;
	
	public Person(String firstName, String LastName, int age) {
		super();
		this.firstname = firstName;
		this.Lastname = LastName;
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Person [firstName="+firstname+", lastName="+Lastname+", age="+age+"]";
	}
}
