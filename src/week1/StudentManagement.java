package week1;

public class StudentManagement {
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public Student [] Student_arr=new Student[100];
    public int StudentSum=0;
    
    public void add(Student s)
    {
        Student_arr[StudentSum]=s;
        StudentSum++;
    }
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        
        return s1.getGroup().equals(s2.getGroup()); 
    }
    void sortGroup()
    {
        for(int i=0;i<StudentSum;i++)
        {
            for(int j=i+1;j<StudentSum;j++)
            {
                if(0<Student_arr[i].getGroup().compareTo(Student_arr[j].getGroup()))
                {
                    Student x;
                    x=Student_arr[i];
                    Student_arr[i]=Student_arr[j];
                    Student_arr[j]=x;
                }
            }
        }
    }
    void studentsByGroup() {
        // TODO:
        //sap xep sinh vien theo lop
        sortGroup();
        //
        int StuSameGroup;
        for (int i=0;i<StudentSum;i+=StuSameGroup)
        {
            StuSameGroup=0;
            System.out.println("Group: "+Student_arr[i].getId());
            for(int j=i;j<StudentSum;j++)
            {
                if(Student_arr[i].getGroup().equals(Student_arr[j].getGroup()))
                {
                    System.out.println(Student_arr[j].getName());
                    StuSameGroup++;
                }
                else
                {
                    break;
                }
            }
        }
        
    }
    void Student_Management_out()
    {
        for(int i=0;i<StudentSum;i++)
        {
            System.out.println("------------------------------------");
            Student_arr[i].getInfo();
        }
    }
    void removeStudent(String id) {
        // TODO:
        for(int i=0;i<StudentSum;i++)
        {
            if(Student_arr[i].getId().equals(id))
            {
                for(int j=i;j<StudentSum;j++)
                {
                    Student_arr[j]=Student_arr[j+1];
                }
                StudentSum--;
                break;
            }
        }
        
    }

    public static void main(String[] args) {
        // TODO:
        StudentManagement Student_Management=new StudentManagement();
        //cau 6
        System.out.println("--------Câu 6--------");
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
        System.out.println("--------test getname()--------");
        System.out.println(me.getName());
        //6d
        System.out.println("--------test getInfo()--------");
        me.getInfo();
        //cau 8
        System.out.println("-------Câu 8--------");
        System.out.println("Test constructor Student()");
        Student a=new Student();
        a.getInfo();
        System.out.println("Test constructor Student(String n, String id, String e");
        Student b=new Student("Nguyen Huu Thanh","17021014","thanhnh99.amc@gmail.com");
        b.getInfo();
        System.out.println("Test contructor Student(Student s)");
        Student c=new Student(b);
        c.getInfo();
        //cau 10
        System.out.println("--------Câu 10--------\nTest sameGroup");  
        Student d=new Student(),e=new Student(),f=new Student();
        f.setGroup("INT22042");
        System.out.println("Neu cung lop in ra true, khac lop in ra false.");
        System.out.println("hai sinh vien d,e : "+Student_Management.sameGroup(d,e));
        System.out.println("hai sinh vien d,f : "+Student_Management.sameGroup(d,f));
        //cau 12
        System.out.println("Câu 12");
        Student_Management.add(a);
        Student_Management.add(b);
        Student_Management.add(c);
        Student_Management.add(d);
        Student_Management.add(e);
        Student_Management.Student_Management_out();
        System.out.println("------Remove Student-----");
        Student_Management.removeStudent("17021014");
        Student_Management.Student_Management_out();
        
        //cau 11
        System.out.println("-----------------Test Same by Group----------------");
        a.setName("Thanh");
        a.setGroup("1123");
        b.setName("Nam");
        b.setGroup("1123");
        c.setName("Sang");
        c.setGroup("1124");
        d.setName("Hung");
        d.setGroup("1124");
        e.setName("Manh");
        e.setGroup("1125");
        
        Student_Management.studentsByGroup();
        
    }
}
