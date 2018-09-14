package week1;

public class Student {

    // TODO: khai bĂ¡o cĂ¡c thuá»™c tĂ­nh cho Student
    private String name;//ten sinh vien
    private String id;//ma sinh vien
    private String group;//lop hoc
    private String email;//dia chi email

    // TODO: khai bĂ¡o cĂ¡c phÆ°Æ¡ng thá»©c getter, setter cho Student

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    /**
     * Constructor 1
     */
    
    Student() {
        // TODO:
        this.name="Student";
        this.id="000";
        this.group="INT22041";
        this.email="uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.name=n;
        this.id=sid;
        this.email=em;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name=s.name;
        this.email=s.email;
        this.id=s.id;
        this.group=s.group;
    }

    void getInfo() {
        // TODO:
        String a="Name: "+this.name+"\nID: "+this.id+"\nGroup: "+this.group+"\nEmail: "+this.email;
        
        System.out.println(a); 
    }
}
