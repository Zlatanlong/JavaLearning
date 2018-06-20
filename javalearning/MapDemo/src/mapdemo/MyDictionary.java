package mapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyDictionary {

    Map<String, String> map = new HashMap<String, String>();
    List<String> list = new ArrayList<>();
    /**
     * 将英中文对照加入map
     * @param en
     * @param cn 
     */
    public void addNewWords(String en, String cn) {
        map.put(en, cn);
    }
    /**
     * 根据英文get中文
     * @param en
     * @return 中文
     */
    public String trans(String en) {
        return map.get(en);
    }
    /**
     * 将字符串s每len长度分割并按顺序存入list
     * @param s
     * @param len 
     */
    public void save(String s, int len) {
        int j = 0;
        while (s.length() - len - j > 0) {
            list.add(s.substring(j, len + j));
            j += len;
        }
        list.add(s.substring(j));
    }
    /**
     * get当前index的字符串
     * @param index
     * @return 
     */
    public String getData(int index) {
        return list.get(index);
    }
    /**
     * 返回字符串s的不重复的字符个数
     * @param s
     * @return 
     */
    public int getCount(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }

    public static void main(String[] args) {
        //第一题
//        Scanner scan = new Scanner(System.in);
        MyDictionary md = new MyDictionary();
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
