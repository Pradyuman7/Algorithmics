# **CheckPrime**

Sometimes using Sieve's algorithm is much more redundant and we need a quick and even more efficient solution for checking if a number is Prime or not. This is the reason of existence of this class.

> To use this class, just make a simple object of `CheckPrime` class and call `checkPrime()` method which returns you an `boolean` value corresponding to the number.

```java
public boolean checkPrime(long number){
	// returns true if the number is prime, otherwise fase
}
```

Example code, for understanding:

```java
public static void main(String[] args){

    CheckPrime cp = new CheckPrime();
    
    System.out.println(cp.checkPrime(999999937)); // gives true as this is the largest 9 digit prime number
    
}
```