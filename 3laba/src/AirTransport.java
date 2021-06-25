public class AirTransport extends Transport {

    protected int numberOfEngines;

    public AirTransport(int maximumSpeed, String color, double price, int numberOfSeats, int numberOfEngines) {
        super(maximumSpeed, color, price, numberOfSeats);
        this.numberOfEngines = numberOfEngines;
    }

    public AirTransport(Transport transport, int numberOfEngines) {
        super(transport.maximumSpeed, transport.color, transport.price, transport.numberOfSeats);
        this.numberOfEngines = numberOfEngines;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }
}
