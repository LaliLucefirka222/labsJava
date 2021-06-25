import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static int N = 100;
    private static int random;
    private static List<Transport> transportList;
    private static Random randomIndex;
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



    public static void main(String[] args) {

        transportList = new ArrayList<>();
        randomIndex = new Random();
        TransportFactory transportFactory = new TransportFactory();
        Factory factory;

        for (int i = 0; i < N; i++) {

            Transport tr;
            random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                factory = transportFactory.createFactory("PassengerFactory");
                random = (int) (Math.random() * 2) + 1;

                if (random == 1) {
                    tr = factory.createTransport("BMW");
                } else {
                    tr = factory.createTransport("Lada");
                }

            } else if (random == 2) {
                random = (int) (Math.random() * 2) + 1;
                factory = transportFactory.createFactory("CargoFactory");
                if (random == 1) {
                    tr = factory.createTransport("Man");
                } else {
                    tr = factory.createTransport("Scania");
                }
            } else {
                factory = transportFactory.createFactory("AirFactory");
                tr = factory.createTransport("Boeing");
            }
            transportList.add(tr);
        }

        for (int i = 0; i < N; i++) {
            System.out.println(transportList.get(i).GetDescription() + "\n");
        }



    }
}
