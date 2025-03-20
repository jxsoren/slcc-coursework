# Lab Rectangle with Menu

Download the starter project LabRectangleWithMenu.zip, unzip the file and open it in jGrasp.

There are two files: Rectangle.java and RectangleMenu.java. 

Rectangle.java includes the class Rectangle. This class is already completed and should not be modified. 

RectangleMenu includes a method called menuPrompt and main. 

Complete the main method by doing the following:

- Create an instance of Rectangle and initialize it with length 5 and width 4
- Create an integer variable called selection. No need to initialize it at this point.
  The variable selection needs to be declared before the do-while loop because we want to use it in 
  the condition at the end of the do-while loop.
- Create a do-while loop that does the following:
  - call the method menuPrompt to prompt the user with a menu
  - read in a selction from the user (What is a good place to declare the Scanner instance? )
  - use a switch statement to respond to the user selection
    - e.g. if user selects area the area of the rectangle should be printed
    - if the user selects 0 the program should print `good bye`
    - if the user enters a value less than 0 or greater 3 the program should print `invalid input`
  - The do-while loop should continue until the user enters 0 to exit

## do-while loop
```java
do 
{
    statement(s)
} while (expression);
```

### switch statement
```java 
switch (selection) 
{
    case 0: 
        statement(s)
        break;
    case 1: 
        statement(s)
        break;
    .
    . 
    .
    default: 
        statement(s)
        break;
}
```

