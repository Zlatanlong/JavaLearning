package guesscounts;

import java.util.Scanner;

public class Player {

    public int count;
    public int point;
    public String name;

    public Player(String name, int p) {
        this.name = name;
        this.point = p;
    }

    public void guessCount() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        count = input.nextInt();//输入一个整数
    }

    public void addPoints(int a) {
        point += a;
    }

    public void showPoints() {
        System.out.println("you guess" + count);
        System.out.println("你的分数是" + point);
    }
}
