import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread {
    public static void main(String []args){
        int id=0;
        ExecutorService executor= Executors.newCachedThreadPool();
        //lambda表达式＋泛型　　编译器可识别
        //(class<T >)()->{}

        executor.submit((Callable<? extends String>) () ->{
            int a=1;
            return "asd";
        });
        //返回值
        executor.submit(()->"hello");


        for (int i=0;i<5;i++){
            new Thread(()->{
                for (int j=5;j>=0;j--) {
                    System.out.print(":" + j + " ");
                }
                Thread.yield();
                System.out.println();
            }).start();
        }

    }
}
