package test;

/*
设计一个线程类A，其中有一个int[]类型的成员变量arr,和一个int类型的成员变量key。
设置一个构造方法能够初始化成员变量arr和key。要求该线程能够将数组arr里面的数据依次与key相乘，
并实现在每0.1秒时间间隔倒序输出
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class A {

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

//    @Override
//    public void run() {
//        while (true) {
//            try {
//                for (int i = 0; i < arr.length - 1; i++) {
//                    System.out.print(go[i] + ";");
//                    Thread.sleep(100);
//                }
//                System.out.println(go[arr.length - 1]);
//                break;
//            } catch (InterruptedException ex) {
//                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
    void start() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(go[i] + ";");
        }
        System.out.println(go[arr.length - 1]);
    }
}
