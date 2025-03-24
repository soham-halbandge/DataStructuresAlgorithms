package java_fundamentals.week1;

public class LogicalOperators {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // logical and (&&)
        // if both the operands are true then result is true else false

        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // logical or (||)
        // if both operands are false then result is false else true
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // logical not (!)
        // works on only one operand
        // if true result is false
        // if false result is true
        System.out.println(!true); // false
        System.out.println(!false); // true
    }

}
