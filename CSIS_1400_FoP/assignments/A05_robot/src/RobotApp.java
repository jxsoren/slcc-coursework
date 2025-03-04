/*********************************************************
 * RobotApp solves three challenges where a robot needs 
 * to figure out the number of rooms in a given grid.
 *
 * Important: 
 * The code still needs to work when you change
 * the grid dimensions.
 *
 * Author: CS Starter Code + Josh Sorensen
 ********************************************************/

public class RobotApp {
    public static void main(String[] args) {
        // square 4x4 grid to demo how the robot can be controlled
//        Robot robot = new Robot(4, 4, 3, 0);
//        demo(robot);

        // square nxn grid with the robot in the south-west corner
        int n = 5;
//        Robot robot1 = new Robot(n, n, 0, n - 1);
//        challenge1(robot1);

        // rectangular grid with width w and height h
        // robot in the south-west corner
        int w1 = 5;
        int h1 = 7;
        Robot robot2 = new Robot(w1, h1, 0, h1 - 1);
        challenge2(robot2);

        // square nxn grid;
        int n2 = 6;
//        Robot robot3 = new Robot(n2, n2, 3, 1);
//        challenge3(robot3);

        // rectangular grid with width w and height h
        // robot's starting position: 4 over, 2 down
        int w2 = 8;
        int h2 = 4;
//        Robot robot4 = new Robot(w2, h2, 4, 2);
//        challenge4(robot4);
    }

    private static void challenge1(Robot robot) {
        // Init room length and width
        int roomLength = 1;
        int roomWidth = 1;

        // the robot is in the bottom left-most corner (south-west), so only direction
        // to get room length, keep walking north until there are no more doors
        while (robot.check('N')) {
            robot.go('N');
            roomLength++;
        }

        // now that we know we're at the north-most point, we can go east to get length
        // keep walking East until there are no more doors
        while (robot.check('E')) {
            robot.go('E');
            roomWidth++;
        }

        System.out.println(roomLength);
        System.out.println(roomWidth);

        // calculate area of room
        int numberOfRooms = roomLength * roomWidth;

        // -1 for 1 less door than one dimension of room
        // moves to get length = (roomLength - 1)
        // moves to get height = (roomHeight - 1)
        // 2n-2
        String roomExpression = String.format("%dn-%d", 2, 2);

        String robotOutput = String.format("%d rooms %s moves", numberOfRooms, roomExpression);
        robot.say(robotOutput);
    }

    private static void challenge2(Robot robot) {
        // init dimension vars
        int dim1 = 1;
        int dim2 = 1;

        // keep walking north until you've reached the end

        while (robot.check('N')) {
            robot.go('N');
            dim1++;
        }

        // walk east until you've reached the end

        while (robot.check('E')) {
            robot.go('E');
            dim2++;
        }

        // figure out which of the two saved values is higher
        // the higher one is the length and the lower is width

        int length;
        int width;

        if (dim1 > dim2) {
            length = dim1;
            width = dim2;
        } else {
            length = dim2;
            width = dim1;
        }

        // multiply the length by the height to get the number of rooms (area)
        // store value

        int numberOfRooms = length * width;

        // create expression to calculate the number of moves required
        // in a WxH grid

        String numberOfMovesExpression = "(L + W) - 2";

        // create formatted string to show number of rooms
        // and expression of moves


        String robotOutput = String.format("%d rooms %s moves",
                numberOfRooms,
                numberOfMovesExpression
        );

        robot.say(robotOutput);
    }

    private static void challenge3(Robot robot) {

        robot.say(3 + " rooms {expression of n} moves");
    }

    private static void challenge4(Robot robot) {
        // TODO: Solve challenge 4 and update text below

        robot.say(3 + " rooms {expression of w and h} moves");
    }

    // This method briefly demonstrates how the robot can be controlled.
    // Note that the message is not correct and needs to be fixed.
    private static void demo(Robot robot) {
        int count = 10;
        robot.go('S');
        robot.go('W');
        if (robot.check('N')) {
            robot.go('N');
            count++;
        }
        robot.go('E');
        robot.go('E'); // uncomment this line and see what happens

        robot.say(count + " rooms 2n + 5 moves");    // incorrect message
    }
}
