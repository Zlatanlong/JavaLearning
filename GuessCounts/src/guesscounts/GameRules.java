package guesscounts;

public class GameRules {

    /**
     * 将两个数进行比较
     * @param player
     * @param robot
     * @return
     */
    public int compareCounts(int player, int robot) {
        int i = Math.abs(player - robot);
        if (i == 0) {
            return 10;
        } else if (i <= 5) {
            return 5;
        } else if (i <= 10) {
            return 0;
        } else if (i <= 20) {
            return -5;
        } else if (i <= 100) {
            return -10;
        } else {
            System.out.println("请输入一个整数!!!");
            return 0;
        }
    }

    /**
     * 根据双方分数判断是否结束
     * @param a
     * @param b
     * @return
     */
    public boolean isOver(int a, int b) {
        if (a <= 0) {
            System.out.println("game over\n You die!");
            return true;
        } else if (b <= 0) {
            System.out.println("game over\nYou win!");
            return true;
        } else {
            return false;
        }
    }
}
