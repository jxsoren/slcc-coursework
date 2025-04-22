# Matrix Class Implementation

## Description

Create an immutable datatype called Matrix. It represents an m x n matrix (a matrix with m rows and n columns).

## Class Specification

Implement class Matrix as specified in the UML class diagram.

## Constructors

Notice the three overloaded constructors:

1. **Matrix(m: int, n: int)** - Creates an m x n matrix and fills it with random floating point numbers

2. **Matrix(data: double[][])** - Creates a matrix based on the data provided in the two-dimensional array
   - Make sure to copy the data provided as argument to ensure immutability

3. **Matrix(matrix: Matrix)** - This constructor is a ***copy constructor***
   - A copy constructor is a constructor that creates and initializes a new object from existing object (instance) of the same type
   - In order to avoid code repetition, this constructor should be implemented by calling the overloaded constructor that accepts an array as an argument

## Matrix Operations

For a refresher on how to add and subtract matrices, you can check out [this resource](http://www.purplemath.com/modules/mtrxadd.htm).

Remember that the class Matrix is immutable. When we add or subtract we return the result but the matrix remains unchanged.

## Display Method

The method `print` should print the matrix elements in a tabular form:
- All numbers should be rounded to 2 decimal places
- Choose a column width so that all numbers less than one thousand are displayed well (see output)

