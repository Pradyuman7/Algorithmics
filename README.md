# Algorithmics

A Java library for people who want to implement some algorithms quickly.

**List of Current Algorithmics' Classes**
- SievePrimesAlgorithm

  >Find and Generate Prime numbers using Sieve's algorithm.
  
- NumOccurencesOfCharacters

  >Find number of occurences of different/particular character(s) in a string.
  
- Divisors

  >Find number of divisors of the number of your choice.
  
- CheckPrime

  >Check if a number is prime or not, efficiently.


***

# Docs

- **SievePrimesAlgorithm**

This class helps you to find if a number is prime or not, for number upto 1 million, within a millisecond. 

To use this library, just make an object of this class, and call method `start()` in the beginning of your program. After that, just use `isPrime()` method to find boolean value corresponding to the number which is prime or not.

```
public boolean isPrime(int number){
  // returns boolean value stating the number is prime or not
}
```

Example code, for understanding:
```
public static void main(String[] args){

  SievePrimesAlgorithm prime = new SievePrimesAlgorithm();
  prime.start();
  .
  .
  .
  System.out.printlnt(prime.isPrime(83478)); // returns false as the number is not prime
}
```

- **NumOccurencesOfCharacters**

This class helps you find number of characters in a String of your choice. You can find number of occurences of a character of your own choice or you can find number of occurences of all characters individually.

To use this library, simply make an object of this class, and call `findNumOccurencesOfCharacter( myString, myCharacter)` to find number of occurences of `myCharacter` in `myString`. You can also use the method `findNumOccurencesOfAllCharacters(myString)` to get number of occurences of all characters present in `myString`.

```
public int findNumOccurencesOfCharacter(String myString, char myCharacter){
  // returns int stating the number of occurences of myCharacter in myString
}
```

```
public void findNumOccurencesOfAllCharacters(String myString){
  // prints number of occurences of each character
}
```

Example code, for understanding

```
public static void main(String[] args){

    NumOccurencesOfCharacters nm = new NumOccurencesOfCharacters();
		
		nm.findNumOccurencesOfAllCharacters("hehehe"); // prints number for each character
		
		System.out.println(nm.findNumOccurencesOfCharacter("abcadefgh", 'a' )); // prints 2
    
}
```

- **Divisors**

This class finds all the divisors of the number of your choice in O(n) time, the time complexity will soon be decreased even furthur.

To use this class, just make a simple object of `Divisors` class and call `findDivisors()` method which returns you an `ArrayList<Integer>` which contains all the divisors of the number in ascending order.

```
public ArrayList<Integer> findDivisors(int number){
	// returns ArrayList of all the divisors of the number sorted in ascending order
}
```

Example code, for understanding:

```
public static void main(String[] args){

     Divisors d = new Divisors();
		
     System.out.println(d.findDivisors(10)); // returns [1,2,5,10]
    
}
```

- **CheckPrime**

Sometimes using Sieve's algorithm is much more redundant and we need a quick and even more efficient solution for checking if a number is Prime or not. This is the reason of existence of this class.

To use this class, just make a simple object of `CheckPrime` class and call `checkPrime()` method which returns you an `boolean` value corresponding to the number.

```
public boolean checkPrime(long number){
	// returns true if the number is prime, otherwise fase
}
```

Example code, for understanding:

```
public static void main(String[] args){

    CheckPrime cp = new CheckPrime();
    
    System.out.println(cp.checkPrime(999999937)); // gives true as this is the largest 9 digit prime number
    
}
```



**New additions will be on roll, keep a look out :)**
  
  
