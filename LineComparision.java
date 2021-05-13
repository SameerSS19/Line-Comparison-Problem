package com.linecompareprblm;

import java.util.Scanner;
public class LineComparision 
{
	public static void main(String[] args) 
	{
	
		System.out.println("Welcome to Line Comparison Computation Program");
	
		double x1, x2, y1, y2, LengthofLine;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x1");
		x1 = scan.nextDouble();
		System.out.println("Enter the value of x2");
		x2 = scan.nextDouble();
		System.out.println("Enter the value of y1");
		y1 = scan.nextDouble();
		System.out.println("Enter the value of y2");
		y2 = scan.nextDouble();
		LengthofLine = Math.sqrt(  (Math.pow((x2-x1),2))  + (Math.pow((y2-y1),2)) );
		System.out.println(LengthofLine);
		System.out.println(LengthofLine);
      }
 }

