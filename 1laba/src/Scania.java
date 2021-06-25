public class Scania extends CargoTruck {

    public Scania(int maximumSpeed, String color, double price, int numberOfSeats,
               double loadCapacity) {
        this.maximumSpeed = maximumSpeed;
        this.color = color;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String GetDescription() {
        return "Scania{" +
                "loadCapacity=" + loadCapacity +
                ", maximumSpeed=" + maximumSpeed +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
