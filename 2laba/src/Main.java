public class Main {

    private static int N = 1000;

    public static void main(String[] args) {

        Storage storage = new Storage(N);
        User user = new User(storage);
        Generator generator = new Generator(storage);

        Thread t1 = new Thread(generator);
        Thread t2 = new Thread(user);

        t1.start();
        t2.start();

    }
}
