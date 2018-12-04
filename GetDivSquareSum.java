public class GetDivSquareSum {

  public long sumDivSquare(int num) {
		
		long sqSum = 1 + num*num;
		
		for(int i=2;i<=Math.sqrt(num);i++){
			
			if(num%i==0) {
				
				sqSum+=(i*i);
				
				if(num%(num/i)==0) {
					
					sqSum+=((num/i)*(num/i));
					
				}
			}
		}
		
		return sqSum;
		
	}
  


}
