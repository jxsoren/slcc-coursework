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
        //        int n = 5;
        //        Robot robot1 = new Robot(n, n, 0, n - 1);
        //        challenge1(robot1);

        // rectangular grid with width w and height h
        // robot in the south-west corner
        //        int w1 = 5;
        //        int h1 = 7;
        //        Robot robot2 = new Robot(w1, h1, 0, h1 - 1);
        //        challenge2(robot2);

        // square nxn grid;
        //        int n2 = 6;
        //        Robot robot3 = new Robot(n2, n2, 3, 1);
        //        challenge3(robot3);

        // rectangular grid with width w and height h
        // robot's starting position: 4 over, 2 down
        int w2 = 4;
        int h2 = 8;
        Robot robot4 = new Robot(w2, h2, 2, 5);
        challenge4(robot4);
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
        char currentDirection = 0;
        int roomDimension = 1;

        // Get robot to the wall if not already there
        if (allDoorRoom(robot)) {
            currentDirection = 'N';

            while (robot.check(currentDirection)) {
                robot.go(currentDirection);
            }
        }

        // Invert direction of wall to go the other way
        if (!robot.check('N')) {
            currentDirection = 'S';
        } else if (!robot.check('E')) {
            currentDirection = 'W';
        } else if (!robot.check('S')) {
            currentDirection = 'N';
        } else if (!robot.check('W')) {
            currentDirection = 'E';
        }

        // Walk opposite direction and start dimension counter
        while (robot.check(currentDirection)) {
            robot.go(currentDirection);
            roomDimension++;
        }

        int numberOfRooms = roomDimension * roomDimension;
        String numberOfMovesExpression = "???";
        String robotOutput = String.format("%d rooms %s moves", numberOfRooms, numberOfMovesExpression);
        robot.say(robotOutput);
    }

    private static void challenge4(Robot robot) {
        char currentDirection = 'N';

        int roomDimension1 = 1;
        int roomDimension2 = 1;

        // Get robot to the wall if not already there
        if (allDoorRoom(robot)) {
            while (robot.check(currentDirection)) {
                robot.go(currentDirection);
            }
        }

        if (inCorner(robot)) {
            char[] currentCorner = whichCorner(robot);

            char direction1 = currentCorner[0];
            char direction2 = currentCorner[1];

            // Walk opposite of North or South to record dim1
            currentDirection = invertedDirection(direction1);
            while (robot.check(currentDirection)) {
                robot.go(currentDirection);
                roomDimension1++;
            }

            // Walk opposite of East or West to record dim2
            // If you walk longer then dim1, stop walking
            currentDirection = invertedDirection(direction2);
            while (robot.check(currentDirection) && roomDimension1 >= roomDimension2) {
                robot.go(currentDirection);
                roomDimension2++;
            }

        } else {
            // Plan if you don't start at a corner:
            // Step 1:
            //      Check which wall you're at and then go the opposite
            //      direction of wall and record that to dim 1
            // Step 2:
            //      Once you've hit the opposite wall, pick an adjacent
            //      direction and then start walking that way
            //      Step 2.1:
            //              If you walk for longer than what's recorded
            //              for dim 1, then you can stop walking, as
            //              you can assume the rest of the distance is
            //              2x whatever the dim1 is
            //      Step 2.2:
            //              If you hit a wall before you can definitively
            //              determine that one side is larger than the
            //              other, then you should go the opposite
            //              direction of the wall that you just hit and
            //              start your counter over at 1.
            //      Step 2.3:
            //              If you've hit a corner mark this as corner1,
            //              as it's possible that dim1 was the larger side
            //              of the rectangle room, so you need to keep
            //              track of whether you've definitively reached
            //              one corner already (corner1) and then have
            //              reached the opposite corner (corner2). In this
            //              case, you now know that dim1 was the larger
            //              side, so you can just divide dim1 in half and
            //              that will be what dim2 should be.

            char wallDirection = wallDirection(robot);
            currentDirection = invertedDirection(wallDirection);
            while (robot.check(currentDirection)) {
                robot.go(currentDirection);
                roomDimension1++;
            }

            currentDirection = adjacentDirection(currentDirection);

            boolean doubledBackedOnWall = false;

            while (roomDimension1 >= roomDimension2) {
                if (doubledBackedOnWall && hitDestinedWall(robot, currentDirection)) {
                    break;
                }

                if (inCorner(robot) && hitDestinedWall(robot, currentDirection)) {
                    break;
                }

                if (robot.check(currentDirection)) {
                    robot.go(currentDirection);
                } else {
                    roomDimension2 = 1;
                    doubledBackedOnWall = true;

                    currentDirection = invertedDirection(currentDirection);
                    robot.go(currentDirection);
                }

                roomDimension2++;
            }

        }

        int length;
        int width;

        if (roomDimension2 > roomDimension1) {
            length = 2 * roomDimension1;
            width = roomDimension1;
        } else {
            length = roomDimension1;
            width = roomDimension1 / 2;
        }

        int numberOfRooms = length * width;

        String numberOfMovesExpression = "???";
        String robotOutput = String.format("%d rooms %s moves", numberOfRooms, numberOfMovesExpression);
        robot.say(robotOutput);
    }

    // Helper Methods

    private static boolean northWall(Robot robot) {
        return !robot.check('N');
    }

    private static boolean eastWall(Robot robot) {
        return !robot.check('E');
    }

    private static boolean southWall(Robot robot) {
        return !robot.check('S');
    }

    private static boolean westWall(Robot robot) {
        return !robot.check('W');
    }

    public static boolean northEastCorner(Robot robot) {
        return northWall(robot) && eastWall(robot);
    }

    public static boolean northWestCorner(Robot robot) {
        return northWall(robot) && westWall(robot);
    }

    public static boolean southEastCorner(Robot robot) {
        return southWall(robot) && eastWall(robot);
    }

    public static boolean southWestCorner(Robot robot) {
        return southWall(robot) && westWall(robot);
    }

    private static boolean inCorner(Robot robot) {
        return northEastCorner(robot) || northWestCorner(robot) || southEastCorner(robot) || southWestCorner(robot);
    }

    private static char[] whichCorner(Robot robot) {
        char[] cornerDirection = new char[2];

        if (northEastCorner(robot)) {
            cornerDirection[0] = 'N';
            cornerDirection[1] = 'E';
        } else if (northWestCorner(robot)) {
            cornerDirection[0] = 'N';
            cornerDirection[1] = 'W';
        } else if (southEastCorner(robot)) {
            cornerDirection[0] = 'S';
            cornerDirection[1] = 'E';
        } else if (southWestCorner(robot)) {
            cornerDirection[0] = 'S';
            cornerDirection[1] = 'W';
        }

        return cornerDirection;
    }

    //    private static char adjacentCornerDirection(Robot robot, char direction) {
    //        char[] cornerDirections = whichCorner(robot);

    // If you're in the NorthEast corner, and you were going East
    // you'd now want to go South

    //        switch (direction) {
    //            case
    //        }

    //    }

    private static boolean hitDestinedWall(Robot robot, char direction) {
        return switch (direction) {
            case 'N' -> northWall(robot);
            case 'E' -> eastWall(robot);
            case 'S' -> southWall(robot);
            case 'W' -> westWall(robot);
            default -> false;
        };
    }

    private static boolean allDoorRoom(Robot robot) {
        return !northWall(robot) && !eastWall(robot) && !southWall(robot) && !westWall(robot);
    }

    private static char invertedDirection(char direction) {
        return switch (direction) {
            case 'N' -> 'S';
            case 'E' -> 'W';
            case 'S' -> 'N';
            case 'W' -> 'E';
            default -> '0';
        };
    }

    private static char adjacentDirection(char direction) {
        return switch (direction) {
            case 'N' -> 'E';
            case 'E' -> 'S';
            case 'S' -> 'W';
            case 'W' -> 'N';
            default -> '0';
        };
    }

    private static char wallDirection(Robot robot) {
        if (inCorner(robot)) {

        }

        if (northWall(robot)) {
            return 'N';
        } else if (eastWall(robot)) {
            return 'E';
        } else if (southWall(robot)) {
            return 'S';
        } else if (westWall(robot)) {
            return 'W';
        }

        return '0';
    }

}
