import java.util.Random;

public class TransportFactory {

    private static int[] randomNumberOfSeatsForP = {2, 3, 4, 6, 8};
    private static int[] randomNumberOfSeatsForC = {2, 3, 4};
    private static int[] randomNumberOfSeatsForA = {4, 10, 25, 100, 244, 356};
    private static int[] randomMaximumSpeedA = {350, 500, 700, 900};
    private static int[] randomMaximumSpeedP = {150, 180, 200, 220, 250};
    private static int[] randomMaximumSpeedC = {150, 180, 200};
    private static int[] randomPriceC = {5000000, 7000000, 9000000, 12000000};
    private static int[] randomPriceP = {1000000, 1500000, 2000000, 2500000};
    private static double[] randomPriceA = {45000000, 50000000, 70000000, 80000000};
    private static String[] randomColor = {"White", "Black", "Blue", "Gray", "Yellow", "Brown"};
    private static double[] randomLoadCapacity = {2000000, 3000000, 5000000, 6000000, 10000000, 15000000};
    private static int[] randomNumberOfEngines = {1, 2, 4, 6};
    private static Random randomIndex;


    public Transport create(String type, String model) {
        randomIndex = new Random();
        switch (type) {
            case "Passenger":
                switch (model) {
                    case "BMW":
                        return new BMW(randomMaximumSpeedP[randomIndex.nextInt(randomMaximumSpeedP.length)],
                                randomColor[randomIndex.nextInt(randomColor.length)],
                                randomPriceP[randomIndex.nextInt(randomPriceP.length)],
                                randomNumberOfSeatsForP[randomIndex.nextInt(randomNumberOfSeatsForP.length)],
                                Math.random() < 0.5);
                    case "Lada":
                        return new Lada(randomMaximumSpeedP[randomIndex.nextInt(randomMaximumSpeedP.length)],
                                randomColor[randomIndex.nextInt(randomColor.length)],
                                randomPriceP[randomIndex.nextInt(randomPriceP.length)],
                                randomNumberOfSeatsForP[randomIndex.nextInt(randomNumberOfSeatsForP.length)],
                                Math.random() < 0.5);
                }
            case "Cargo":
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
            case "Air":
                switch (model) {
                    case "Boeing":
                        return new Boeing(randomMaximumSpeedA[randomIndex.nextInt(randomMaximumSpeedA.length)],
                                randomColor[randomIndex.nextInt(randomColor.length)],
                                randomPriceA[randomIndex.nextInt(randomPriceA.length)],
                                randomNumberOfSeatsForA[randomIndex.nextInt(randomNumberOfSeatsForA.length)],
                                randomNumberOfEngines[randomIndex.nextInt(randomNumberOfEngines.length)]);
                }
        }
        return null;
    }
}
