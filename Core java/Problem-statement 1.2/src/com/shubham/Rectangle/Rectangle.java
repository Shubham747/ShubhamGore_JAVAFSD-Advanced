package com.shubham.Rectangle;

import java.util.Scanner;

public class Rectangle {
	int length;
	int breadth;
	int area;
	int perimeter;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		length = sc.nextInt();
		System.out.println("Enter breadth of rectangle: ");
		breadth = sc.nextInt();
		
	}
	void calculate() {
		area = length * breadth ;
		
	}
	void display() {
		System.out.println("Area of Rectangle = "+ area);
		
		
	}
	public static void main(String[] args) {
		Rectangle obj = new Rectangle ();
		obj.input();
		obj.calculate();
		obj.display();
	}

}
