### Instructions:

- Create a project called LabBall
- Add 2 files: Ball.java and BallApp.java  ( BallApp.java includes the main method )
- Once you added the appropriate class headers with empty class body and the empty main method compile and run to ensure that the project is set up properly
- **In Ball.java** implement class Ball as described above
    - Implement input validation in the setter. Only allow the size of the ball to be >= 0. If the size passed as an argument is negative, leave the field value unchanged (no action required).
    - Method roll should print “rolling . . .”
    - Method bounce should print how often the ball is bouncing depending on the parameter value  
         g. “bouncing 3 times” or “bouncing 1 times” (yes, there is a grammar mistake. No need to worry about it. If you like a challenge though, feel free to remove the extra 's')  
         \_Hint: this is a fill-in-the-blank situation and you can use printf to display the desired output
        \_
- **In BallApp.java in the main method** do the following
    - Create an instance of Ball called myBall. It should have size 5
    - Print the size of the ball (use a label)
    - Make the ball roll
    - Make the ball bounce 14 times
    - Increase the size of the ball to size 7
    - Print the size of the ball (a second time)

*Notice:*   
_The size is printed twice. First we used the label "Ball with size " and then we used just "size: "._  
_Labels are used to make the output clear and easy to read and understand. In the first line we included the information that the size we are displaying is the size of a ball. In the last line this information was no longer helpful and thus dropped._

**Expected Output:**  
Ball with size 5  
rolling . . .  
bouncing 14 times  
size: 7
