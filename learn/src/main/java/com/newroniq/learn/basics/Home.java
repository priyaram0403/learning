/**
 * 
 */
package com.newroniq.learn.basics;

/**
 * @author webuser
 *
 */
public class Home {

	/**
	 * 
	 */
	public Home() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printhome("Airy and bright bedroom", 2);
		printhome("Airy and bright bedroom");
		
	
	}

	public static void printhome(String name, int rooms) {
		System.out.println(name + " - " + rooms);
	}
	
	public static void printhome(String name) {
		System.out.println(name);
	}
}
