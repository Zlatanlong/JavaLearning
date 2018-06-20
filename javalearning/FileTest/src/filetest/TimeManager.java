/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filetest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dmt
 */


public class TimeManager implements Serializable{
    private String name; 
    /**
     * 将当前时间写入文件
     * @param f 
     * @return 
     */
    public boolean outputCurrentTime(File f){
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            Writer out = new FileWriter(f);
            BufferedWriter bufferWrite = new BufferedWriter(out);
            bufferWrite.write(df.format(day));
            //bufferWrite.newLine();
            bufferWrite.close();
            out.close();
            return true;
            } catch (IOException ex) {        
                Logger.getLogger(TimeManager.class.getName()).log(Level.SEVERE, null, ex);       
                return false;       
            }
        
    } 
    /**
     * 获取文件上次记录的时间，输出与当前时间的时间间隔
     * @param f
     * @return 
     */
    public void getInternal(File f) {
        Date day = new Date();
        try {
            Reader in = new FileReader(f);
            BufferedReader bufferRead=new BufferedReader(in);
            try {
                String fromDate = bufferRead.readLine();
                System.out.println("old data is :"+fromDate);
                SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//如2016-08-10 20:40    
                String toDate = simpleFormat.format(day);
                System.out.println("now data is :"+toDate);
                long from = simpleFormat.parse(fromDate).getTime();  
                long to = simpleFormat.parse(toDate).getTime();  
                int days = (int) ((to - from)/(1000 ));  
                System.out.println("data seconds cut is :"+days);
            } catch (    IOException | ParseException ex) {
                Logger.getLogger(TimeManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TimeManager.class.getName()).log(Level.SEVERE, null, ex);              
        }    
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
}
