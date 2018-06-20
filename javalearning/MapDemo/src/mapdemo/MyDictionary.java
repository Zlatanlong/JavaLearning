package mapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author zlatan
 */
public class MyDictionary {
    Map<String,String> map=new HashMap<String,String>();
    List<String> list = new ArrayList<>();
    public void addNewWords(String en,String cn){
        map.put(en, cn);
    }
    public String trans(String en){
        return map.get(en);
    }
    public void save(String s,int len){
        int j=0;
        while (s.length()-len-j>0) {            
            list.add(s.substring(j, len+j));
            j+=len;
        }
        list.add(s.substring(j));
    }
    
    public String getData(int index){
        return list.get(index);
    }
    
    public int getCount(String s){
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }
    
    
    
    public static void main(String[] args) {
        //第一题
//        Scanner scan = new Scanner(System.in);
        MyDictionary md=new MyDictionary();
//        System.out.println("请输入英中文对照  0退出");
//        while (scan.hasNext()) {     
//            String inString=new String();
//            inString=scan.next();
//            if (inString.equals("0")) {
//                break;
//            }
//            md.addNewWords(inString, scan.next());
//        }
//        System.out.println("请输入英文");
//        System.out.println(md.trans(scan.next()));

          //第二题
//          Scanner scan = new Scanner(System.in);
//          MyDictionary md=new MyDictionary();
//          md.save("qwehqhwjeq", 3);
//          System.out.println(md.getData(3));
          //第三题
          System.out.println(md.getCount("abcabcabcf"));

    }
}
