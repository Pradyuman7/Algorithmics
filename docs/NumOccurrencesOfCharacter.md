# **NumOccurencesOfCharacters**

This class helps you find number of characters in a String of your choice. You can find number of occurences of a character of your own choice or you can find number of occurences of all characters individually.

> To use this library, simply make an object of this class, and call `findNumOccurencesOfCharacter( myString, myCharacter)` to find number of occurences of `myCharacter` in `myString`. You can also use the method `findNumOccurencesOfAllCharacters(myString)` to get number of occurences of all characters present in `myString`.

```java
public int findNumOccurencesOfCharacter(String myString, char myCharacter){
  // returns int stating the number of occurences of myCharacter in myString
}
```

```java
public void findNumOccurencesOfAllCharacters(String myString){
  // prints number of occurences of each character
}
```

Example code, for understanding

```java
public static void main(String[] args){

    NumOccurencesOfCharacters nm = new NumOccurencesOfCharacters();
		
    nm.findNumOccurencesOfAllCharacters("hehehe"); // prints number for each character
		
    System.out.println(nm.findNumOccurencesOfCharacter("abcadefgh", 'a' )); // prints 2
    
}
```