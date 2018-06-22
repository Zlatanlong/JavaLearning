package testpractice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFileReader {
    String read(String fileName, int n){
        FileReader in = null;
        char[] c=new char[20];
        try {
            in = new FileReader(fileName);
            in.read(c);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(MyFileReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        char tc=c[n];
        return String.valueOf(tc);
    }
}
