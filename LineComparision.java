package com.linecompareprblm;

import java.util.Scanner;
import java.util.lang.*;
public class LineComparision 
{
	public static void main(String[] args) 
	{
	
		System.out.println("Welcome to Line Comparison Computation Program");
	
		double x1, x2, y1, y2, LengthofLine,LengthofLine2;    //Declaration
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for Line 1");
		
		System.out.println("Enter the value of x1");  //Taking input from user x & y
		x1 = scan.nextDouble();   
		System.out.println("Enter the value of x2");
		x2 = scan.nextDouble();
		System.out.println("Enter the value of y1");
		y1 = scan.nextDouble();
		System.out.println("Enter the value of y2");
		y2 = scan.nextDouble();
		LengthofLine = Math.sqrt(  (Math.pow((x2-x1),2))  + (Math.pow((y2-y1),2)) );
		System.out.println(LengthofLine);
		
		System.out.println("Enter the values for Line 2");
		System.out.println("Enter the value of x1"); //Taking input from user x & y
		x1 = scan.nextDouble();  
		System.out.println("Enter the value of x2");
		x2 = scan.nextDouble();
		System.out.println("Enter the value of y1");
		y1 = scan.nextDouble();
		System.out.println("Enter the value of y2");
		y2 = scan.nextDouble();
		LengthofLine2 = Math.sqrt(  (Math.pow((x2-x1),2))  + (Math.pow((y2-y1),2)) );
		System.out.println("LengthofLine2:" + LengthofLine2);
		
		String s1,s2;
		s1=Double.toString(LengthofLine);
		s2=Double.toString(LengthofLine2);
		System.out.println("Equality of two lines:" + s1.equals(s2));
		System.out.println("Compare of two length is:" +s1.compareTo(s2));
      }
 }

