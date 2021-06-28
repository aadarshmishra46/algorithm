package Math.BitManipulation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  n = sc.nextLong();
        long M = 1000000007;
        long count =0;
        n=n%M;
        for(n=n; n!=1;n /=10){
            long res1 = n%10;

            for(n=n/10;n/10!=1;n/=10){
                long res2 = n/10;
                if(res1>=res2)
                    count++;
            }

        }


        System.out.println(count);
    }
}