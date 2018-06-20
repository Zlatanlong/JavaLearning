/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author dmt
 */
public class Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kitty kitty=new Kitty();
        Puppy puppy=new Puppy();
        kitty.start();
        puppy.start();
        for(int i=1;i<=50000;i++)
            if(i%10000 == 0)
                System.out.print("The master's call "+"\n");
    }
}
