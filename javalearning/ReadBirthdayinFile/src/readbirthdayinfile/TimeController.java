package readbirthdayinfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TimeController {
    CountAge ca=new CountAge();
    
    /**
     * 把当前时间写进fileName路径的文件
     * @param fileName
     * @return 
     */
    public boolean writeNow(String fileName) {
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        File f = new File(fileName);
        try {
            Writer out = new FileWriter(f);
            BufferedWriter bufferWrite = new BufferedWriter(out);
            bufferWrite.write(df.format(day));
            bufferWrite.close();
            out.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(TimeController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    /**
     * 把bir写入fileName路径的文件中
     * @param fileName
     * @param bir
     * @return 
     */
    public boolean writeBirthday(String fileName,String bir) {
        File f = new File(fileName);
        try {
            Writer out = new FileWriter(f);
            BufferedWriter bufferWrite = new BufferedWriter(out);
            bufferWrite.write(bir);
            bufferWrite.close();
            out.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(TimeController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    /**
     * 读出fileName路径的文件中的第一行
     * @param fileName
     * @return 
     */
    public void readTime(String fileName){
        String str;
        File f = new File(fileName);
        try {
            Reader in = new FileReader(f);
            BufferedReader bufferRead = new BufferedReader(in);
            while ((str = bufferRead.readLine()) != null) {
                System.out.println(ca.countAge(str, getTime()));
            }
        } catch (IOException ex) {
            Logger.getLogger(TimeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getTime() {
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return df.format(day);
    }
}
