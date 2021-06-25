public class User extends Thread{

    private Storage storage;

    public User(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            storage.get();
        }

    }
}
