# **BinarySearch**

Searching for a particular number's existence in an array has always been one of the most widely used and fundamental part of any coding algorithm for a problem. BinarySearch has always been the most preferred one, so now use BinarySearch without coding the whole algorithm.

> To use this class, just make a simple object of `BinarySearch(int[] array)` class and call `search()` method which returns you the boolean value stating the value exists in the array or not.

```java
public boolean search(int num){
	// returns true or false depending on the existence of the number in the array
}
```

Example code, for understanding:

```java
public static void main(String[] args){

	int[] arr = {1,5,3,14,2,12,7,6};
		
	BinarySearch b = new BinarySearch(arr);
		
	System.out.println(b.search(5)); // returns true
    
}
```