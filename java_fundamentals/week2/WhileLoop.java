package java_fundamentals.week2;

public class WhileLoop {
    public static void main(String[] args) {
        
        // syntax:
        // intialization
        // while (test condition)
        // update expression

        /*
         * intialization
         * while (test condition) {
         *     update statement
         * }
         */

         int i = 1; // intialization
         while (i <= 5) { // test condition
            System.out.println(i);
            i += 1; // update expression
         }
    }
}
