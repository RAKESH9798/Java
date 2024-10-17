public class ExceptionOccured {
    void m1(){
        System.out.println("Method 1 Called");
        m2();
    }
    void m2(){
        System.out.println("Method 2 Called");
        System.out.println(5/0);
        m3();
    }
    void m3(){
        System.out.println("Method 3 Called");
    }
}
