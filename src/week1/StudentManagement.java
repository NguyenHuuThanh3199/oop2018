package week1;

import java.util.Scanner;

public class StudentManagement {
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public Student [] Student_arr=new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        
        return s1.getGroup().equals(s2.getGroup()); 
    }

    void studentsByGroup() {
        // TODO:
        //sap xep sinh vien theo lop
        
    }

    void removeStudent(String id) {
        // TODO:
        int i=0;
        for(Student a:Student_arr)
        {
            i++;
            if(a.getId().equals(id))
            {
                System.out.println("Xoa sinh vien thu" +i);
            }
        }
    }

    public static void main(String[] args) {
        // TODO:
        StudentManagement Student_Management=new StudentManagement();
        //cau 6
        //6a
       Student thanh=new Student();
       //6b
        thanh.setGroup("INT2204-5");
        Student me=new Student();
        me.setName("Nguyen Huu Thanh");
        me.setId("17021014");
        me.setGroup("INT2204-5");
        me.setEmail("thanhnh99.amc@gmail.com");
        //6c
        System.out.println(me.getName());
        //6d
        me.getInfo();
        //cau 8
        Student a=new Student();
        a.getInfo();
        Student b=new Student("Nguyen Huu Thanh","17021014","thanhnh99.amc@gmail.com");
        b.getInfo();
        Student c=new Student(b);
        c.getInfo();
        //cau 10
        Student d=new Student(),e=new Student(),f=new Student();
        f.setGroup("INT22042");
        System.out.println("Neu cung lop in ra true, khac lop in ra false.");
        System.out.println("hai sinh vien d,e : "+Student_Management.sameGroup(d,e));
        System.out.println("hai sinh vien d,f : "+Student_Management.sameGroup(d,f));
//        
//          StudentManagement St_list=new StudentManagement();
//          for(int i=0;i<5;i++)
//          {
//              St_list.Student_arr[i]=new Student();
//              St_list.Student_arr[i].setId(new Scanner(System.in).nextLine());
//          }
//          if(St_list.sameGroup(St_list.Student_arr[0], St_list.Student_arr[1]))
//          {
//              System.out.println("Hai hoc sinh cung lop");
//          }
//          else 
//          {
//              System.out.println("Hai hoc sinh khong cung lop");
//          };
//          St_list.removeStudent("int22024");      
    }
}
