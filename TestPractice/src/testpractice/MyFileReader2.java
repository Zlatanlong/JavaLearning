package testpractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFileReader2 {
    String read(String fileName, int n){
        Reader in=null;
        StringBuffer sb=new StringBuffer();
        try {
            in = new FileReader(fileName);
            BufferedReader br=new BufferedReader(in);
            String str=null;
            while ((str=br.readLine())!=null) {
                sb.append(str);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyFileReader2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyFileReader2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(MyFileReader2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return sb.toString().substring(n, n+1);
    }
}
