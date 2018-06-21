package readbirthdayinfile;

public class ReadBirthdayinFile {

    public static void main(String[] args) {
        TimeController tc=new TimeController();
        String fileString="Birthday.txt";
        tc.readTime(fileString);
    }
}
