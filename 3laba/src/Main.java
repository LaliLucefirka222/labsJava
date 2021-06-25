import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static int N = 100;
    private static int random;
    private static List<Transport> transportList;
    private static Random randomIndex;

    private static int[] randomNumberOfSeatsFor = {2, 3, 4, 6, 8, 10};
    private static int[] randomMaximumSpeed = {150, 180, 200, 220, 250, 350, 500, 700, 900};
    private static int[] randomPrice = {1000000, 1500000, 2000000, 2500000, 4000000};
    private static String[] randomColor = {"White", "Black", "Blue", "Gray", "Yellow", "Brown"};
    private static double[] randomLoadCapacity = {2000000, 3000000, 5000000, 6000000, 10000000, 15000000};
    private static int[] randomNumberOfEngines = {1, 2, 4, 6};



    public static void main(String[] args) {

        transportList = new ArrayList<>();
        randomIndex = new Random();


        for (int i = 0; i < N; i++) {

            Transport tr = new Transport(randomMaximumSpeed[randomIndex.nextInt(randomMaximumSpeed.length)],
                    randomColor[randomIndex.nextInt(randomColor.length)],
                    randomPrice[randomIndex.nextInt(randomPrice.length)],
                    randomNumberOfSeatsFor[randomIndex.nextInt(randomNumberOfSeatsFor.length)]);
            random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                PassengerCar pc = new PassengerCar(tr, Math.random() < 0.5);
                random = (int) (Math.random() * 2) + 1;

                if (random == 1) {
                    BMW bmw = new BMW(pc);
                    transportList.add(bmw);
                } else {
                    Lada lada = new Lada(pc);
                    transportList.add(lada);
                }


            } else if (random == 2) {
                CargoTruck ct = new CargoTruck(tr, randomLoadCapacity[randomIndex.nextInt(randomLoadCapacity.length)]);
                random = (int) (Math.random() * 2) + 1;

                if (random == 1) {
                    Man man = new Man(ct);
                    transportList.add(man);
                } else {
                    Scania scania = new Scania(ct);
                    transportList.add(scania);
                }
            } else {
                AirTransport at = new AirTransport(tr, randomNumberOfEngines[randomIndex.nextInt(randomNumberOfEngines.length)]);
                Boeing boeing = new Boeing(at);
                transportList.add(boeing);
            }

        }

        for (int i = 0; i < N; i++) {
            System.out.println(transportList.get(i).GetDescription() + "\n");
        }



    }
}
