package guesscounts;

public class GuessCounts {

    public static void main(String[] args) {
        int i = 1;
        Player newplayer = new Player("lcl", 100);
        Robot newrobot = new Robot("Computer", 50);
        GameRules newrule = new GameRules();
        while (!newrule.isOver(newrobot.point, newplayer.point)) {
            System.out.println("ground " + i);
            newplayer.guessCount();
            newrobot.getRandom();
            int changepoint = newrule.compareCounts(newplayer.count, newrobot.random);
            System.out.println("you get points:" + changepoint);
            newplayer.addPoints(changepoint);
            newrobot.cutPoints(changepoint);
            newplayer.showPoints();
            newrobot.showPoints();
        }
    }
}
