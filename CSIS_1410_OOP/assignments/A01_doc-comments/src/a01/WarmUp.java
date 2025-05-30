package a01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Josh Sorensen & Eugene An
 * @class CSIS 1410
 * @assignment A01
 */

public class WarmUp {
    public static void main(String[] args) {
        // !---- Review Objects ----!
        System.out.println("Review Objects");

        // 1. Distance
        printQuestionNumber("#1");

        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 6);
        double distanceResultA = distance(p1, p2);
        printAssertionMessage("Distance between p1 (3, 4) and p2 (3, 6)", "2", distanceResultA);

        Point p3 = new Point(1, 1);
        Point p4 = new Point(-3, -2);
        double distanceResultB = distance(p3, p4);
        printAssertionMessage("Distance between p3 (1, 1) and p4 (-3, -2)", "5", distanceResultB);

        // 2. Greatest Distance From Origin
        printQuestionNumber("#2");

        Point point1 = new Point(4, 3);
        Point point2 = new Point(3, -1);
        Point point3 = new Point(3, -4);
        double greatestDistanceFromOriginResultA = greatestDistanceFromOrigin(point1, point2, point3);
        printAssertionMessage("Greatest distance from origin for p1 (4, 3), p2 (3, -1) and p3(3, -4)", "5", greatestDistanceFromOriginResultA);

        Point point4 = new Point(-6, 8);
        Point point5 = new Point(5, 0);
        Point point6 = new Point(0, -7);
        double greatestDistanceFromOriginResultB = greatestDistanceFromOrigin(point4, point5, point6);
        printAssertionMessage("Greatest distance from origin for p4 (-6, 8), p5 (5, 0) and p6 (0, -7)", "10", greatestDistanceFromOriginResultB);

        // 3. Area
        printQuestionNumber("#3");

        Point pointA = new Point(6, 3);
        double areaResultA = area(pointA);
        printAssertionMessage("The area of the rectangle that extends from the origin along the x-axis and y-axis to the point (6, 3)", "18", areaResultA);

        Point pointB = new Point(-5, 3);
        double areaResultB = area(pointB);
        printAssertionMessage("The area of the rectangle that extends from the origin along the x-axis and y-axis to the point (-5, 3)", "15", areaResultB);

        Point pointC = new Point(5, -4);
        double areaResultC = area(pointC);
        printAssertionMessage("The area of the rectangle that extends from the origin along the x-axis and y-axis to the point (5, -4)", "20", areaResultC);

        Point pointD = new Point(0, -3);
        double areaResultD = area(pointD);
        printAssertionMessage("The area of the rectangle that extends from the origin along the x-axis and y-axis to the point (0, -3)", "0", areaResultD);

        // !---- Review Arrays ----!
        System.out.println("Review Arrays");

        // 1. First Eight Multiples
        printQuestionNumber("#1");

        int num1 = 3;
        int[] firstEightMultiplesResultA = firstEightMultiples(num1);
        printAssertionMessage("The first eight multiples of " + num1, "[3, 6, 9, 12, 15, 18, 21, 24]", firstEightMultiplesResultA);

        int num2 = -2;
        int[] firstEightMultiplesResultB = firstEightMultiples(num2);
        printAssertionMessage("The first eight multiples of " + num2, "[-2, -4, -6, -8, -10, -12, -14, -16]", firstEightMultiplesResultB);

        int num3 = 10;
        int[] firstEightMultiplesResultC = firstEightMultiples(num3);
        printAssertionMessage("The first eight multiples of " + num3, "[10, 20, 30, 40, 50, 60, 70, 80]", firstEightMultiplesResultC);

        // 2. First And Last To XXX
        printQuestionNumber("#2");

        String[] stringsA = {"A1", "B2", "C3", "D4"};
        String[] expectedA = {"XXX", "B2", "C3", "XXX"};
        firstAndLastToXXX(stringsA);
        printAssertionMessage("The Array after firstAndLastToXXX() is called", Arrays.toString(expectedA), Arrays.toString(stringsA));

