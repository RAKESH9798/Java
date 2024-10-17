abstract class Car {
    private String manufactureCompany;
    private String model;
    private String fuelType;
    private int manufactureYear;
    private String color;
    private double maxSpeed;
    private int noOfSeats;
    private double price;
    private String dimensions;

    public Car(String manufactureCompany,String dimensions, String model, String fuelType, int manufactureYear, String color,
            double maxSpeed, int noOfSeats, double price) {
        this.manufactureCompany = manufactureCompany;
        this.model = model;
        this.fuelType = fuelType;
        this.manufactureYear = manufactureYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.noOfSeats = noOfSeats;
        this.price = price;
        this.dimensions=dimensions;
    }

    public void getCarDetails() {
        System.out.println("Manufacturer: " + manufactureCompany);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Color: " + color);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Number of Seats: " + noOfSeats);
        System.out.println("Price: $" + price);
        System.out.println("Dimensions: " + dimensions);
    }

    abstract void start();
    abstract int increaseGear(int gear);
    abstract int decreaseGear(int gear);
    abstract int increaseSpeed(int speed);
    abstract int decreaseSpeed(int speed);
    abstract int accelerate(int speed);
    abstract void moveLeft();
    abstract void moveRight();
    abstract void moveStraight();
    abstract void moveBack();
    abstract void upgradeEngine();
    abstract void lightOn();
    abstract void lightOff();
    abstract void stop();

}
