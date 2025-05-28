package a01;

import java.util.ArrayList;

/**
 * @author Josh Sorensen & Eugene ___
 * @class CSIS 1410
 * @assignment A01
 */

public class WarmUp {
    public static void main(String[] args) {

        // !---- Review Objects ----!
        System.out.println("Review Objects");

        // 1. Distance

        Point onePoint1A = new Point(3, 4);
        Point onePoint2A = new Point(3, 6);
        double distanceResultA = distance(onePoint1A, onePoint2A);

        System.out.printf("Distance between p1 %s and p2 %s is %s", onePoint1A, onePoint2A, distanceResultA);

        Point onePoint1B = new Point(3, 4);
        Point onePoint2B = new Point(3, 6);
        double distanceResultB = distance(onePoint1B, onePoint2B);

        System.out.printf("Distance between p1 %s and p2 %s is %s", onePoint1B, onePoint2B, distanceResultB);

        // 2. Greatest Distance From Origin

        Point twoPoint1A = new Point(4, 3);
        Point twoPoint2B = new Point(3, -1);
        Point twoPoint3B = new Point(3, 4);
        double greatestDistanceFromOriginResultA = greatestDistanceFromOrigin(twoPoint1A, twoPoint2B, twoPoint3B);

        System.out.printf("Both p1 (4, 3) and p3 (3, -4) have the same distance of 5 from the origin. Since p2 is closer to the origin, the greatest distance from the origin is 5.");

        // 3. Area

        // !---- Review Arrays ----!
        System.out.println("Review Arrays");

        // 4. First Eight Multiples

        // 5. First And Last To XXX

        // 6. Content

        // !---- Review ArrayList ----!
        System.out.println("Review ArrayList");


        // 7. Hyphenate

        // 8. More Of The Same

        // 9. Take
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
        // Todo: Implement Test

        // Todo: Implement Method
        return 0d;
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
        // Todo: Implement Test

        // Todo: Implement Method

        return 0d;
    }

    /**
     * This method returns the area of the rectangle that extends from the origin along the x-axis and y-axis to the point p, as shown below.
     * If p is located on the x-axis or y-axis, the length or width is 0, and the method should return 0.
     *
     * @param p point // Todo - write a better param description
     * @return // Todo - write return type here
     */
    public static double area(Point p) {
        // Todo: Implement Test

        // Todo: Implement Method

        return 0d;
    }

    // !---- Review Arrays ----!

    /**
     * This method returns an array that includes the first eight multiples of n.
     * Those are 1*n, 2*n, 8*n
     *
     * @param n number // Todo - write a better param description
     * @return // Todo - write return type here
     */

    public static int[] firstEightMultiples(int n) {
        // Todo: Implement Test

        // Todo: Implement Method

        return new int[0];
    }

    /**
     * This method ensures that the first and last elements of the array provided as argument point to "XXX".
     * If the array is empty, no changes should be made.
     * However, if the array includes one or more elements, the first and last elements might need to be exchanged.
     * The examples below show the array strings before and after the method call.
     *
     * @param strings Array of Strings // Todo - write a better param description
     */

    public static void firstAndLastToXXX(String[] strings) {
        // Todo: Implement Test

        // Todo: Implement Method
    }

    /**
     * This method creates a string that includes all points of the array separated by a period.
     * If the array is empty, an empty string should be returned. The array provided as arguments must not be changed.
     * The examples below show the array points that is passed to the method and the string that should be returned.
     *
     * @param points Array of Point objects // Todo - write a better param description
     * @return // Todo - write return type here
     */

    public static String content(Point[] points) {
        // Todo: Implement Test

        // Todo: Implement Method

        return new String();
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

}
