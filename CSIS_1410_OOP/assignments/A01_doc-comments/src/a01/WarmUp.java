package a01;

import java.util.*;

/**
 * @author Josh Sorensen & Eugene An
 * @class CSIS 1410
 * @assignment A01 - Doc Comments | Review 1400
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
        printSpacer();
        System.out.println("Review Arrays");

        // 1. First Eight Multiples
        printQuestionNumber("#1");

        int num1 = 3;
        int[] firstEightMultiplesResultA = firstEightMultiples(num1);
        printAssertionMessage("The first eight multiples of " + num1, "[3, 6, 9, 12, 15, 18, 21, 24]", Arrays.toString(firstEightMultiplesResultA));

        int num2 = -2;
        int[] firstEightMultiplesResultB = firstEightMultiples(num2);
        printAssertionMessage("The first eight multiples of " + num2, "[-2, -4, -6, -8, -10, -12, -14, -16]", Arrays.toString(firstEightMultiplesResultB));

        int num3 = 10;
        int[] firstEightMultiplesResultC = firstEightMultiples(num3);
        printAssertionMessage("The first eight multiples of " + num3, "[10, 20, 30, 40, 50, 60, 70, 80]", Arrays.toString(firstEightMultiplesResultC));

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
        printSpacer();
        System.out.println("Review ArrayList");

        // 1. Hyphenate
        printQuestionNumber("#1");
        ArrayList<String> syllablesA = new ArrayList<>(Arrays.asList("beau", "ti", "ful"));
        String hyphenateResultA = hyphenate(syllablesA);
        printAssertionMessage("After hyphenate(" + syllablesA + ") is called, the result", "beau-ti-ful", hyphenateResultA);

        ArrayList<String> syllablesB = new ArrayList<>(List.of("hi"));
        String hyphenateResultB = hyphenate(syllablesB);
        printAssertionMessage("After hyphenate(" + syllablesB + ") is called, the result", "hi", hyphenateResultB);

        ArrayList<String> syllablesC = new ArrayList<>();
        String hyphenateResultC = hyphenate(syllablesC);
        String emptyStringHyphenateResultC = "\"" + hyphenateResultC + "\"";
        printAssertionMessage("After hyphenate(" + syllablesC + ") is called, the result", "\"\"", emptyStringHyphenateResultC);

        // 2. More Of The Same
        printQuestionNumber("#2");
        char firstCharacter = 'x';
        ArrayList<String> moreOfTheSameResultA = moreOfTheSame(firstCharacter);
        String[] expectedMoreOfTheSameResultA = {"x", "xx", "xxx", "xxxx", "xxxxx"};
        printAssertionMessage("After hyphenate(" + firstCharacter + ") is called, the result", Arrays.toString(expectedMoreOfTheSameResultA), moreOfTheSameResultA.toString());

        char secondCharacter = '~';
        ArrayList<String> moreOfTheSameResultB = moreOfTheSame(secondCharacter);
        String[] expectedMoreOfTheSameResultB = {"~", "~~", "~~~", "~~~~", "~~~~~"};
        printAssertionMessage("After hyphenate(" + secondCharacter + ") is called, the result", Arrays.toString(expectedMoreOfTheSameResultB), moreOfTheSameResultB.toString());

        // 3. Take
        printQuestionNumber("#3");
        Point[] pointList = {new Point(1, -2), new Point(3, 4), new Point(5, 6), new Point(-7, -8)};

        ArrayList<Point> pointListA = new ArrayList<>();
        Collections.addAll(pointListA, pointList);
        int numberOfPointsA = 3;
        ArrayList<Point> takeResultA = take(pointListA, numberOfPointsA);
        printAssertionMessage("After hyphenate(" + pointListA + ", " + numberOfPointsA + ") is called, the result", "[(1, -2), (3, 4), (5, 6)]", takeResultA.toString());

        ArrayList<Point> pointListB = new ArrayList<>();
        Collections.addAll(pointListB, pointList);
        int numberOfPointsB = 1;
        ArrayList<Point> takeResultB = take(pointListB, numberOfPointsB);
        printAssertionMessage("After hyphenate(" + pointListB + ", " + numberOfPointsB + ") is called, the result", "[(1, -2)]", takeResultB.toString());

        ArrayList<Point> pointListC = new ArrayList<>();
        Collections.addAll(pointListC, pointList);
        int numberOfPointsC = 0;
        ArrayList<Point> takeResultC = take(pointListC, numberOfPointsC);
        printAssertionMessage("After hyphenate(" + pointListC + ", " + numberOfPointsC + ") is called, the result", "[]", takeResultC.toString());

        ArrayList<Point> pointListD = new ArrayList<>();
        Collections.addAll(pointListD, pointList);
        int numberOfPointsD = -1;

        try {
            take(pointListD, numberOfPointsD);
        } catch (IllegalArgumentException e) {
            printAssertionMessage("After hyphenate(" + pointListD + ", " + numberOfPointsD + ") is called, the result", "an exception should be thrown", e.getMessage());
        }

        ArrayList<Point> pointListE = new ArrayList<>();
        Collections.addAll(pointListE, pointList);
        int numberOfPointsE = 5;
        try {
            take(pointListE, numberOfPointsE);
        } catch (IllegalArgumentException e) {
            printAssertionMessage("After hyphenate(" + pointListE + ", " + numberOfPointsE + ") is called, the result", "an exception should be thrown", e.getMessage());
        }
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
        Point origin = Point.ORIGIN;

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
     * @param syllables ArrayList of syllable strings
     * @return a string that includes all syllables of the list separated by dashes
     */

    // ArrayList
    public static String hyphenate(ArrayList<String> syllables) {
        StringBuilder sb = new StringBuilder();
        for (String syllable : syllables) {
            sb.append(syllable);

            // Add trailing hyphen only if syllable isn't the final one
            if (!syllable.equals(syllables.getLast())) {
                sb.append("-");
            }
        }

        return sb.toString();
    }

    /**
     * This method creates and returns a list of type ArrayList<String> that includes five strings.
     * The first string has length 1 and includes the character provided as an argument once.
     * The second string has length 2 and includes the character twice, etc.
     * The fifth string has length 5 and includes the character five times.
     *
     * @param c a character to be repeated
     * @return a list of type ArrayList<String> that includes five strings
     */

    public static ArrayList<String> moreOfTheSame(char c) {
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            String repeatedString = Character.toString(c).repeat(i);
            strings.add(repeatedString);
        }

        return strings;
    }

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
        if (n < 0 || n > list.size()) {
            throw new IllegalArgumentException("The list doesn't have " + n + " elements.");
        }

        ArrayList<Point> points = new ArrayList<Point>();

        for (int i = 0; i < n; i++) {
            points.add(list.get(i));
        }

        return points;
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

    private static void printSpacer() {
        System.out.print("\n\n");
    }
}
