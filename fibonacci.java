import java.util.*;
public class fibonacci {
    public static void main(String[] args){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the series-");
        a=sc.nextInt();
        int a0=0,a1=1;
        System.out.println("1");
        int n;
        for(int i=1;i<a;i++){
            n=a0+a1;
            System.out.println(n);
            a0=a1;
            a1=n;
        }
        System.out.println("End of series");
    }
}
