package Math.Combinations;

import java.util.Scanner;

public class SimpleColor {

        public static long numberOfColor(int n,int k)
        {
            int mod=1000000007;
            long res=k;
            for(int i=1;i<=n;i++)
            {

                    res =(res%mod*k%mod)%mod;


            }
            return res;
        }
        public static void main (String[] args) {
            // Your code here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            System.out.println(numberOfColor(n,k));
        }
}

