# MagicSquare.java

Create a class called MagicSquare.java.
A [magic square](https://en.wikipedia.org/wiki/Magic_square) includes the following **main method:**

```java
public static void main(String[] args) {
   int[][] square = {
      { 8, 11, 14, 1},
      {13, 2, 7,12},
      { 3, 16, 9, 6},
      {10, 5, 4, 15}
   };
   System.out.printf("The square %s a magic square. %n",
      (isMagicSquare(square) ? "is" : "is not"));
}
```

It is your job to write the **method isMagicSquare:**

```java
public static boolean isMagicSquare(int[][] square) {
   // TODO
}
```

**How do you know whether a 2-dimensional array is a magic square?**
First of all it needs to be a square. To keep the scope of the lab manageable you may assume that the 2-dimensional arrays passed have the same number of rows and columns and that there is at least one row and one column. The square is 'magic' if the numbers in each of the rows, columns, and diagonals add up to the same value (see image above)

*Recommendation: use private methods to structure your code.*