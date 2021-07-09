package NumberTheoryPartNCodeN;

import java.util.Scanner;

public class PrimeFactorization_2 {
    //time complexity sqrt(n)
    public  static  void primeFactorization_2(long n){
        for (int i = 2; i*i <= n; i++) {
            if(n%i==0){
                int cnt=0;
                while (n%i==0){
                    cnt++;
                    n=n/i;
                }
                System.out.print("("+i+"^"+cnt+")"+" ");
            }

        }
        if(n>1){
            System.out.print("("+n+"^"+1+")");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        primeFactorization_2(n);
    }
}
