package STUDY;

import java.util.Scanner;

public class Tongxunlu {
    public  static void main(String[] args) {
        Student[] students = new Student[6];
        students[0]=new Student("wpy","man","123",18);
        students[1]=new Student("QQQ","woman","123",17);
        students[2]=new Student("www","man","456",19);
        students[3]=new Student("eee","man","123",23);
        students[4]=new Student("asd","man","4568",19);
        students[5]=new Student("rrr","woman","465",18);
Deal a=new Deal();
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        for (int n=0;n<=5;n++)
a.select(input,students[n]);
    }
}
