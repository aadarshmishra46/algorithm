package Math.Modulo;

import java.util.Scanner;

public class TribonacciNumber {

    private static long tribonacciNumberUsingModulo(long n, long t1, long t2, long t3,long mod) {
        long last=0;
        while (n-3>0)
        {
            last=((t1%mod)+(t2%mod)+(t3%mod))%mod;//6
            t1=t2%mod;
            t2=t3%mod;
            t3=last%mod;
            n--;
        }
        return last;
    }
    public static void main(String[] args) {
        long mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long t1 = sc.nextLong();
        long t2 = sc.nextLong();
        long t3 = sc.nextLong();
        System.out.println(tribonacciNumberUsingModulo(n,t1,t2,t3,mod));
    }

}
