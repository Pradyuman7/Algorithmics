public class GetDivSquareSum {

  public long sumDivSquare(int num) {
		
		
		if(num==0)
			return 0;
		
		else if(num==1)
			return 1;
		
		else if(num==2)
			return 5;
		
		long sqSum = 1 + num*num;
		
		for(int i=2;i<=Math.sqrt(num);i++){
			
			if(num%i==0) {
				
				sqSum+=(i*i);
				
				if(num%(num/i)==0 && num/i!=i) {
					
					sqSum+=((num/i)*(num/i));
					
				}
				
			}
			
			
		}
		
		return sqSum;
		
	}
  


}
