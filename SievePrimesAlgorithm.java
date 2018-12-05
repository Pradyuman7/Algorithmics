
public class SievePrimesAlgorithm {
	
	public static int N = 1000000;
	
	public static boolean prime[] = new boolean[N+1]; 
	
	public void start() {
		
		for(int i=0;i<N;i++) 
	        prime[i] = true; 
		
		for(int p = 2; p*p <=N; p++) { 
             
            if(prime[p]) { 
               
                for(int i = p*2; i <= N; i += p) 
                    prime[i] = false; 
            } 
        } 
	}	
	
	public boolean isPrime(int n) {
		
		
		if(n<=1)
			return false;
		
		else if(n%2==0)
			return false;
		
		else if(n==2)
			return true;
		
		else {
			
			try{
				if(prime[n])
					return true;}catch(ArrayIndexOutOfBoundsException e){
				e.printStackTrace();
			}
			
		}
		
		
		return false;
		
	}
	

}
