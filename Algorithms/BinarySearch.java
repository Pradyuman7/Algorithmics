package Algorithms;
import java.util.Arrays;

public class BinarySearch {
	
	public int[] arr;
	public int size;

	
	public BinarySearch(int[] arr) {
		
		this.arr = arr;
		
		size = arr.length;
		
	}
	
	public boolean search(int num) {
		
		Arrays.sort(arr);
		
		return binarySearch(arr,0,size-1,num);
	}
	
	public boolean binarySearch(int[] array, int low, int high, int value) {
		
		boolean ans = false;
		
		while(low<=high) {
			
			int mid = (high+low)/2;
			
			if(array[mid]==value) {
				
				ans = true;
				low = high+1;
			}
				
			
			else if(array[mid]>value) 
				high = mid - 1;
			
			else if(array[mid]<value) 
				low = mid+1;
			
				
		}
		
		return ans;
		
	}

}
