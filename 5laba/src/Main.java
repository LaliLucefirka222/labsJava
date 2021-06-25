import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int N = 100;
    private static int random;
    private static List<Transport> transportList;

    public static void main(String[] args) {

        transportList = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            Transport tr;
            TransportFactory factory = new TransportFactory();
            random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                random = (int) (Math.random() * 2) + 1;

                if (random == 1) {

                    tr = factory.create("Passenger", "BMW");
                } else {
                    tr = factory.create("Passenger", "Lada");
                }

            } else if (random == 2) {
                random = (int) (Math.random() * 2) + 1;

                if (random == 1) {
                    tr = factory.create("Cargo", "Man");
                } else {
                    tr = factory.create("Cargo", "Scania");
                }
            } else {
                tr = factory.create("Air", "Boeing");
            }
            transportList.add(tr);
        }

        for (int i = 0; i < N; i++) {
            System.out.println(transportList.get(i).GetDescription() + "\n");
        }

    }
}
