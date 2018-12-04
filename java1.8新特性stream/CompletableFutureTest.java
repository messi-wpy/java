import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {
    public static void main(String []args){
        CompletableFuture<Integer> future =CompletableFuture.supplyAsync(()->computer(4));
        System.out.print("before\n");
        //get()将会使当前线程阻塞(如果该任务没有完成的话),直到任务完成返回,(从创建开始执行)
        try {
            Thread.sleep(4000);
            System.out.print("sleep 4s\n");
            System.out.print("3s later:"+future.get()+'\n');
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.print("later\n");
    }

    public static int computer(int x) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  x*x;

    }
}
