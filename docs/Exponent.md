# **Exponent**

This class offers some static methods, offering ways to calculate the n'th power of a number. Usage is rather trivial as shown below:

```java
public static void main(String[] args){

	System.out.println(Exponent.modExp(2163, 1231, 32)); // 27, runs in <1 ms on my machine
    
}
```

The most interesting utility function offered is the `modExp` function, because it can calculate powers to a certain modulus in constant time. 
