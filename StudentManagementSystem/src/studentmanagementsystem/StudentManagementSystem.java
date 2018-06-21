/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.util.Scanner;

/**
 *
 * @author zlatan
 */
public class StudentManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);  
        System.out.println("欢迎来到学生信息管理系统！");  
        Tools tool = new Tools();   
        tool.readStudents();
        title:  while(true){  
        tool.printMenu();  
        System.out.println("请选择操作");  
            switch(scan.nextInt()){  
            case 1:  
                Students stu = tool.stuSet();  
                tool.insertStu(stu);  
                System.out.println("数据保存成功\n");  
                break ;  
                
            case 2://查找学生  
                System.out.println("请选择查找方式：");  
                System.out.println("1.根据年龄查找学生信息");  
                System.out.println("2.根据学号查找学生信息");  
                int b = scan.nextInt();  
                if(b==1){                     
                    System.out.println("请输入学生年龄：");  
                    Students stu3 = tool.findByAge();  
                    tool.findStu(stu3);  
                    break;  
                }  
                else if(b==2){  
                    System.out.println("请输入学生学号：");  
                    Students stu4 = tool.findByStuNum();  
                    tool.findStu(stu4);  
                    break;  
                }  
             case 3://删除学生信息  
                System.out.println("请输入需要删除的学生学号：");  
                Students stu2 = tool.findByStuNum();  
                tool.deleteStu(stu2);                    
                break;   
                
            case 4://按照学号修改年龄    
                System.out.println("请输入学生学号：");
                Students stu5=tool.findByStuNum();                               
                tool.chanceAge(stu5);
            case 5://全部输出    
                tool.printStuMenus();;  
                break; 
                
            case 6:  
                tool.writeStudents();
                System.out.println("欢迎再次使用本系统，再见！！！");  
                break title;  
            default:  
                break;  
            }  
        }  
    }
    
}
