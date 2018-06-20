package test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dmt
 */
public class MyDictionary {

    Map<String, String> map = new HashMap<String, String>();

    public void addNewWords(String en, String cn) {
        map.put(en, cn);
    }

    public String trans(String en) {
        if (map.get(en)!=null) {
            return map.get(en);
        }
        return "尚无此单词";
    }
}
