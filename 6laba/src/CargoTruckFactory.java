import java.util.Random;

public class CargoTruckFactory implements Factory {

    private static int[] randomNumberOfSeatsForC = {4, 10, 25, 100, 244, 356};
    private static int[] randomMaximumSpeedC = {350, 500, 700, 900};
    private static double[] randomPriceC = {45000000, 50000000, 70000000, 80000000};
    private static String[] randomColor = {"White", "Black", "Blue", "Gray", "Yellow", "Brown"};
    private static double[] randomLoadCapacity = {2000000, 3000000, 5000000, 6000000, 10000000, 15000000};
    private static Random randomIndex;

    @Override
    public Transport createTransport(String model) {
        randomIndex = new Random();
        switch (model) {
            case "Man":
                return new Man(randomMaximumSpeedC[randomIndex.nextInt(randomMaximumSpeedC.length)],
                        randomColor[randomIndex.nextInt(randomColor.length)],
                        randomPriceC[randomIndex.nextInt(randomPriceC.length)],
                        randomNumberOfSeatsForC[randomIndex.nextInt(randomNumberOfSeatsForC.length)],
                        randomLoadCapacity[randomIndex.nextInt(randomLoadCapacity.length)]);
            case "Scania":
                return new Scania(randomMaximumSpeedC[randomIndex.nextInt(randomMaximumSpeedC.length)],
                        randomColor[randomIndex.nextInt(randomColor.length)],
                        randomPriceC[randomIndex.nextInt(randomPriceC.length)],
                        randomNumberOfSeatsForC[randomIndex.nextInt(randomNumberOfSeatsForC.length)],
                        randomLoadCapacity[randomIndex.nextInt(randomLoadCapacity.length)]);
        }
        return null;
    }
}
