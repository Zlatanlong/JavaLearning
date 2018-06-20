package readbirthdayinfile;

public class CountAge {
    /**
     * 计算从from到to两个日期经过的年
     * @param from
     * @param to
     * @return 
     */
    public int countAge(String from,String to){
        int fromYear = Integer.valueOf(from.substring(0, 4));
        int toYear = Integer.valueOf(to.substring(0, 4));
        return toYear-fromYear;
    }
}
