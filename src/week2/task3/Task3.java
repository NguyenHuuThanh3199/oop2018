package week2.task3;

import java.util.Scanner;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

//CLASS TEACHER
class Teacher
{
    private String name;//ten giao vien
    private String subject;//Mon hoc giang 
    private int InClass;//lop giang day
    private int yearInWork;//so nam giang day

    public int getInClass() {
        return InClass;
    }

    public void setInClass(int InClass) {
        this.InClass = InClass;
    }

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
    public boolean SameSubjectAndClass(Teacher other)//kiểm tra xem hai giao vien co day rung lop hay khong
    {
        if(other.subject.equals(this.subject)&&other.InClass==this.InClass) return true;//hai giao vien day trung lop
        return false;//hai giao vien khong day trung lop
    }
    public void print()
    {
        System.out.println("Name: "+getName());
        System.out.println("Years in work: "+getYearInWork());
        System.out.println("Subject: "+getSubject());
    }
    
}
class pets
{
    private String nameOfBoss;
    private String typePets;
    private String name;
    private int yearOld;
    private int weight;
    private String hobby;
    private String favoriteFood;

    public String getNameOfBoss() {
        return nameOfBoss;
    }

    public void setNameOfBoss(String nameOfBoss) {
        this.nameOfBoss = nameOfBoss;
    }

    
    public String getTypePets() {
        return typePets;
    }

    public void setTypePets(String typePets) {
        this.typePets = typePets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
    public boolean sameHooby(pets other)//so sanh so thich cua hai thu cung.
    {
        return this.hobby.equals(other.hobby);
        //return true neu giong;
        //return false neu khong giong
    }
    public void SameTypePetsSameBoss(pets other)//kiem tra xem 2 con pets co cung chu khong, neu khong thi kiem tra xem co cung loai khong
    {
        if(this.nameOfBoss.equals(other.nameOfBoss))
        {
            if(this.typePets.equals(other.typePets)) 
                System.out.println("Hai con vat cung chu va cung loai dong vat");
            else
                System.out.println("Hai con vat cung chu nhung khong cung loai dong vat");

        }
        else
        {
            if(this.typePets.equals(other.typePets)) 
                System.out.println("Hai con vat khong cung chu nhung cung loai dong vat");
            else
                System.out.println("Hai con vat khong cung chu va khong cung loai dong vat");
        }
    }
    public void out()//in ra thong tin cua thu cung
    {
        System.out.println("----------THONG TIN THU CUNG-----------");
        System.out.println("Loai thu cung: "+this.typePets);
        System.out.println("Ten thu cung: "+this.name);
        System.out.println("Tuoi: "+this.typePets+" tuoi");
        System.out.println("Loai thuc an yeu thich: "+this.favoriteFood);
    }
}
class Motelroom
{
    private String address;//địa chỉ
    private String acreage;//dien tich
    private int price;//gia phong
    private boolean status=false;//phong da duoc thue chua. Khoi tao phong trong.
    private int rate;//danh gia phong tro

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAcreage() {
        return acreage;
    }

    public void setAcreage(String acreage) {
        this.acreage = acreage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
    public int CompareToPrice(Motelroom other)//so sanh gia phong cua hai phong
    {
        if(this.price>other.price) return 1;//phong this co gia cao hon phong other
        else if(this.price<other.price) return -1;//phong this co gia thap hon phong other
        else return 0;//hai phong co gia bang nhau
    }
    
    public void out()//in ra thong tin phong tro
    {
        System.out.println("-----THONG TIN PHONG TRO-----");
        if(this.status=true) System.out.println("Phong da duoc thue");
        else System.out.println("Phong con trong");
        System.out.println("Dia chi: "+ this.address);
        System.out.println("Dien tich: "+this.acreage);
        System.out.println("Gia phong: "+this.price);
    }
}