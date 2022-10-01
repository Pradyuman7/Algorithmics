# **Divisors**

This class finds all the divisors of the number of your choice in O(n) time, the time complexity will soon be decreased even further.

> To use this class, just make a simple object of `Divisors` class and call `findDivisors()` method which returns you an `ArrayList<Integer>` which contains all the divisors of the number in ascending order.

```java
public ArrayList<Integer> findDivisors(int number){
	// returns ArrayList of all the divisors of the number sorted in ascending order
}
```

Example code, for understanding:

```java
public static void main(String[] args){

     Divisors d = new Divisors();
		
     System.out.println(d.findDivisors(10)); // returns [1,2,5,10]
    
}
```