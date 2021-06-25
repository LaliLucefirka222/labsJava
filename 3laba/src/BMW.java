public class BMW extends PassengerCar{



    public BMW(int maximumSpeed, String color, double price, int numberOfSeats, boolean isCabriolet) {
        super(maximumSpeed, color, price, numberOfSeats, isCabriolet);
    }

    public BMW(PassengerCar passengerCar) {
        super(passengerCar.maximumSpeed, passengerCar.color, passengerCar.price,
                passengerCar.numberOfSeats, passengerCar.isCabriolet);
    }


    @Override
    public String GetDescription() {
        return "BMW{" +
                "isCabriolet=" + isCabriolet +
                ", maximumSpeed=" + maximumSpeed +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
