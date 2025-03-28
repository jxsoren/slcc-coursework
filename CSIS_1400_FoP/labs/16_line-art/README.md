# Line Art Lab

## Objective
 
In this lab, you will:
1. Practice working with classes and objects.
2. Learn how to use **has-a relationships** in object-oriented design.
3. Use arrays to manage multiple objects.
4. Integrate the **StdDraw** class to create simple line art.

## Getting Started

### Set Up Your Project:
* Create a folder called `lineArt`.
* Download the StdDraw.java file and add it to the `lineArt` folder.
* Add a file **Point.java** that includes a public class **Point** that represents a point with an x and y coordinate. The coordinates are integers. The class has a parameterized constructor and two getters.
* Add three new Java files: **Line.java**, **Drawing.java**, and **LineArt.java**. For now, these files are empty, but that will change soon.
 
## Step 1: Create the Line Class

A **Line** object represents a line segment with two endpoints. It has two **Point** objects: start and end.

### Implementation:
* Add the following fields to the **Line** class:
   * `private Point start;`
   * `private Point end;`
* Write the following constructors/methods:
   * A constructor to initialize the start and end points.
   * A method `draw()` Hint: Use the method `StdDraw.line()` to draw the line.

## Step 2: Create the Drawing Class

A **Drawing** object manages multiple **Line** objects and displays them on a 25x25 canvas.

### Implementation:
* Add the following fields to the **Drawing** class:
   * `private Line[] lines;`
* Write the following constructors/methods:
   * **Constructor 1**: Accepts an array of **Line** objects and initializes the **lines** field.
   * **Constructor 2**: This parameterless constructor generates 10 random **Line** objects and stores them in the **lines** array. Use the **Random** class to create random start and end points. Generate x and y coordinates from [0, 25]. This will keep your points within a 25x25 canvas.
   * **Method draw()**: The **draw()** method is responsible for rendering the lines on the canvas using the **StdDraw** class. Before drawing, it needs to:
      * **Set up the canvas scale**: Use `StdDraw.setXscale(0, 25)` and `StdDraw.setYscale(0, 25)` to configure the coordinate system to match the range of the **Point** objects (from 0 to 25 on both axes). This ensures that all points and lines are drawn within the visible canvas.
      * **Clear the canvas**: Use `StdDraw.clear()` to clear any previous drawings, ensuring a clean canvas for the current set of lines.
      * **Draw each line**: Iterate through the **lines** array and call the **draw()** method of each **Line** object. Note that we set up the Canvas once at the beginning of the method. Then we draw all the lines.

## Step 3: Create the LineArt Class With the main Method

The main method tests the **Drawing** class by creating drawings and displaying them.

### Steps:
* Create a **Drawing** object with 10 random lines.
* Call the **draw()** method to display the lines.
* Pause for 3 seconds.
* Create another **Drawing** object with your own custom drawing. It should consist of 4-8 custom lines using hard-coded Point objects of your choice. The drawing should result in a recognizable shape (e.g., a minute glass, a rectangle, etc.). Call the **draw()** method to display your drawing.

