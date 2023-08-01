package com.cg.daythree;

public class Constructor {
	private String name;

		  Constructor() {
		    System.out.println("Constructor Called:");
		    name = "Kayalvizhi";
		  }

		  public static void main(String[] args) {
		    Constructor obj = new Constructor();
		    System.out.println("The name is " + obj.name);
	  }
}
