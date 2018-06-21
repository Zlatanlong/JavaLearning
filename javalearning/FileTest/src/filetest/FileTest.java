package filetest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        String fileName = "1510020104.txt";
        /* 
         * FileController.createDir(dirName);  
          
         try {
         Date day = new Date();
         SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
         File file = new File("dirName",df.format(day));  
         File filedate = new File("dirName","aa.txt");          
         try {
         file.createNewFile();
         filedate.createNewFile();               
         } catch (IOException ex) {
         Logger.getLogger(FileTest.class.getName()).log(Level.SEVERE, null, ex);
         }

            
         Runtime ec= Runtime.getRuntime();
         File file5 = new File("C:\\windows\\notepad.exe");
         ec.exec(file5.getAbsolutePath());
         } catch (IOException ex) {
         Logger.getLogger(FileTest.class.getName()).log(Level.SEVERE, null, ex);
         } 
         FileController.delFolder(dirName);
         */
        TimeManager time = new TimeManager();
        time.setName("lcl");
        File f = new File(fileName);
        try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(FileTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        File f2 = new File("C:\\Users\\青果\\Desktop\\a.txt");
        try {
            f2.createNewFile();
            FileOutputStream fileOut = new FileOutputStream(f2);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(time);
            objOut.close();
            //从文件中读入对象！！
            FileInputStream fileIn = new FileInputStream(f2);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            TimeManager time2 = (TimeManager) objIn.readObject();
            objIn.close();
            System.out.println("TimeManager name is  " + time2.getName());
        } catch (ClassNotFoundException e) {
            e.toString();
        } catch (IOException ex) {
            Logger.getLogger(FileTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        //time.outputCurrentTime(f);
        time.getInternal(f);
        FileController.insert(f, 3, "lyxsb");
    }
}
