public class PassengerCar extends Transport {

    protected boolean isCabriolet;



    public PassengerCar(int maximumSpeed, String color, double price, int numberOfSeats, boolean isCabriolet) {
        super(maximumSpeed, color, price, numberOfSeats);
        this.isCabriolet = isCabriolet;
    }

    public PassengerCar(Transport transport, boolean isCabriolet) {
        super(transport.maximumSpeed, transport.color, transport.price, transport.numberOfSeats);
        this.isCabriolet = isCabriolet;
    }

    public boolean isCabriolet() {
        return isCabriolet;
    }

    public void setCabriolet(boolean cabriolet) {
        isCabriolet = cabriolet;
    }


}
