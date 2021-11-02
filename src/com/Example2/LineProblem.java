package com.Example2;
import java.util.Scanner;
public class LineProblem {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		
         System.out.println("Enter first number x1: ");
		double x1 = sc.nextDouble();
		
		System.out.println("Enter first number y1: ");
		double y1 = sc.nextDouble();

		System.out.println("Enter first number x2: ");
		double x2 = sc.nextDouble();
		
		System.out.println("Enter first number y2: ");
		double y2 = sc.nextDouble();
		
		double length1 = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The length of line is " +length1);
	}

}
