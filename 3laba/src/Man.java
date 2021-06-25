public class Man extends CargoTruck {


    public Man(int maximumSpeed, String color, double price, int numberOfSeats, double loadCapacity) {
        super(maximumSpeed, color, price, numberOfSeats, loadCapacity);
    }

    public Man(CargoTruck cargoTruck) {
        super(cargoTruck.maximumSpeed, cargoTruck.color, cargoTruck.price,
                cargoTruck.numberOfSeats, cargoTruck.loadCapacity);
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