        String[] stringsB = {"happy :)"};
        String[] expectedB = {"XXX"};
        firstAndLastToXXX(stringsB);
        printAssertionMessage("The Array after firstAndLastToXXX() is called", Arrays.toString(expectedB), Arrays.toString(stringsB));

        String[] stringsC = {};
        String[] expectedC = {};
        firstAndLastToXXX(stringsC);
        printAssertionMessage("The Array after firstAndLastToXXX() is called", Arrays.toString(expectedC), Arrays.toString(stringsC));

        // 3. Content
        printQuestionNumber("#3");

        Point[] pointsA = {new Point(1, 2), new Point(-3, 4), new Point(5, -6), new Point(7, 8)};
        String contentResultA = content(pointsA);
        printAssertionMessage("After content(" + Arrays.toString(pointsA) + ") is called, the result", "(1, 2).(-3, 4).(5, -6).(7, 8)", contentResultA);

        Point[] pointsB = {new Point(10, 1)};
        String contentResultB = content(pointsB);
        printAssertionMessage("After content(" + Arrays.toString(pointsB) + ") is called, the result", "(10, 1)", contentResultB);

        Point[] pointsC = {};
        String contentResultC = content(pointsC);
        String emptyStringResultC = "\"" + contentResultC + "\"";
        printAssertionMessage("After content(" + Arrays.toString(pointsC) + ") is called, the result", "\"\"", emptyStringResultC);

        // !---- Review ArrayList ----!
        System.out.println("Review ArrayList");

        // 1. Hyphenate

        // 2. More Of The Same

