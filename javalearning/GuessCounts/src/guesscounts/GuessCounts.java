/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guesscounts;

/**
 *
 * @author dmt
 */
public class GuessCounts {
    public void game()
    {
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1;
        Player newplayer=new Player("lcl",100);
        Robot newrobot=new Robot("Computer",50);
        GameRules newrule=new GameRules();
        while(!newrule.isOver(newrobot.point,newplayer.point)){
        System.out.println("ground "+i);
        newplayer.guessCount();
        newrobot.getRandom();
        int changepoint=newrule.compareCounts(newplayer.count, newrobot.random);
        System.out.println("you get points:"+changepoint);
        newplayer.addPoints(changepoint);
        newrobot.cutPoints(changepoint);
        newplayer.showPoints();
        newrobot.showPoints();    
        }
    }
}
