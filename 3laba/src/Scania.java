public class Scania extends CargoTruck {

    public Scania(int maximumSpeed, String color, double price, int numberOfSeats, double loadCapacity) {
        super(maximumSpeed, color, price, numberOfSeats, loadCapacity);
    }

    public Scania(CargoTruck cargoTruck) {
        super(cargoTruck.maximumSpeed, cargoTruck.color, cargoTruck.price,
                cargoTruck.numberOfSeats, cargoTruck.loadCapacity);
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
