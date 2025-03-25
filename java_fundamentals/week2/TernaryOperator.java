package java_fundamentals.week2;

public class TernaryOperator {
    public static void main(String[] args) {
        int number;
        number = 12;

        // syntax
        // (condition) ? statement1 : statement2
        // if condition is true then statement will get printed or stored
        // if condition is false then statement will get printed or stored
        boolean result = (number % 2 == 0) ? true : false;
        System.out.println(result);
    }

}
