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
        // square nxn grid with the robot in the south-west corner
        int n = 5;
        Robot robot1 = new Robot(n, n, 0, n - 1);
        challenge1(robot1);

        // rectangular grid with width w and height h
        // robot in the south-west corner
        int w1 = 5;
        int h1 = 7;
        Robot robot2 = new Robot(w1, h1, 0, h1 - 1);
        challenge2(robot2);

        // square nxn grid
        int n2 = 6;
        Robot robot3 = new Robot(n2, n2, 3, 1);
        challenge3(robot3);

        // rectangular grid with width w and height h
        // robot's starting position: 4 over, 2 down
        int w2 = 4;
        int h2 = 8;
        Robot robot4 = new Robot(w2, h2, 2, 5);
        challenge4(robot4);
    }

    private static void challenge1(Robot robot) {
        int roomHeight = 1;

        // Robot starts at South-West corner

        // Keep walking North until you reach the North wall
        while (robot.check('N')) {
            robot.go('N');
            roomHeight++;
        }

        // Since it's a square room, you only need to know
        // a single dimension to get the amount of rooms (n * n)
        int numberOfRooms = roomHeight * roomHeight;

        String roomExpression = "n - 1";
        String robotOutput = String.format("%d rooms %s moves", numberOfRooms, roomExpression);

        robot.say(robotOutput);
    }

    private static void challenge2(Robot robot) {
        int roomDimension1 = 1;
        int roomDimension2 = 1;

        // Robot starts at South-West corner

        // Keep walking North until you reach the North wall
        while (robot.check('N')) {
            robot.go('N');
            roomDimension1++;
        }

        // Once you're in the North-West corner, walk East
        // until you hit the North-East corner
        while (robot.check('E')) {
            robot.go('E');
            roomDimension2++;
        }

        // Multiply dim1 and dim2 together to get the amount of rooms
        int numberOfRooms = roomDimension1 * roomDimension2;

        // (W - 1) + (H - 1) = (W + H) - 2
        String numberOfMovesExpression = "(W + H) - 2";
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
        currentDirection = invertedDirection(currentDirection);

        // Walk opposite direction and start dimension counter
        while (robot.check(currentDirection)) {
            robot.go(currentDirection);
            roomDimension++;
        }

        // Square one of the room's dimensions to get number of rooms
        int numberOfRooms = roomDimension * roomDimension;

        String numberOfMovesExpression = "4n - 4";
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

            currentDirection = invertedDirection(direction1);
            while (robot.check(currentDirection)) {
                robot.go(currentDirection);
                roomDimension1++;
            }

            currentDirection = invertedDirection(direction2);
            while (robot.check(currentDirection) && roomDimension1 >= roomDimension2) {
                robot.go(currentDirection);
                roomDimension2++;
            }

        } else {
            char wallDirection = wallDirection(robot);
            currentDirection = invertedDirection(wallDirection);

            while (robot.check(currentDirection)) {
                robot.go(currentDirection);
                roomDimension1++;
            }

            currentDirection = adjacentDirection(currentDirection);
            int cornerCounter = 0;

            while (roomDimension1 >= roomDimension2 && cornerCounter < 2) {

                if (inCorner(robot)) {
                    cornerCounter++;
                    currentDirection = invertedDirection(currentDirection);
                    roomDimension2 = 1;
                }

                if (cornerCounter < 2) {
                    robot.go(currentDirection);
                    roomDimension2++;
                }
            }

        }

        int width;
        int height;

        if (roomDimension2 > roomDimension1) {
            width = roomDimension1;
            height = 2 * roomDimension1;
        } else {
            width = roomDimension1 / 2;
            height = roomDimension1;
        }

        int numberOfRooms = height * width;

        String numberOfMovesExpression = "2(W + H - 2)";
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
