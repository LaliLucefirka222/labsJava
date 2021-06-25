public class Lada extends PassengerCar {

    public Lada(int maximumSpeed, String color, double price, int numberOfSeats,
               boolean isCabriolet) {
        this.maximumSpeed = maximumSpeed;
        this.color = color;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.isCabriolet = isCabriolet;
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
