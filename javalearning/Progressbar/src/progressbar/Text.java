/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progressbar;

import java.util.StringTokenizer;

/**
 *
 * @author dmt
 */
public class Text {
    public static void main(String[] args){
        String s ="阿斯克杜拉拉三打"
                + "哈口角生风很中国石油大学(华东)快乐个哈"
                + "里斯肯德基风化壳拉"
                + "沙德解放后烧录卡点中国石油大学(华东)"
                + "中国石油大学(华东)击率可视中国石油大学(华东)对讲拉克丝"
                + "接到了卡仕达基拉可"
                + "视对讲拉克丝觉得";
        //1.输出s的长度;
         System.out.print(s.length()+"\n");
        //2.s里面有多少个汉字;     
       StringTokenizer st=new StringTokenizer(s,"(),.");
       int total=0;
       while(st.hasMoreTokens()){
           total+=st.nextToken().length();
       }
       System.out.print(total+"\n");
        //3.把s里面的中国石油大学(华东)输出出来;
        String temp=s;
        int total2=0;
        while(temp.indexOf("中国石油大学(华东)")!=-1){
            total2++;
            temp=temp.substring(temp.indexOf("中国石油大学(华东)")+10);
        }
        System.out.print(total2);
    }
}
