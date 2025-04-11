import java.util.ArrayList;

public class MagicSquare {
    public static void main(String[] args) {
        // 4 x 4 (is magic square)

        int[][] square = {
                {8, 11, 14, 1},
                {13, 2, 7, 12},
                {3, 16, 9, 6},
                {10, 5, 4, 15}
        };

        // 5 x 5 (is not magic square)

        //        int[][] square = {
        //                {8, 11, 14, 1, 2},
        //                {13, 2, 7, 12, 2},
        //                {3, 16, 9, 6, 2},
        //                {10, 5, 4, 15, 2},
        //                {10, 5, 4, 15, 2}
        //        };

        // 6 x 6 (is magic square)

//                int[][] square = {
//                        {35, 1, 6, 26, 19, 24},
//                        {3, 32, 7, 21, 23, 25},
//                        {31, 9, 2, 22, 27, 20},
//                        {8, 28, 33, 17, 10, 15},
//                        {30, 5, 34, 12, 14, 16},
//                        {4, 36, 29, 13, 18, 11}
//                };

        System.out.printf("The square %s a magic square. %n",
                (isMagicSquare(square) ? "is" : "is not"));
    }

    public static boolean isMagicSquare(int[][] square) {
        ArrayList<Integer> sums = new ArrayList<>();
        int squareLength = square.length;

        // vertical sums
        for (int i = 0; i < squareLength; i++) {
            int horizontalSum = 0;
            for (int j = 0; j < squareLength; j++) {
                horizontalSum += square[i][j];
            }
            sums.add(horizontalSum);
        }

        // horizontal sums
        for (int i = 0; i < squareLength; i++) {
            int verticalSum = 0;
            for (int j = 0; j < squareLength; j++) {
                verticalSum += square[j][i];
            }
            sums.add(verticalSum);
        }

        // top LEFT to bottom RIGHT diagonal sums
        int diagSum1 = 0;
        for (int i = 0; i < squareLength; i++) {
            diagSum1 += square[i][i];
        }
        sums.add(diagSum1);

        // bottom Left to top Right diagonal sums
        int diagSum2 = 0;

        // j: 0 - i: 3
        // j: 1 - i: 2
        // j: 2 - i: 1
        // j: 3 - i: 0

        int j = 0;
        for (int i = squareLength - 1; i >= 0; i--) {
            diagSum2 += square[j][i];
            j++;
        }
        sums.add(diagSum2);

        System.out.println(sums.toString());

        // compare an element the array to every element in the array
        // return true if they are all equal
        // false if otherwise
        boolean allSumsEqual = false;
        for (int sum : sums) {
            allSumsEqual = sums.getFirst() == sum;
        }

        return allSumsEqual;
    }
}
