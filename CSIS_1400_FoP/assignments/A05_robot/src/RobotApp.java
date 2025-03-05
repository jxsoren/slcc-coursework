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
        char nextDirection = 0;
        int roomDimension = 1;

        boolean northWall = !robot.check('N');
        boolean eastWall = !robot.check('E');
        boolean southWall = !robot.check('S');
        boolean westWall = !robot.check('W');
        boolean wallPresent = northWall || eastWall || southWall || westWall;

        // Get robot to the wall if not already there
        if (!wallPresent) {
            nextDirection = 'N';

            while (robot.check(nextDirection)) {
                robot.go(nextDirection);
            }
        }

        // Invert direction of wall to go the other way
        if (!robot.check('N')) {
            nextDirection = 'S';
        } else if (!robot.check('E')) {
            nextDirection = 'W';
        } else if (!robot.check('S')) {
            nextDirection = 'N';
        } else if (!robot.check('W')) {
            nextDirection = 'E';
        }

        // Walk opposite direction and start dimension counter
        while (robot.check(nextDirection)) {
            robot.go(nextDirection);
            roomDimension++;
        }

        int numberOfRooms = roomDimension * roomDimension;
        String numberOfMovesExpression = "???";
        String robotOutput = String.format("%d rooms %s moves", numberOfRooms, numberOfMovesExpression);
        robot.say(robotOutput);
    }

    private static void challenge4(Robot robot) {

        // One side is 2x larger than the other


        int numberOfRooms = 0;
        String numberOfMovesExpression = "???";
        String robotOutput = String.format("%d rooms %s moves", numberOfRooms, numberOfMovesExpression);
        robot.say(robotOutput);
    }

}
