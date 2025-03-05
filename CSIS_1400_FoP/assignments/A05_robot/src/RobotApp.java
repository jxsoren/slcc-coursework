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
//        Robot robot2 = new Robot(w1, h1, 0, h1 - 1);
//        challenge2(robot2);

        // square nxn grid;
        int n2 = 6;
        Robot robot3 = new Robot(n2, n2, 3, 1);
        challenge3(robot3);

        // rectangular grid with width w and height h
        // robot's starting position: 4 over, 2 down
        int w2 = 8;
        int h2 = 4;
//        Robot robot4 = new Robot(w2, h2, 4, 2);
//        challenge4(robot4);
    }

    private static void challenge1(Robot robot) {
        int roomHeight = 1;

        while (robot.check('N')) {
            robot.go('N');
            roomHeight++;
        }

        // Since it's a square room, you only need to know
        // a single dimension to get the amount of rooms (n * n)
        int numberOfRooms = roomHeight * roomHeight;

        // 2(n - 1) = 2n - 2
        String roomExpression = String.format("%dn-%d", 2, 2);
        String robotOutput = String.format("%d rooms %s moves", numberOfRooms, roomExpression);

        robot.say(robotOutput);
    }

    private static void challenge2(Robot robot) {
        int dim1 = 1;
        int dim2 = 1;

        while (robot.check('N')) {
            robot.go('N');
            dim1++;
        }

        while (robot.check('E')) {
            robot.go('E');
            dim2++;
        }

        int length;
        int width;

        if (dim1 > dim2) {
            length = dim1;
            width = dim2;
        } else {
            length = dim2;
            width = dim1;
        }

        int numberOfRooms = length * width;

        // (L - 1) + (W - 1) = (L + W) - 2
        String numberOfMovesExpression = "(L + W) - 2";
        String robotOutput = String.format("%d rooms %s moves", numberOfRooms, numberOfMovesExpression);

        robot.say(robotOutput);
    }

    private static void challenge3(Robot robot) {
        char nextDirection = '0';
        boolean isDoor = robot.check('N') || robot.check('E') || robot.check('S') || robot.check('W');

        while (isDoor) {
            if (!robot.check('N')) {
                nextDirection = 'S';
                break;
            }

            if (!robot.check('E')) {
                nextDirection = 'W';
                break;
            }

            if (!robot.check('S')) {
                nextDirection = 'N';
                break;
            }

            if (!robot.check('W')) {
                nextDirection = 'E';
                break;
            }
        }

        int roomSize = 1;

        while (robot.check(nextDirection)) {
            robot.go(nextDirection);
            roomSize++;
        }

        int numberOfRooms = roomSize * roomSize;

        String numberOfMovesExpression = "";
        String robotOutput = String.format("%d rooms %s moves", numberOfRooms, numberOfMovesExpression);

        robot.say(robotOutput);
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
