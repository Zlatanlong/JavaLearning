/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author zlatan
 */
public class Tools {

    //使用静态变量，因为会变
    private static Students[] stus = new Students[20];
    private static int dataIndex = 0;

    public void printMenu() {
        System.out.println("1、录入学生信息");
        System.out.println("2、按年龄或姓名查询学生信息");
        System.out.println("3、删除指定学生");
        System.out.println("4、按学号修改学生年龄");
        System.out.println("5、学生信息浏览");
        System.out.println("6、退出");
    }

    /**
     * 输入学生数据
     */
    public Students stuSet() {
        Scanner scan = new Scanner(System.in);
        Students stu = new Students();

        while (true) {
            int flag = 0;
            String stuNum = stu.getStuNum();
            System.out.print("请输入学号：  ");
            stuNum = scan.next();
            for (int i = 0; i < dataIndex; i++) {
                if (stus[i].getStuNum().equals(stuNum)) {
                    System.out.println("请勿输入重复学号");
                    flag = 1;
                }
            }
            if (flag == 0) {
                stu.setStuNum(stuNum);
                break;
            }
        }

        String name = stu.getName();
        System.out.print("请输入姓名：  ");
        name = scan.next();
        stu.setName(name);

        while (true) {
            //一种得到想要输入的方法
            String sex = stu.getSex();
            System.out.print("请输入性别：  ");
            sex = scan.next();
            if (sex.equals("男") || sex.equals("女")) {
                stu.setSex(sex);
                break;
            } else {
                System.out.println("输入性别格式错误，只能输入男或女");
            }
        }
        while (true) {
            int age = stu.getAge();
            System.out.print("请输入年龄：  ");
            age = scan.nextInt();
            if (age <= 45 && age >= 15) {
                stu.setAge(age);
                break;
            } else {
                System.out.println("输入年龄信息错误，只能输入15到45间整数");
            }
        }

        String major = stu.getMajor();
        System.out.print("请输入专业：  ");
        major = scan.next();
        stu.setMajor(major);

        String reward = stu.getReward();
        System.out.print("请输入奖励：  ");
        reward = scan.next();
        stu.setReward(reward);

        return stu;
    }

    //输入学号返回学生  
    public Students findByStuNum() {
        Scanner scan = new Scanner(System.in);
        Students stu = new Students();
        String stuNum = stu.getStuNum();
        stuNum = scan.next();
        stu.setStuNum(stuNum);
        return stu;
    }

    //输入年龄返回学生  
    public Students findByAge() {
        Scanner scan = new Scanner(System.in);
        Students stu = new Students();
        int age = stu.getAge();
        age = scan.nextInt();
        stu.setAge(age);
        return stu;
    }

    //插入一个数据  
    public void insertStu(Students stu) {
        if (dataIndex >= stus.length) {
            Students[] tempStus = new Students[stus.length + stus.length >> 1];
            for (int i = 0; i < stus.length; i++) {
                tempStus[i] = stus[i];
            }
            stus = tempStus;
        }        
        stus[dataIndex] = stu;
        dataIndex++;
    }
    //更改学生数据  

    //删除学生  
    public void deleteStu(Students stu) {
        int flag=0;
        for (int i = 0; i < dataIndex; i++) {
            if (stus[i].getStuNum().equals(stu.getStuNum())) {
                flag=1;
                for (int s = 0; s < dataIndex; s++) {
                    if (s < dataIndex - 1) {
                        stus[i + s] = stus[i + s + 1];
                    }
                }
                dataIndex--;
                System.out.println("删除成功");
            }           
        }
        if (flag == 0) {
            System.out.println("没找到");
        }
    }

    //查找学生  
    public void findStu(Students stu) {
        int flag = 0;
        for (int i = 0; i < dataIndex; i++) {
            if (stus[i].getAge()==stu.getAge()) {
                System.out.println(stus[i]);
                flag=1;
            } else if (stus[i].getStuNum().equals(stu.getStuNum())) {
                System.out.println(stus[i]);
                flag=1;
            }
        }
        if (flag == 0) {
            System.out.println("没找到");
        }
    }

    //打印学生信息  
    public void printStuMenus() {
        for (int i = 0; i < dataIndex; i++) {
            System.out.println(stus[i]);
        }
    }

    //通过学号改年龄
    public void chanceAge(Students stu) {
        int flag = 0;
        for (int i = 0; i < dataIndex; i++) {
            if (stus[i].getStuNum().equals(stu.getStuNum())) {
                Scanner scan = new Scanner(System.in);
                while (true) {
                    int age = stus[i].getAge();
                    System.out.print("请输入年龄：  ");
                    age = scan.nextInt();
                    if (age <= 45 && age >= 15) {
                        stus[i].setAge(age);
                        break;
                    } else {
                        System.out.println("输入年龄信息错误，只能输入15到45间整数");
                    }
                }//年龄依旧是只能15~45
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("没找到");
        }
    }

    //从文件中读入
    public void readStudents() {
        File file = new File("Students.txt");       
        try {//缓冲流方法           
            Reader in = new FileReader(file);
            BufferedReader bufferRead = new BufferedReader(in);
            String str = null;
            while ((str = bufferRead.readLine()) != null) {
                Students stu = new Students();
                stu.setStuNum(str);
                stu.setName(str = bufferRead.readLine());
                stu.setSex(str = bufferRead.readLine());
                stu.setAge(Integer.parseInt(str = bufferRead.readLine()));
                stu.setMajor(str = bufferRead.readLine());
                stu.setReward(str = bufferRead.readLine());
                insertStu(stu);                
            }
            bufferRead.close();
            in.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }    

    //写到文件
    public void writeStudents() {
        //把旧文件按日期命名
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        File fileOld = new File("Students.txt");       
        fileOld.renameTo(new File("log",df.format(day)));
        
        File file = new File("Students.txt");
        try {
            file.createNewFile();
            Writer out = new FileWriter(file);
            BufferedWriter bufferWrite = new BufferedWriter(out);
            for (int i = 0; i < dataIndex; i++) {
                bufferWrite.write(stus[i].getStuNum());bufferWrite.newLine();                
                bufferWrite.write(stus[i].getName());bufferWrite.newLine();
                bufferWrite.write(stus[i].getSex());bufferWrite.newLine();
                bufferWrite.write(Integer.toString(stus[i].getAge()));bufferWrite.newLine();
                bufferWrite.write(stus[i].getMajor());bufferWrite.newLine();
                bufferWrite.write(stus[i].getReward());bufferWrite.newLine();
            }
            bufferWrite.close();
            out.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
