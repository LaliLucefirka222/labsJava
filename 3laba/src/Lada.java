public class Lada extends PassengerCar {



    public Lada(int maximumSpeed, String color, double price, int numberOfSeats, boolean isCabriolet) {
        super(maximumSpeed, color, price, numberOfSeats, isCabriolet);
    }

    public Lada(PassengerCar passengerCar) {
        super(passengerCar.maximumSpeed, passengerCar.color, passengerCar.price,
                passengerCar.numberOfSeats, passengerCar.isCabriolet);
    }


    @Override
    public String GetDescription() {
        return "Lada{" +
                "isCabriolet=" + isCabriolet +
                ", maximumSpeed=" + maximumSpeed +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
