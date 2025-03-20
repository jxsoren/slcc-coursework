/********************************************** 
 * Author: Josh Sorensen
 *
 * Assignment Volumes calculates the volumes
 * of various shapes.
 ***********************************************/

public class Volumes {

    public static double cuboid(double sideA, double sideB, double sideC) {
        return sideA * sideB * sideC;
    }

    public static double cuboid(double side) {
        return cuboid(side, side, side);
    }

    public static double ellipsoid(double sideA, double sideB, double sideC) {
        return (4d / 3d) * Math.PI * (sideA * sideB * sideC);
    }

    public static double ellipsoid(double side) {
        return ellipsoid(side, side, side);
    }

    public static double cylinder(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static double cone(double diameter, double side) {
        double radius = diameter / 2d;
        double radiusSquared = Math.pow(radius, 2);

        // Todo: Figure out how to get height
        // Need to use slant height by radius
        //

        int height = 0;

        return (1d / 3d) * Math.PI * radiusSquared * height;
    }
}
