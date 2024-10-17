public class ExceptionHandled {
    void m1(){
        System.out.println("Method 1 Called");
        m2();
    }
    void m2(){
        System.out.println("Method 2 Called");
        try {
            System.out.println(5/0);
        } catch (Exception e) {
            System.out.println("Number can't divded by zero");
        }
        m3();
    }
    void m3(){
        System.out.println("Method 3 Called");
    }
}
