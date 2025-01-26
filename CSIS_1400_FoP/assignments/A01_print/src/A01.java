/*****************************************
 * Assignment: A01 - Print
 *
 * Author: Josh Sorensen
 ******************************************/

public class A01 {
    public static void main(String[] args) {
        // println version (easy)
        System.out.println("--- println version (easy) ---\n");
        System.out.println("_[@]_     /\\/\\"); // _[@]_     /\/\
        System.out.println(" (\")     (>''<)"); //  (")     (>''<)
        System.out.println("(_:_)    ( UU )");  // (_:_)    ( UU )
        System.out.print("\n");

        // printf version (medium)
        System.out.println("--- printf version (medium) ---\n");
        System.out.printf("%-9s%6s%n", "_[@]_", " /\\/\\ "); // _[@]_     /\/\
        System.out.printf("%-9s%6s%n", " (\") ", "(>''<)");  //  (")     (>''<)
        System.out.printf("%-9s%6s%n", "(_:_)", "( UU )");   // (_:_)    ( UU )
        System.out.print("\n");
    }
}