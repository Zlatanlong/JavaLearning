/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author dmt
 */
public class Puppy extends Thread {
    public void run(){
        for(int i=1;i<=50000;i++)
            if(i%10000 == 0)
                System.out.print("puppy barks "+"\n");
    }
}
