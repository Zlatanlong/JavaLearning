/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;

public class A4 {
 List<String> list = new ArrayList<>();

    public void save(String s, int len) {
        int j = 0;
        while (s.length() - len - j > 0) {
            list.add(s.substring(j, len + j));
            j += len;
        }
        list.add(s.substring(j));
    }

    public String getData(int index) {
        return list.get(index);
    }
}
