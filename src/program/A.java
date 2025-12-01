package program;

import java.util.Scanner;

public class A {
	/*
	public  String reverse(String st) {
		if(st==null) {
			return null;
		}
	
		 	StringBuilder sb=new StringBuilder(st);
		return sb.reverse().toString();
		
		
		
	}
	*/
public static void main(String[] args) {
	/*
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the string");
	 String word = sc.nextLine();
	 */
	 /*
	 A a=new A();
	String returnValue = a.reverse(word);
	System.out.println(returnValue);
	*/
	   String st="chinti";
		StringBuilder sb=new StringBuilder(st);
		sb.reverse();
		System.out.println(sb);
	
	  
}
}
