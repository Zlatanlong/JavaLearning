package multithreading;

public class Multithreading {

    public static void main(String[] args) {
        Kitty kitty = new Kitty();
        Puppy puppy = new Puppy();
        kitty.start();
        puppy.start();
        for (int i = 1; i <= 50000; i++) {
            if (i % 10000 == 0) {
                System.out.print("The master's call " + "\n");
            }
        }
    }
}
