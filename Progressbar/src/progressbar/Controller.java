package progressbar;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class Controller extends Thread {

    JProgressBar jp;

    Controller(JProgressBar jf) {
        this.jp = jf;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            jp.setValue(i + 1);
            try {
                Thread.sleep(60);
            } catch (InterruptedException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
