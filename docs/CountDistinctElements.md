# **CountDistinctElements**

In various algorithms and software, often there's a need to find the distinct elements in an array. This class helps you do exactly that efficiently.

> To use this class, just make a simple object of `CountDistinctElement` class with the integer array of your choice. Then just call `countDistinct()` method which returns you the number of distinct elements in your array from above.

```java
public int countDistinct() {
	// returns number of distinct elements in your array
}
```

Example code, for understanding:

```java
public static void main(String[] args){

	int[] arr = new int[]{1, 2, 3, 4, 2, 3,1,5};
          
        CountDistinctElements cd = new CountDistinctElements(arr);
        System.out.println(cd.countDistinct()); // returns 5 as that is the number of distinct elements
}
```