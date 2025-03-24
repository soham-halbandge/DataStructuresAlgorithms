package java_fundamentals.week1;

public class TypeCasting {
    public static void main(String[] args) {
        // implicit -> done by compiler itself
        // smaller data gets converted into bigger data
        int a = 10;
        long b = a;

        System.out.println(a); // 10
        System.out.println(b); // 10

        float f = 7.5f;
        double d = f;

        System.out.println(f);
        System.out.println(d);

        // explicit
        // user has to mention
        // bigger data gets converted into smaller data
        // there is chance of data loss
        long x = 1000000000000000L;
        int y = (int) x;

        System.out.println(x); // 1000000000
        System.out.println(y); // gets garbage value

    }

}