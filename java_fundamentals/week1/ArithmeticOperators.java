package java_fundamentals.week1;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 5;

        System.out.println(num1 + num2); // addition
        System.out.println(num1 - num2); // subtraction
        System.out.println(num1 * num2); // multiplication

        // division
        // if both the numbers are integer and we do a division then the answer we will
        // get will always be an integer
        // so division of two numbers basically give us quotient as an output
        System.out.println(num1 / num2); // 16 % 5 = 3

        // modulo (%)
        // this returns the remainder
        System.out.println(num1 % num2); // 16 % 5 = 1
    }
}
