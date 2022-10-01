# **FindPhrase**

Many times we have to find number of times a string is found in a bigger string of our choice, and finding a solution efficiently might take quite a time, on a not-so good day. Hence this class, which helps you find what you're looking for, easily.

> To use this class, just make a simple object of `FindPhrase` class and call `timesFound(string, phrase)` method which returns you the number of times, phrase was found in the string.

```java
public int timesFound(String string, String phrase){
	// returns number of times phrase was found in the string
}
```

Example code, for understanding:

```java
public static void main(String[] args){

	FindPhrase fp = new FindPhrase();
		
	System.out.println(fp.timesFound("SOSSOSOS", "OS")); // returns 3
    
}
```
