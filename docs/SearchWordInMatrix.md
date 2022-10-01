# **SearchWordInMatrix**

Searches a word in a 2D character matrix

> To use this class, just use SearchWordInMatrix.exist(characterArray, word) inside the main class

```java
public boolean exist(char[][] array, string word) {
        //returns the result in a boolean form
}
```

Example code, for understanding:

```java
public static void main(String[] args) {
        SearchWordInMatrix searchWordInMatrix = new SearchWordInMatrix();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(searchWordInMatrix.exist(board, "ABZDC"));
}
```
