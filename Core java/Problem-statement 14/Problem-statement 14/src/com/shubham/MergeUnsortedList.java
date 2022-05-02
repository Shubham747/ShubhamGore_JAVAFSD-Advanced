package com.shubham;
import java.util.Arrays;

public interface MergeUnsortedList {
	public static void sortedMerge(int a[],int b[],int res[], int n, int m) {
		int i =0, j=0, k=0;
		while (i<n) {
			res[k] = a[i];
			i++;
			k++;
		}
		while (j<m) {
			res[k] = b[j];
			j++;
			k++;
		}
		Arrays.sort(res);
	}
	public static void main(String[] args) {
		int a[] = { 5,9,4,3,1,6,2};
		int b[] = {55,17,29,23,56,44,11};
		int n = a.length;
		int m = b.length;
		
		int res[]= new int [n+m];
		sortedMerge(a,b,res,n,m);
		
		System.out.println("Merge List is -->");
		for (int i=0;i<n+m;i++)
			System.out.println(" " +res[i]);
	}
}
