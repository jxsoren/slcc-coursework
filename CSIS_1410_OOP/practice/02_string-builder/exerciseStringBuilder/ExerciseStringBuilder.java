public class ExerciseStringBuilder {
    public static void main(String[] args) {
        //        Challenge 1:
        //        In your 1410_PRACTICE_EXERCISES project, create a package called exerciseStringBuilder
        //        Inside the package, create a class called ExerciseStringBuilder. It includes the main method.
        //                Create a StringBuilder and name it sb
        //        Initialize it with “Cats live"

        StringBuilder sb = new StringBuilder("Cats live");

        //        Challenge 2:
        //        Change the first character from uppercase C to lowercase r
        //        Add the following string to the end of sb: " on "
        //        Print the content of sb

        sb.setCharAt(0, 'r');
        sb.append(" on ");
        System.out.println(sb);

        //        Challenge 3:
        //        Change the content of sb so that it includes the original content followed by the reverse content. Like this:
        //        current text => current texttxet tnerruc
        //        This task might take multiple code statements.
        //                It doubles the length of the content of sb.
        //        Print the content of sb

        StringBuilder reverse = new StringBuilder(sb).reverse();
        sb.append(reverse);
        System.out.println(sb);

        //        Challenge 4:
        //
        //        Find the first occurrence of two consecutive spaces.
        //        Save the index in a variable called doubleSpace
        //        Replace the 2 consecutive spaces with a single space
        //        In a single statement do the following two things:
        //        Replace the first letter of the content of sb with ‘C’ and add a period (.) at the end of the sentence.
        //        Print the content of sb

        int doubleSpace = sb.indexOf("  ");
        sb.deleteCharAt(doubleSpace);

        sb.replace(0, 1, "C").append('.');
        System.out.println(sb);
    }
}