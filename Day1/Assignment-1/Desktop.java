package org.system;

public class Desktop extends Computer{
	
	//Declaring the method to return desktop size 
	public Float desktopSize() {
		
		//Returning the desktop size
		return 15.60f;
	}
	public static void main(String[] args) {
		//Creating object for class desktop
		Desktop obj = new Desktop();
		
		//Accessing the computerModel using single inheritance
		System.out.println("Computer Model: " + obj.computerModel());
		
		//Accessing the desktopSize method
		System.out.println("Desktop Size: " + obj.desktopSize());
	}
}
