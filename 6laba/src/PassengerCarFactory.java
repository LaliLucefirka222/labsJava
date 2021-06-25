import java.util.Random;

public class PassengerCarFactory implements Factory {

    private static int[] randomNumberOfSeatsForP = {4, 10, 25, 100, 244, 356};
    private static int[] randomMaximumSpeedP = {350, 500, 700, 900};
    private static double[] randomPriceP = {45000000, 50000000, 70000000, 80000000};
    private static String[] randomColor = {"White", "Black", "Blue", "Gray", "Yellow", "Brown"};
    private static Random randomIndex;

    @Override
    public Transport createTransport(String model) {
        randomIndex = new Random();
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
        return null;
    }
}
