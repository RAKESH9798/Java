import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car manufacturing company: ");
        String manufactureCompany=sc.nextLine();
        System.out.println("Enter Model of the Car: ");
        String model=sc.nextLine();
        System.out.println("Enter fuelType of car: ");
        String fuelType=sc.nextLine();
        System.out.println("Enter manufacture year: ");
        int manufactureYear=sc.nextInt();
        System.out.println("Color of the car: ");
        String color=sc.nextLine();
        System.out.println("Maximum speed of the car: ");
        double maxSpeed=sc.nextInt();
        System.out.println("No of seats in the car: ");
        int noOfSeats=sc.nextInt();
        System.out.println("Price of the car: ");
        double price=sc.nextDouble();
        System.out.println("Dimensions of the car: ");
        String dimensions=sc.nextLine();
        SportsCar car = new SportsCar(manufactureCompany, dimensions, model, fuelType, manufactureYear, color, maxSpeed, noOfSeats, price);

        int choice;
        do{
            System.out.println("\nMenu: ");
            System.out.println("1. Start Car");
            System.out.println("2. Decrease Gear");
            System.out.println("3. Increase Gear");
            System.out.println("4. Accelerate");
            System.out.println("5. Display Car Details");
            System.out.println("6. Turn Lights OFF");
            System.out.println("7. Turn Lights ON");
            System.out.println("8. Increase Speed");
            System.out.println("9. Decrease Speed");
            System.out.println("10. Move Back");
            System.out.println("11. Move Left");
            System.out.println("12. Move Right");
            System.out.println("13. Move Straight");
            System.out.println("14. Upgrade Engine");
            System.out.println("15. Stop Car");
            System.out.println("16. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    car.start();
                    break;
                case 2:
                    car.decreaseGear(0);
                    break;
                case 3:
                    car.increaseGear(0);
                    break;
                case 4:
                    car.accelerate(10);
                    break;
                case 5:
                    car.getCarDetails();
                    break;
                case 6:
                    car.lightOff();
                    break;
                case 7:
                    car.lightOn();
                    break;
                case 8:
                    car.increaseSpeed(10);
                    break;
                case 9:
                    car.decreaseSpeed(10);
                    break;
                case 10:
                    car.moveBack();
                    break;
                case 11:
                    car.moveLeft();
                    break;
                case 12:
                    car.moveRight();
                    break;
                case 13:
                    car.moveStraight();
                    break;
                case 14:
                    car.upgradeEngine();
                    break;
                case 15:
                    car.stop();
                    break;
                    case 16:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }while(choice<=16);
        sc.close();
    }
}
