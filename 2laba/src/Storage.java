public class Storage {

    private int N;
    private int currentN;
    private boolean stay;

    public Storage(int N) {
        this.N = N;
    }

    public synchronized void add() {
        if(stay){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.currentN++;
        System.out.println("Проезведен, кол-во товара " + this.currentN);
        if (this.currentN == N) {
            stay = true;
        }
        notifyAll();
    }

    public synchronized void get(){
        if (!stay){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.currentN--;
        System.out.println("Потреблен, кол-во товара " + this.currentN);
        if (this.currentN == 0) {
            stay = false;
        }
        notifyAll();
    }
}
