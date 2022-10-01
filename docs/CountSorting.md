# **CountSorting**

In various algorithms and software, often there's a need to sort the array. And one of the asymptotically fastest algorithm for sorting is Counting Sort, and this class helps you use exactly that algorithm.

> To use this class, just make a simple object of `CountSorting` class. Then just call `countSort(int n, int[]. arr)` method which returns you the sorted array using the Counting sort algorithm.

```java
public int[] countSort(int n, int[] arr){
	// returns the sorted array
}
```

Example code, for understanding:

```java
public static void main(String[] args){
	int[] arr = { 1, 3, 9, 6, 2, 4};
        CountSorting cs = new CountSorting();
        System.out.printn(Arrays.toString(cs.countSort(arr.length, arr)); // returns the sorted array
}
```