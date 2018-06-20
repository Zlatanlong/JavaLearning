package controler;

public class Bike extends Vehicle {

    private float mile = 350;
    private float time;

    public Bike(String w, String d) {
        int speed = 80;
        if (w == "rainly") {
            speed *= 0.9;
        }
        if (d == "Mr. Wang") {
            speed += 10;
        }
        if (d == "Mr. Zhang") {
            speed -= 15;
        }
        time = mile / speed;
    }

    public Bike() {
    }

    public float getTime() {
        return time;
    }

    public int getSpeed() {
        return 80;
    }
}
