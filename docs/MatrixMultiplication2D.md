# **MatrixMultiplication2D**

In various algorithms and softwares, often there's a need to multiply matrices. This class helps you implement exactly that.

> To use this class, just make a simple object of `MatrixMultiplication2D` class. Then just call `MatrixMult2D(int[][] Mat1, int[][] Mat2)` method which returns the multiplied matrix.

```java
public int[][] MatrixMult2D(int[][] Mat1, int[][] Mat2) {
	// returns the multiplied matrix
}
```

Example code, for understanding:

```java
public static void main(String[] args){
	int[][] Mat1 = {{1, 2}, {3, 4}};
	int[][] Mat2 = {{1, 0}, {0, 1}};
        MatrixMultiplication2D obj = new MatrixMultiplication2D();
        System.out.printn(Arrays.deeptToString(obj.MatrixMult2D(Mat1, Mat2)); // returns the multiplied matrix
}
```