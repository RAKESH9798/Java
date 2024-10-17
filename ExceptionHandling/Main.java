public class Main {
    public static void main(String[] args) {
        ExceptionHandled handle = new ExceptionHandled();
        ExceptionOccured occur = new ExceptionOccured();

        // occur.m1();//flow of execution broken after method 2
        // Method 1 Called
        // Method 2 Called
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //     at ExceptionOccured.m2(ExceptionOccured.java:8)
        //     at ExceptionOccured.m1(ExceptionOccured.java:4)
        //     at Main.main(Main.java:6)

        handle.m1();//flow of execution not broken after method 2, it is successfully executed whole program
        // Method 1 Called
        // Method 2 Called
        // Number can't divded by zero
        // Method 3 Called
    }
}
