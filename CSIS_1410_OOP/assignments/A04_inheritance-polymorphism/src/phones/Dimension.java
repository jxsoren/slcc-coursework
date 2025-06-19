package phones;

/**
 * Represents the physical dimensions of a phone.
 * Contains height, width, and depth measurements in unspecified units.
 * All dimension values must be positive.
 *
 * @author Josh Sorensen
 */

public class Dimension {
    private double height;
    private double width;
    private double depth;

    /**
     * Constructs a new Dimension with the specified height, width, and depth.
     * All values must be positive (greater than zero).
     *
     * @param height the height of the dimension
     * @param width  the width of the dimension
     * @param depth  the depth of the dimension
     * @throws IllegalArgumentException if any dimension value is zero or negative
     */

    public Dimension(double height, double width, double depth) {
        if (height <= 0 || width <= 0 || depth <= 0) {
            throw new IllegalArgumentException("The height, width, and depth of a dimension needs to be positive.");
        } else {
            this.height = height;
            this.width = width;
            this.depth = depth;
        }
    }

    /**
     * Gets the height of this dimension.
     *
     * @return the height value
     */

    public double getHeight() {
        return height;
    }

    /**
     * Gets the width of this dimension.
     *
     * @return the width value
     */

    public double getWidth() {
        return width;
    }

    /**
     * Depth of the dimension
     *
     * @return the dimension's depth
     */

    public double getDepth() {
        return depth;
    }

    /**
     * Returns a string that contains the height, width and depth of the dimension
     * <p>
     * E.g., the dimensions 137.81 x 64 x 9.2 return:<br>
     * (137.8 x 64.0 x 9.2)
     *
     * @return a string that contains the height, width and depth of the dimension
     */

    @Override
    public String toString() {
        return String.format("(%.1f x %.1f x %.1f)", getHeight(), getWidth(), getDepth());
    }
}
