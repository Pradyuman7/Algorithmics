# SievePrimesAlgorithm

This class helps you find if a number is prime or not, for number upto 1 million, within a millisecond.

> To use this algorithm, just make an object of this class, and call method `start()` in the beginning of your program. After that, just use `isPrime()` method to find boolean value corresponding to the number which is prime or not.

```java
public boolean isPrime(int number){
  // returns boolean value stating the number is prime or not
}
```

Example code, for understanding:
```java
public static void main(String[] args){

  	SievePrimesAlgorithm prime = new SievePrimesAlgorithm();
	
  	prime.start(); // need to call only once per code
	
  	System.out.printlnt(prime.isPrime(83478)); // returns false as the number is not prime
}
```