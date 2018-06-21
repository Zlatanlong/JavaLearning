package multithreading;

public class Puppy extends Thread {

    public void run() {
        for (int i = 1; i <= 50000; i++) {
            if (i % 10000 == 0) {
                System.out.print("puppy barks " + "\n");
            }
        }
    }
}
