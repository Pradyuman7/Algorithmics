package com.pd.algorithms;

//The program should return an integer which corresponds to the maximum area of water that can be contained
public class ContainerWithMostWater {
	 public static int maxArea(int[] height) {
	        int area=0;
	        int start=0;
	        int end=height.length-1;
	        //Calculating the max area
	        while(start<end){
	            if(height[start]<height[end]){
	                area=Math.max(area,height[start]*(end-start));
	                start+=1;
	            }
	            else{
	                area=Math.max(area,height[end]*(end-start));
	                end-=1;
	            }
	        }
	        return area;
	    }
	 public static void main(String[] args)
	 {
	     int a[] = { 1,8,6,2,5,4,8,3,7};
	     int b[] = { 1,2,1 };
	  
	     System.out.println(maxArea(a));
	     System.out.println(maxArea(b));
	 }
}
//Time Complexity: O(n)
//Space Complexity: O(1)
