package multithreading;

public class Kitty extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 50000; i++) {
            if (i % 10000 == 0) {
                System.out.print("kitty screams " + "\n");
            }
        }
    }
}
