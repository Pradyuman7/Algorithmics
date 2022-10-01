# **GetDivSquareSum**

Getting the sum of squares of divisors of a number is getting too much common in many competetive programming problems, and this becomes a tedious task to do in complexity less than O(n). This is why, this class exists.

> To use this class, just make a simple object of `GetDivSquareSum` class and call `sumDivSquare()` method which returns you an `long` value corresponding to the sum of the square of the divisors of the number of your choice.

```java
public long sumDivSquare(int num){
	// returns sum of squares of the divisors of the num
}
```

Example code, for understanding:

```java
public static void main(String[] args){

    GetDivSquareSum gd = new GetDivSquareSum();
    
    System.out.println(gd.sumDivSquare(42)); // prints 2500 that is sum of squares of the divisors of 42
    
}
```
