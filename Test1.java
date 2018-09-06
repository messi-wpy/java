import java.util.List;

public class Test1 {
    public static void  main(String []args){
        System.out.print("Hello java 10");
        var a=10;
        var s="java10";
        System.out.print(s+a);
        Test1[] t=new Max[3];
        t[0]=new Max();
        t[2]=new Zzz();
        System.out.print(t[0].getClass().toString());
        System.out.print(t[2].getClass().toString());

    }

    public void test(){
        Box<String>stringBox=new Box<>();

    }

    public static class Max extends Test1{}
    public static class Zzz extends Max{}

     private class  Box<T>{
        private T name;
        private T info;
        public T getName(){
            return name;
        }
        public <T> T calcute(T temp){
            return temp;

        }
        public <T extends ContainerWithMostWater> int Container(T x,int[]a ){
            return x.maxArea(a);

        }

    }
}
