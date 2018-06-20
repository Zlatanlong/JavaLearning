package controler;

public class Bus extends Vehicle {

    private float mile = 350;
    private float time;

    public Bus() {
    }

    public Bus(String w, String d) {
        int speed = 90;
        if (w == "rainly") {
            speed *= 0.9;
        }
        if (d == "Mr. Wang") {
            speed += 2;
        }
        if (d == "Mr. Zhang") {
            speed -= 5;
        }
        time = mile / speed;
    }

    public float getTime() {
        return time;
    }

    public int getSpeed() {
        return 100;
    }
}
