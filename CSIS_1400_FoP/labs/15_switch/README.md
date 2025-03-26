# Simple Calculator

A basic Java console application that performs arithmetic operations on two numbers.

## Instructions

1. **Set up the program:**
   * Create a new Java class named **SimpleCalculator**. It should include the main method.

2. **Input:**
   * Prompt the user to enter two numbers.
   * Prompt the user to enter a mathematical operator (**+**, **-**, **\***, **/**).

3. **Processing:**
   * Use a **switch** statement to determine which arithmetic operation to perform based on the operator:
      * `+`: Add the two numbers.   
      * `-`: Subtract the second number from the first.
      * `*`: Multiply the two numbers.
      * `/`: Divide the first number by the second (handle division by zero - see sample output)
   * Include a **default case** to handle invalid operators. It should alert the user that the operator was invalid and ask to use +, -, *, or /

4. **Output:**
   * Display the operation and the result in a clear and formatted message.

5. **Error Handling:**
   * If the user enters an invalid operator, display an appropriate error message.
   * If the user attempts to divide by zero, display an error message and do not perform the calculation.
 
## Sample Input/Output

**Example 1:**
```
Enter the first number: 10
Enter the second number: 2
Enter an operator (+, -, *, /): /
Result: 10 / 2 = 5.0
```

**Example 2:**
```
Enter the first number: 15
Enter the second number: 0
Enter an operator (+, -, *, /): /
Error: Division by zero is not allowed.
```

**Example 3:**
```
Enter the first number: 8
Enter the second number: 3
Enter an operator (+, -, *, /): x
Error: Invalid operator. Please use +, -, *, or /.
```

## Extension Ideas (Optional)

Adding extra features to your program is a great way to enhance your programming fluency and build valuable skills. See whether you would like to give one of following a try:

* Add support for more operations (e.g., modulus **%**).
* Allow the user to perform multiple calculations without restarting the program.
* Round the output to two decimal places.

While these ideas are optional, they provide an opportunity to think creatively and apply what you've learned in new ways.
