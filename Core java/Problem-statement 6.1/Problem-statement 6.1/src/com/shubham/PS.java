package com.shubham;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PS {
public static void main(String[] args) {
	ArrayList<String> alist = new ArrayList<String>();
	int n ;
	Scanner sc = new Scanner (System.in);
	n=sc.nextInt();
	System.out.println("Enter the number of Student : ");
	for(int i=0 ;i<n;i++)
	{
		alist.add(sc.next()) ;
	}
	System.out.println("Student list :");
	for (String a:alist)
	{
		System.out.println(a);
	}
	System.out.println(" Enter the name of student to be searched : ");
	String str =sc.next();
	int position = Collections.binarySearch(alist, str);
	System.out.println(" Position of "+ str + " is : "+position );
	
}
}
