package STUDY;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        int i=2;
        ArrayList<Student>students=new ArrayList<>();
         students.add(new Student("wpy","1123"));
         students.add(new Student("qqq","1234"));
         students.add(new Student("www","4562"));
         students.trimToSize();
         Student[] a=new Student[students.size()];
         students.toArray(a);
        Class cl=a[0].getClass();
         System.out.println(a[1].getClass().getName()+"  "+a[1].getName());
       System.out.println(a[1]);
    }
}

