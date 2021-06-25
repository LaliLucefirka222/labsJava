import java.util.Random;

public class AirTransportFactory implements Factory {

    private static int[] randomNumberOfSeatsForA = {4, 10, 25, 100, 244, 356};
    private static int[] randomMaximumSpeedA = {350, 500, 700, 900};
    private static double[] randomPriceA = {45000000, 50000000, 70000000, 80000000};
    private static String[] randomColor = {"White", "Black", "Blue", "Gray", "Yellow", "Brown"};
    private static int[] randomNumberOfEngines = {1, 2, 4, 6};
    private static Random randomIndex;

    @Override
    public Transport createTransport(String model) {
        randomIndex = new Random();
        switch (model) {
            case "Boeing":
                return new Boeing(randomMaximumSpeedA[randomIndex.nextInt(randomMaximumSpeedA.length)],
                        randomColor[randomIndex.nextInt(randomColor.length)],
                        randomPriceA[randomIndex.nextInt(randomPriceA.length)],
                        randomNumberOfSeatsForA[randomIndex.nextInt(randomNumberOfSeatsForA.length)],
                        randomNumberOfEngines[randomIndex.nextInt(randomNumberOfEngines.length)]);
        }
        return null;
    }
}
