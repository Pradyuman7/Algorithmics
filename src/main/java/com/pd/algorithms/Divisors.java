package com.pd.algorithms;
import java.util.ArrayList;

public class Divisors {
	
	public ArrayList<Integer> findDivisors(int num) {
		
		ArrayList<Integer> div = new ArrayList<Integer>();
		
		div.add(1);
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0)
				div.add(i);
			
		}
		
		div.add(num);
		
		//for(int i=0;i<div.size();i++)
		//	System.out.println(div.get(i));
		
		return div;
		
	}

}
