import java.util.Arrays;

public class LabArraysClass {
    public static void main(String[] args) {
        int[] iArray1 = {6, 12, 3, 9};
        int[] iArray2 = new int[5];

        // fill iArray2 with 7
        Arrays.fill(iArray2, 7);

        // print iArray1 and iArray2 (toString)
        System.out.printf("iArray1: %s%n", Arrays.toString(iArray1));
        System.out.printf("iArray2: %s%n", Arrays.toString(iArray2));

        // search for number 9 in iArray1 and print the value returned:
        System.out.printf("9 in iArray1: %d%n", Arrays.binarySearch(iArray1, 9));

        // sort iArray1 and print it
        Arrays.sort(iArray1);
        System.out.printf("iArray1 sorted: %s%n", Arrays.toString(iArray1));

        // search for number 9 in iArray1 and print the value returned:
        System.out.printf("9 in iArray1: %d%n", Arrays.binarySearch(iArray1, 9));

        // create iArray3 and assign it the first 3 elements of iArray1; print it
        int[] iArray3 = {iArray1[0], iArray1[1], iArray1[2]};
        System.out.printf("iArray3: %s%n", Arrays.toString(iArray3));

        // test equality of new int[] {3, 6, 9} and iArray3; print result
        int[] newArray = {3, 6, 9};
        boolean equality = Arrays.equals(newArray, iArray3);
        System.out.printf("iArray3 equals %s: %b", Arrays.toString(iArray3), equality);

        // Reason:
        String reason = """
                
                - It's expected that arrays are sorted using the Arrays.sort() before you call Arrays.binarySearch().\
                
                - If you do not sort the array, the results of the binary search will be undefined. \
                
                - The return value will be greater than 1, only if the specified key is found within the array, which explains why the key isn't found \
                
                - The binary search method returns "-2", as this would be the insertion point that it would be added if the array is sorted
                """;
        System.out.printf("%nReason: %s%n", reason);
    }
}
