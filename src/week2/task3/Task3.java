package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class Teacher
{
    private String name;
    private String subject;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void print()
    {
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Subject: "+getSubject());
    }
}