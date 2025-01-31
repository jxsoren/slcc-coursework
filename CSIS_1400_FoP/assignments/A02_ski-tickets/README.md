**Description**:

Write a program that reads in information from the user and prints it aligned in columns.

Make sure to follow best practices like proper indentation, following Java naming conventions, using single empty lines
to structure the code, including a block comment as described in A01, etc.

**Disclaimer**:

> For professional software development you should not use double to represent money; the rounding errors could impact
> the data. For our small example the limited precision is not a problem.

**Instructions**:

- Create a file called SkiTickets.java
- It includes the class SkiTickets with the main method.
- Read in the following information from the user in the order specified:
    - Number of adult tickets
    - Number of youth tickets
    - Name
- Allow names that consists of multiple words like Anna Maria
- Print an invoice based on the information provided.
- For adult tickets charge $93, for youth tickets charge $47 per ticket.
- The input / output should look like the sample output below if the user enters the same numbers. Please pay attention
  to details like spaces, special characters, etc.
- Notice that there are two empty lines to separate input from the output.
- Notice also that all columns are left aligned except for the prices. Dollar amounts are right aligned.

Sample Output:

```plaintext
Number of adult tickets: 4
Number of youth tickets: 11
Name: Anna Maria


Invoice for Anna Maria:

Adult tickets  4  .. $ 372.00
Youth tickets  11 .. $ 517.00
-----------------------------
                     $ 889.00
                     ========
```
