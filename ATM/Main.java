import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // SimpleATM atm = new SimpleATM(100000);
        // atm.credit(10000);
        // atm.debit(30000);
        // atm.checkBalance();

        Scanner sc = new Scanner(System.in);
        System.out.println("Set your initial account balance:");
        Double balance=sc.nextDouble();

        SimpleATM atm = new SimpleATM(balance);


        int choice;
        do{
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.debit(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    atm.credit(depositAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }while(choice<=4);
        sc.close();
    }
}
