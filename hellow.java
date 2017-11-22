import java.util.Scanner;

public class hellow {
    public static void main(String[] args) {
        System.out.println("请输入两个数");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int n=1;
        int g=0;
        if (a>=b)
        {for(int i=1;i<=a;i++)
            if(a%i==0&&b%i==0)
              n=i;

    }
    else
        {
            for(int i=1;i<=b;i++)
                if(a%i==0&&b%i==0)
                    n=i;
        }
        g=a*b/n;
        System.out.println("最大公约数为"+n);
        System.out.println("最小公倍数"+g);
    }
}
