package com.cg.daythree;
import java.util.Scanner; 
public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in); 
	    System.out.println("Enter username");
	    String userName = myObj.nextLine();
	    System.out.println("Username is: " + userName);
	}
}
