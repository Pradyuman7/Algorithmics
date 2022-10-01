# **FindMaxSubArrayProduct**

Searching for a maximum product of continuous elements of an array is also very common in coding problems and many complex alogrithms. There is also need for getting `k` elements max sub array product in an array. Hence this class, which finds you the desired product efficiently.

> To use this class, just make a simple object of `FindMaxSubArrayProduct(int[] array)` class and call `findMaxProduct()` method which returns you the max sub array product for the whole array.

```java
public boolean findMaxProduct(){
	// returns maximum continuous sub-array product for your desired array
}
```

There is also another method which lets you find maximum product of `k` element subarrays in your array. It's structure looks like this:

```java
public boolean findMaxProduct(int k){
	// returns maximum continuous sub-array of length k product for your desired array
}
```

Example code, for understanding:

```java
public static void main(String[] args){

	int[] arr = {1,-2,3,-2,5};
		
	FindMaxSubArrayProduct fm = new FindMaxSubArrayProduct(arr);
		
	System.out.println(fm.findMaxProduct(2)); // returns -2 that is product of length 2 sub array {1,-2}
		
	System.out.println(fm.findMaxProduct()); // returns 15 that is max product possible for your array
    
}
```

