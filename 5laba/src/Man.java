public class Man extends CargoTruck {

    public Man(int maximumSpeed, String color, double price, int numberOfSeats,
               double loadCapacity) {
        this.maximumSpeed = maximumSpeed;
        this.color = color;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String GetDescription() {
        return "Man{" +
                "loadCapacity=" + loadCapacity +
                ", maximumSpeed=" + maximumSpeed +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
