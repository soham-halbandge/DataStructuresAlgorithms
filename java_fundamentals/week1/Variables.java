package java_fundamentals.week1;

public class Variables {
    public static void main(String[] args) {
        // different types of data we can store in variable

        // int -> 4 byte
        // long -> 8 byte (has to be written with 'l' or 'L' as suffix)

        // default data type for numbers is integer
        int a = 5;
        System.out.println(a);
        System.out.println("5");

        long b = 1000000000000L;
        System.out.println(b);

        // float -> 4 byte (has to be written with 'f' or 'F' as suffix)
        // double -> 8 byte

        // default data type for decimals is double
        float f = 9.75f;
        System.out.println(f);

        double d = 9.75321;
        System.out.println(d);

        // char -> 1 byte (only can store 1 character)
        char ch = 'A';
        System.out.println(ch);

        // string -> collection of characters
        String name = "Java";
        System.out.println(name);

        // boolean -> true or false (1 byte)
        boolean flag = true;
        System.out.println(flag);
    }
}
