/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

/**
 *
 * @author dmt
 */
public class Timer {
    public double getTime(Vehicle v,double len){
        return len/v.getSpeed();
    }
}
