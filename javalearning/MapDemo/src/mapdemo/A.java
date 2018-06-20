package mapdemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author zlatan
 */
public class A extends Thread{
    private Stack stack;
    Date day;
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    @Override
    public void run(){
            while (true) {            
                try {
                    day=new Date();
                    stack.push(df.format(day));
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
    public void setStack(Stack sk) {
        this.stack= sk;
    }
}
