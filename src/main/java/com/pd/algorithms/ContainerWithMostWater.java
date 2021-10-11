package com.pd.algorithms;


public class ContainerWithMostWater {
	 public static int maxArea(int[] height) {
	        int area=0;
	        int start=0;
	        int end=height.length-1;
	        
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
}

