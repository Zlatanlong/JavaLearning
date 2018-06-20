package controler;

public class Car extends Vehicle {

    private float mile = 350;
    private float time;

    public Car() {
    }

    public Car(String w, String d) {
        int speed = 120;
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

    public float getTime() {
        return time;
    }

    public int getSpeed() {
        return 120;
    }
}
