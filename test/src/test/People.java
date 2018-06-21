package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class People {

    String birthday;

    void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    int getAge() {
        int year = Integer.valueOf(birthday.substring(0, 4));
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        int now = Integer.valueOf(df.format(day));
        return now - year;
    }
}
