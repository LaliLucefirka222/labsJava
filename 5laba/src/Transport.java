public abstract class Transport {

    protected int maximumSpeed;
    protected String color;
    protected double price;
    protected int numberOfSeats;


    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected int getMaximumSpeed() {
        return maximumSpeed;
    }

    protected void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected int getNumberOfSeats() {
        return numberOfSeats;
    }

    protected void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    protected String GetDescription() {
        return "Transport{" +
                "maximumSpeed=" + maximumSpeed +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
