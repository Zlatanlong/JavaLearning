package guesscounts;

import java.util.Random;

public class Robot {

    public int random;
    public int point;
    public String name;

    public Robot(String name, int p) {
        this.name = name;
        this.point = p;
    }

    public void getRandom() {
        Random ran = new Random();
        random = ran.nextInt(100);
    }

    public void cutPoints(int a) {
        point -= a;
    }

    public void showPoints() {
        System.out.println("computer's random" + random);
        System.out.println("计算机的分数是" + point);
    }
}
