package week2.task3;

import java.util.Scanner;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

//CLASS TEACHER
class Teacher
{
    private String name;//ten giao vien
    private String subject;//Mon hoc giao vien day
    private int yearInWork;//so nam giang day

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearInWork() {
        return yearInWork;
    }

    public void setYearInWork(int yearInWork) {
        this.yearInWork = yearInWork;
    }

    public void input()
    {
        System.out.println("--00--NHAP THONG TIN GIAO VIEN--00--");
        System.out.print("Ten: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Mon hoc giang day: ");
        this.setSubject(new Scanner(System.in).nextLine());
        System.out.print("So nam giang day: ");
        this.setName(new Scanner(System.in).nextLine());
        
    }
    public int compareYearInWork(Teacher other)//SO SANH SO NAM LAM VIEC CUA HAI GIAO VIEN
    {
        if(this.yearInWork>other.yearInWork) return 1;//đối tượng this làm việc nhiều năm hơn đối tượng other
        else if(this.yearInWork<other.yearInWork) return -1;//đối tượng this làm việc ít năm hơn đối tượng other
        else return 0;//đối tượng this và đối tượng other làm việc cùng só năm
    }
    public void print()
    {
        System.out.println("Name: "+getName());
        System.out.println("Years in work: "+getYearInWork());
        System.out.println("Subject: "+getSubject());
    }
    
}
class Animal
{
    
}