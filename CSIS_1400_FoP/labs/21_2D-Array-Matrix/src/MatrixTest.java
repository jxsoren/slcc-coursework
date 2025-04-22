public class MatrixTest {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 3);
        Matrix other = new Matrix(2, 3);

        matrix.print();
        other.print();

        Matrix addition = matrix.plus(other);
        addition.print();

        Matrix subtraction = matrix.minus(other);
        subtraction.print();
    }
}

