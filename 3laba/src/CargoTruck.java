public class CargoTruck extends Transport {

    protected double loadCapacity;


    public CargoTruck(int maximumSpeed, String color, double price, int numberOfSeats, double loadCapacity) {
        super(maximumSpeed, color, price, numberOfSeats);
        this.loadCapacity = loadCapacity;
    }

    public CargoTruck(Transport transport, double loadCapacity) {
        super(transport.maximumSpeed, transport.color, transport.price, transport.numberOfSeats);
        this.loadCapacity = loadCapacity;
    }



    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
