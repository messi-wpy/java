package STUDY;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(String name,String phone) {
        this.name=name;
        this.phone=phone;

    }
/*public  void  readinput()
{
    Scanner in=new Scanner(System.in);
    String name=in.next();
    String phone=in.next();
    int age =in.nextInt();
}*/
    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public void eat() {
        System.out.println("chi");
    }

    public void play() {
        System.out.println("play computer games");
    }

   public String toString() {

        return "information" + name + " " + age + " " + address + "  " + gender;
    }
}
