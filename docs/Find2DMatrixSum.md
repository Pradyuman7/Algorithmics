# Find2DMatrixSum

This class sums a 2D matrix.

> To use this class, just make a simple object of `Find2DMatrixSum` class and call ` findSumOfMatrix()` method which returns you an `int` which represents the sum of the matrix. If the sum can exceed the `int` range, you can use `findLongSumOfMatrix()` to get the `long` number as sum.

```java
public int findSumOfMatrix() {
	// returns sum of matrix
}
```

```java
public int findLongSumOfMatrix() {
	// returns long sum of matrix
}
```

Example code, for understanding:

```java
public static void main(String[] args){
  int[][] arr = new int[][]{
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    Find2DMatrixSum mSum = new Find2DMatrixSum(arr);
    System.out.println(mSum.findSumOfMatrix()); // 45 
}
```
