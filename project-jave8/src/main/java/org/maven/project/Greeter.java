package org.maven.project;


public class Greeter {

	public void perform(ImplementingGreeter imp) {
		//System.out.println("printing");
		imp.perform();
	}
	
	LambdaType printerN = () -> System.out.println("lambda");
	
	public static void main(String[] args) {
		Greeter greet = new Greeter();
		ImplementingGreeter imp = new ImplementingGreeter();
		//imp.perform();
		greet.perform(imp);

	}

}
