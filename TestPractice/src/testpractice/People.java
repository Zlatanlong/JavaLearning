package testpractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class People {
    String birthday;
    void setBirthday(String birthday){
        this.birthday=birthday;
    }
    int getAge(){
        Date day = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
        int to = Integer.valueOf(sdf.format(day));
        int from = Integer.valueOf(birthday.substring(0, 4));
        return to-from;
    }
}
