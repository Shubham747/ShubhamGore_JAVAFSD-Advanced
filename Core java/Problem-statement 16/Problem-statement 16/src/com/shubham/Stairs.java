package com.shubham;
public class Stairs {
	static int fib(int n) {
		if (n<=1)
			return n;
		return fib(n-1) + fib(n-2);
		
	}
	
	static int countWays(int s) {
		return fib(s+1);
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println("There are "+countWays(n)+" ways to climb to the top.");
	}

}
