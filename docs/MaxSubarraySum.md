# **MaxSubArraySum**

Searching for a maximum sum of continuous sub-arrays in a given array is fastly becoming one of the most used and favorite algorithm in coding competitions and interview problems. You may often find it tedious to code this efficiently, hence this class to help you out.

> To use this class, just make a simple object of `MaxSubArraySum(int[] array)` class and call `getSum()` method which returns you the int value (taking into account for positive and negative numbers) corresponding to the maximum sum of subarrays in your given array.

```java
public boolean getSum(){
	// returns maximum continuous sub-array sum for your desired array
}
```

Example code, for understanding:

```java
public static void main(String[] args){

	int[] arr = {1,-2,3,-2,5};
		
	MaxSubArraySum max = new MaxSubArraySum(arr);
		
	System.out.println(max.getSum()); // returns 6, that is sum of {3,-2,5}
    
}
```
