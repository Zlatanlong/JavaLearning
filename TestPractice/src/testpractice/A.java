package testpractice;

import java.util.ArrayList;
import java.util.List;

public class A {
    List<String> list = new ArrayList<>();
    void save(String s, int n){
        int i=0;
        while (s.length()-i-n>0) {            
            list.add(s.substring(i, i+n));
            i+=n;
        }
        list.add(s.substring(i));
    }
    String getData(int index){
        return list.get(index);
    }
}