        // 3. Take
    }

    // !---- Review Objects ----!

    /**
     * This method returns the distance between p1 and p2.
     *
     * @param p1 Point 1 (coordinate on an XY graph)
     * @param p2 Point 2 (coordinate on an XY graph)
     * @return the distance between p1 and p2.
     */

    public static double distance(Point p1, Point p2) {
        int x1 = p1.getX();
        int y1 = p1.getY();

        int x2 = p2.getX();
        int y2 = p2.getY();

        int innerEquation = (int) Math.pow((x2 - x1), 2) + (int) Math.pow((y2 - y1), 2);

        return Math.sqrt(innerEquation);
    }

    /**
     * This method determines the greatest distance between any of the points and the origin (0, 0).
     *
     * @param p1 Point 1 (coordinate on an XY graph)
     * @param p2 Point 2 (coordinate on an XY graph)
     * @param p3 Point 3 (coordinate on an XY graph)
     * @return the greatest distance between any of the points and the origin (0, 0).
     */

    public static double greatestDistanceFromOrigin(Point p1, Point p2, Point p3) {
        Point origin = new Point(0, 0);

        double p1Distance = distance(origin, p1);
        double p2Distance = distance(origin, p2);
        double p3Distance = distance(origin, p3);

        double currentMaxDistance = 0d;
        double[] distances = {p1Distance, p2Distance, p3Distance};

        for (double distance : distances) {
            if (distance > currentMaxDistance) {
                currentMaxDistance = distance;
            }
        }

        return currentMaxDistance;
    }

    /**
     * This method returns the area of the rectangle that extends from the origin along the x-axis and y-axis to the point p, as shown below.
     * If p is located on the x-axis or y-axis, the length or width is 0, and the method should return 0.
     *
     * @param p A point (coordinate on an XY graph)
     * @return the area of the rectangle that extends from the origin along the x-axis and y-axis to the point p
     * or returns 0 if p is located on the x-axis or y-axis, the length or width is 0
     */

    public static double area(Point p) {
        int xCoordinate = p.getX();
        int yCoordinate = p.getY();

        // Guard clause to check if the point is on the x-axis or y-axis
        if (xCoordinate == 0 || yCoordinate == 0) {
            return 0d;
        }

        int width = Math.abs(xCoordinate);
        int height = Math.abs(yCoordinate);

        return width * height;
    }

    // !---- Review Arrays ----!

    /**
     * This method returns an array that includes the first eight multiples of n.
     *
     * @param n number to have first 8 multiples of returned by
     * @return an array that includes the first eight multiples of n.
     */

    public static int[] firstEightMultiples(int n) {
        int[] multiples = new int[8];

        for (int i = 0; i < 8; i++) {
            int multipleValue = i + 1;
            multiples[i] = multipleValue * n;
        }

        return multiples;
    }

    /**
     * This method ensures that the first and last elements of the array provided as argument point to "XXX".
     * If the array is empty, no changes should be made.
     * However, if the array includes one or more elements, the first and last elements might need to be exchanged.
     * The examples below show the array strings before and after the method call.
     *
     * @param strings array of Strings
     */

    public static void firstAndLastToXXX(String[] strings) {
        // Guard clause to protect against empty arrays
        if (strings.length == 0) {
            return;
        }

        strings[0] = "XXX";
        strings[strings.length - 1] = "XXX";
    }

    /**
     * This method creates a string that includes all points of the array separated by a period.
     * If the array is empty, an empty string should be returned. The array provided as arguments must not be changed.
     * The examples below show the array points that is passed to the method and the string that should be returned.
     *
     * @param points Array of Point objects
     * @return a string that includes all points of the array separated by a period
     */

    public static String content(Point[] points) {
        StringBuilder currentString = new StringBuilder();

        for (int i = 0; i < points.length; i++) {
            currentString.append(points[i]);

            // Append period unless you're at last element
            if (i != points.length - 1) {
                currentString.append(".");
            }
        }

        return currentString.toString();
    }

    // !---- Review ArrayList ----!


    /**
     * This method creates a string that includes all syllables of the list separated by dashes.
     * If the list is empty, an empty string should be returned.
     * The lists provided as arguments must not be changed in the process.
     *
     * @param syllables ArrayList of syllable strings // Todo - write a better param description
     * @return // Todo - write return type here
     */

    // ArrayList
    public static String hyphenate(ArrayList<String> syllables) {
        // Todo: Implement Test

        // Todo: Implement Method

        return new String();
    }

    /**
     * This method creates and returns a list of type ArrayList<String> that includes five strings.
     * The first string has length 1 and includes the character provided as an argument once.
     * The second string has length 2 and includes the character twice, etc.
     * The fifth string has length 5 and includes the character five times.
     *
     * @param c a character // Todo - write a better param description
     * @return // Todo - write return type here
     */

    public static ArrayList<String> moreOfTheSame(char c) {
        // Todo: Implement Test

        // Todo: Implement Method

        return new ArrayList<String>();
    }

    // Good template to use:

    /**
     * Creates and returns a new list that includes the first n points from the list
     * provided as an argument. The original list is not modified.
     * <p>
     * If n is 0, an empty list is returned.
     *
     * @param list the ArrayList of Point objects from which to take elements
     * @param n    the number of elements to take from the beginning of the list
     * @return a new ArrayList containing the first n Point objects from the input list
     * @throws IllegalArgumentException if n is negative or greater than the list size
     */

    public static ArrayList<Point> take(ArrayList<Point> list, int n) {
        // Todo: Implement Test

        // Todo: Implement Method

        return new ArrayList<Point>();
    }

    // Output Helper Methods

    private static void printQuestionNumber(String questionNumber) {
        System.out.printf("\t%s%n", questionNumber);
    }

    private static void printAssertionMessage(String subject, String expected, String actual) {
        System.out.printf("\t\t%s is expected to be %s and is actually %s%n", subject, expected, actual);
    }

    private static void printAssertionMessage(String subject, String expected, Double actual) {
        System.out.printf("\t\t%s is expected to be %s and is actually %.0f%n", subject, expected, actual);
    }

    private static void printAssertionMessage(String subject, String expected, int[] actual) {
        System.out.printf("\t\t%s is expected to be %s and is actually %s%n", subject, expected, Arrays.toString(actual));
    }

    private static void printAssertionMessage(String subject, String expected, String[] actual) {
        System.out.printf("\t\t%s is expected to be %s and is actually %s%n", subject, expected, Arrays.toString(actual));
    }

}
