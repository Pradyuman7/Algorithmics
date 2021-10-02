package com.pd.algorithms;
public class CheckPrime {
	
	public boolean checkPrime(long num) {
		if (num == 1) {
			return false;
		}
		
		if (num > 2 && num%2 == 0 ) {
            
            return false;
        }
        int top = (int)Math.sqrt(num) + 1;
        for(int i = 3; i < top; i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
		
		
	}

}
