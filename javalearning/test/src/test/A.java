package test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class A extends Thread {

    int[] arr;
    int key;
    int[] go;

    A(int[] a, int k) {
        arr = a;
        go = a;
        key = k;
        for (int i = 0; i < arr.length; i++) {
            go[i] = arr[i] * key;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (go[i] > go[j]) {
                    int temp = go[i];
                    go[i] = go[j];
                    go[j] = temp;
                }
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                for (int i = 0; i < arr.length - 1; i++) {
                    System.out.print(go[i] + ";");
                    Thread.sleep(100);
                }
                System.out.println(go[arr.length - 1]);
                break;
            } catch (InterruptedException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
