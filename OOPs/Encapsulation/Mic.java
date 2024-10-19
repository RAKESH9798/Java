import java.lang.reflect.Method;

public class Mic {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println(client.getName("Rakesh"));
        System.out.println(client.getBalance());
        // System.out.println(client.balance); error
    }
}
