
public class FindMaxSubArrayProduct {
	
	int[] arr;
	int num;
	
	public FindMaxSubArrayProduct(int[] arr) {
		this.arr = arr;
	}
	
	public int findMaxProduct(int num) {
		
		int res = 1;
		
		for (int i=0; i<num; i++) 
	           res *= arr[i];
		
		int pre = res;
		
        for (int i=1; i<=arr.length-num; i++) {
        
            int curr = (pre/arr[i-1]) * arr[i+num-1]; 
            res = Math.max(res, curr); 
            pre = curr; 
        } 
		
		return res;
		
	}
	
	public int findMaxProduct() {
		
		int res = arr[0];
		
        for (int i=1; i<arr.length; i++) {
        
        	int cur = res*arr[i];
        	
        	if(cur>res)
        		res = cur;
           
        } 
		
		return res;
		
	}

}
