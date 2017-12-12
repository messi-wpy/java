package STUDY;

public class Deal  {
    //Student x=new Student();

public void select(String input,Student x)
    {

        if(input.equals(x.getName())||input.equals(x.getPhone()))
            System.out.println(x);

    }
}
