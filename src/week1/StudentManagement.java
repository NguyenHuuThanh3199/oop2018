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
//        Student thanh=new Student();
//        thanh.setGroup("INT2204-5");
//        Student me=new Student();
//        me.setName("Nguyen Huu Thanh");
//        me.setId("17021014");
//        me.setGroup("INT2204-5");
//        me.setEmail("thanhnh99.amc@gmail.com");
//        System.out.println("Cung lop");
//        System.out.println(me.getName());
//        System.out.println(me.getInfo());
          StudentManagement St_list=new StudentManagement();
          for(int i=0;i<5;i++)
          {
              St_list.Student_arr[i]=new Student();
              St_list.Student_arr[i].setId(new Scanner(System.in).nextLine());
          }
//          if(St_list.sameGroup(St_list.Student_arr[0], St_list.Student_arr[1]))
//          {
//              System.out.println("Hai hoc sinh cung lop");
//          }
//          else 
//          {
//              System.out.println("Hai hoc sinh khong cung lop");
//          };
          St_list.removeStudent("int22024");
          
        
    }
}
