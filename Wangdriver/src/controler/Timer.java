package controler;

public class Timer {

    public double getTime(Vehicle v, double len) {
        return len / v.getSpeed();
    }
}
