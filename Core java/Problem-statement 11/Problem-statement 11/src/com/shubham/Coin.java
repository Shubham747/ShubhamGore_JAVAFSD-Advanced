package com.shubham;
import java.util.Vector;

public class Coin {
	static int deno[]= {1,2,5,10,20,50,100,200,500,2000};
	static int n = deno.length;
	static void findMin(int v) {
		Vector<Integer> ans = new Vector<>();
		for (int i=n-1;i>=0;i--) {
			while (v>=deno[i]) {
				v -=deno[i];
				ans.add(deno[i]);
			}
		}
		for (int i=0;i<ans.size();i++) {
			System.out.println(""+ans.elementAt(i));
		}
	}
	public static void main(String[] args) {
		int n = 2568;
		System.out.println("Change for Rs."+ n+" is ");
		findMin(n);
		
	}
	

}