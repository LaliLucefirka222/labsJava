public class Boeing extends AirTransport {

    public Boeing(int maximumSpeed, String color, double price, int numberOfSeats, int numberOfEngines) {
        super(maximumSpeed, color, price, numberOfSeats, numberOfEngines);
    }

    public Boeing(AirTransport airTransport) {
        super(airTransport.maximumSpeed, airTransport.color, airTransport.price,
                airTransport.numberOfSeats, airTransport.numberOfEngines);
    }

    @Override
    public String GetDescription() {
        return "Boeing{" +
                "numberOfEngines=" + numberOfEngines +
                ", maximumSpeed=" + maximumSpeed +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
