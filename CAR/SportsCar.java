class SportsCar extends Car {

    public SportsCar(String manufactureCompany, String dimensions, String model, String fuelType,
            int manufactureYear, String color,
            double maxSpeed, int noOfSeats, double price) {
        super(manufactureCompany, dimensions, model, fuelType, manufactureYear, color, maxSpeed, noOfSeats, price);
    }

    @Override
    void start() {
        System.out.println("SportsCar is starting.");
    }

    @Override
    int increaseGear(int gear) {
        System.out.println("SportsCar increased to gear: " + (gear + 1));
        return gear;
    }

    @Override
    int decreaseGear(int gear) {
        System.out.println("SportsCar decreased to gear: " + (gear - 1));
        return gear;
    }

    @Override
    int increaseSpeed(int speed) {
        System.out.println("SportsCar increased speed by: " + (speed + 1) + " km/h");
        return speed;
    }

    @Override
    int decreaseSpeed(int speed) {
        System.out.println("SportsCar decreased speed by: " + (speed - 1) + " km/h");
        return speed;
    }

    @Override
    int accelerate(int speed) {
        System.out.println("SportsCar accelerated by: " + (speed + 5) + " km/h");
        return speed;
    }

    @Override
    void moveLeft() {
        System.out.println("SportsCar moving left.");
    }

    @Override
    void moveRight() {
        System.out.println("SportsCar moving right.");
    }

    @Override
    void moveStraight() {
        System.out.println("SportsCar moving straight.");
    }

    @Override
    void moveBack() {
        System.out.println("SportsCar moving backward.");
    }

    @Override
    void upgradeEngine() {
        System.out.println("SportsCar engine upgraded.");
    }

    @Override
    void lightOn() {
        System.out.println("SportsCar lights turned on.");
    }

    @Override
    void lightOff() {
        System.out.println("SportsCar lights turned off.");
    }

    @Override
    void stop() {
        System.out.println("SportsCar stopped.");
    }
}
