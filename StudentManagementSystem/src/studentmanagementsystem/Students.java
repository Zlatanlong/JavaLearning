/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

/**
 *
 * @author zlatan
 */
public class Students {
    private String stuNum;  
    private String name;  
    private String sex;  
    private int age;    
    private String major;
    private String reward;
    public String getStuNum() {  
        return stuNum;  
    }  
    public void setStuNum(String stuNum) {  
        this.stuNum = stuNum;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getSex() {  
        return sex;  
    }  
    public void setSex(String sex) {  
        this.sex = sex;               
    }  
    public int getAge() {  
        return age;  
    }  
    public void setAge(int age) {  
        this.age = age;  
    }   
   
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }
    
    @Override
    public String toString(){  
        return "学号: "+getStuNum()+"\t"+"姓名: "+getName()+"\t"+"性别: "+getSex()+
                "\t"+"年龄: "+getAge()+"\t"+"专业: "+getMajor()+"\t"+"奖励: "+getReward();  
    }  
}
