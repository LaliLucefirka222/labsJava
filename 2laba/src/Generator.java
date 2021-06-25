public class Generator extends Thread {

    private Storage storage;

    public Generator(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            storage.add();
        }

    }

}
