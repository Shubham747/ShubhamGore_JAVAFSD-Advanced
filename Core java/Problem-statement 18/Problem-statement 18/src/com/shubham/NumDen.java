package com.shubham;
import java.util.HashMap;
import java.util.Map;

public class NumDen {
	public static String Fraction(int num, int den) {
		if (num==0)
			return "0";
		if (den==0)
			return "";
		
		StringBuilder res = new StringBuilder();
		if((num<0)^(den<0))
			res.append("-");
		
		num = Math.abs(num);
		den = Math.abs(den);
		
		long quo = num/den;
		long rem = num%den * 10;
		
		res.append(String.valueOf(quo));
		if (rem == 0)
			return res.toString();
		
		res.append(".");
		Map<Long,Integer> m = new HashMap<>();
		
		while(rem!=0) {
			if(m.containsKey(rem)) {
				int index = m.get(rem);
				String p1 = res.substring(0, index);
				String p2 = "(" + res.substring(index,res.length())+")";
				return p1+p2;
			}
			m.put(rem, res.length());
			quo =rem/den;
			res.append(String.valueOf(quo));
			
			rem = (rem%den)*10;
		}
		return res.toString();
		
	}
	public static void main(String[] args) {
		int num = 1;
		int den = 3;
		
		String resString1 = Fraction(num,den);
		 
		
		
		System.out.println(resString1);
		
	}

}
