package testpractice;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary {
    Map<String, String>map=new HashMap<>();
    void addNewWords(String en,String cn){
        map.put(en, cn);
    }
    String trans(String en){
        if (map.get(en).isEmpty()) {
            return "尚无此单词";
        }
        return map.get(en);
    }
}
