package mapdemo;

import java.text.SimpleDateFormat;
import java.util.Stack;

public class B extends Thread {
    //每过两秒将当前时间推出栈
    private Stack stack;
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @Override
    public void run() {
        while (true) {
            try {
                if (!stack.isEmpty()) {
                    System.out.println(stack.pop().toString());
                }
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Stack skStack = new Stack<>();
        a.setStack(skStack);
        b.setStack(skStack);
        a.start();
        b.start();
    }

    public void setStack(Stack sk) {
        this.stack = sk;
    }
}
