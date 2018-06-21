package test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFileReader {
    /**
     * 该读取名为fileName的文件，返回文件中第n个字符
     * @param fileName
     * @param n
     * @return 
     */
    String read(String fileName, int n){
        RandomAccessFile inAccessFile=null;
        String s="";
        try {
            inAccessFile=new RandomAccessFile(fileName, "r");
            inAccessFile.seek((n));
            s=String.valueOf((char)inAccessFile.readByte());//把字节转化成char，然后转化成String
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
}
