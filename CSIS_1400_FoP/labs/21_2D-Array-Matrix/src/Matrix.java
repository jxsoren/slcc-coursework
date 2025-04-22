import java.util.Random;

public class Matrix {
    private final int m; // rows
    private final int n; // columns
    private final double[][] data;

    // Constructors

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        this.data = new double[m][n];

        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = random.nextDouble() * 1000; // Random value between 0-1000
            }
        }
    }

    public Matrix(double[][] data) {
        this.m = data.length;
        this.n = data[0].length;
        this.data = new double[m][n];

        // Make a Deep copy
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    // Copy constructor
    public Matrix(Matrix matrix) {
        // Use deep copy for immutability
        this(matrix.getDataCopy());
    }

    // Methods

    public Matrix plus(Matrix other) {
        // safeguard against mismatched dimensions
        if (hasMismatchedDimensions(other)) {
            return null;
        }

        double[][] result = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
                result[i][j] = this.data[i][j] + other.data[i][j];
            }
        }

        return new Matrix(result);
    }

    public Matrix minus(Matrix other) {
        // safeguard against mismatched dimensions
        if (hasMismatchedDimensions(other)) {
            return null;
        }

        double[][] result = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
                result[i][j] = this.data[i][j] - other.data[i][j];
            }
        }

        return new Matrix(result);
    }

    public void print() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%9.2f", data[i][j]);
            }
            System.out.println();
        }
    }

    // Getters

    private double[][] getDataCopy() {
        double[][] copy = new double[m][n];

        // Return a deep copy
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = this.data[i][j];
            }
        }

        return copy;
    }

    // Helpers

    private boolean hasMismatchedDimensions(Matrix other) {
        return this.m != other.m || this.n != other.n;
    }

}
