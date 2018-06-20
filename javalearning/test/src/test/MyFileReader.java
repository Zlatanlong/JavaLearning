package test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFileReader {
    String read(String fileName, int n){
        RandomAccessFile inAccessFile=null;
        String s="";
        try {
            inAccessFile=new RandomAccessFile(fileName, "r");
            inAccessFile.seek((n));
            s=String.valueOf((char)inAccessFile.readByte());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
}
