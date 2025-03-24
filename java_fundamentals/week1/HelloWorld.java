package java_fundamentals.week1;

public class HelloWorld {
    public HelloWorld() {
    }

    public static void main(String[] var0) {
        System.out.println("Hello, World!"); // this will print "Hello world" in console and whatever it is going to
                                             // print it will push the cursor to the next line
        System.out.print("Hello"); // this will print "Hello" in console and it will push next cursor after Hello
                                   // is printed
        System.out.println("Java"); // this will get printed as "Java" right next to Hello so it will be "HelloJava"

        /*
         * Output:
         * 
         * Hello, World!
         * HelloJava
         */
    }
}
