public class Boeing extends AirTransport {

    public Boeing(int maximumSpeed, String color, double price, int numberOfSeats,
                  int numberOfEngines) {
        this.maximumSpeed = maximumSpeed;
        this.color = color;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.numberOfEngines = numberOfEngines;
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
