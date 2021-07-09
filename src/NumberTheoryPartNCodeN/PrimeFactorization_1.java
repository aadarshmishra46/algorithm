package NumberTheoryPartNCodeN;

import java.util.Scanner;

public class PrimeFactorization_1 {
    //time complexity worst O(n)
    public  static  void primeFactorization_1(long n){
        for (int i = 2; i <= n; i++) {
            if(n%i==0){
                int cnt=0;
                while (n%i==0){
                    cnt++;
                    n=n/i;
                }
                System.out.print("("+i+"^"+cnt+")"+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        primeFactorization_1(n);
    }
}
