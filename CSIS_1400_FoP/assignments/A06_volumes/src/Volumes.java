/********************************************** 
 * Author: Josh Sorensen
 *
 * Assignment Volumes calculates the volumes
 * of various shapes.
 ***********************************************/

public class Volumes {

    public static double cuboid(double sideA, double sideB, double sideC) {
        // 1. Solve for volume
        // Equation: v = abc
        return sideA * sideB * sideC;
    }

    public static double cuboid(double side) {
        return cuboid(side, side, side);
    }

    public static double ellipsoid(double sideA, double sideB, double sideC) {
        // 1. Solve for volume
        // Equation: v = (4/3)* πabc
        return (4d / 3d) * Math.PI * (sideA * sideB * sideC);
    }

    public static double ellipsoid(double side) {
        return ellipsoid(side, side, side);
    }

    public static double cylinder(double radius, double height) {
        // 1. Solve for volume
        // Equation: v = πr²
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static double cone(double diameter, double side) {
        // 1. Solve for radius
        // Equation: r = d/2
        double radius = diameter / 2d;

        // 2. Solve for height
        // Equation: l² = h² + r²
        double radiusSquared = Math.pow(radius, 2);
        double slantHeightSquared = Math.pow(side, 2);
        double height = Math.sqrt(slantHeightSquared - radiusSquared);

        // 3. Solve for volume
        // Equation: v = (1/3)πr²h
        return (1d / 3d) * Math.PI * radiusSquared * height;
    }
}
