package NumberTheoryPartNCodeN;

import java.util.Scanner;

/* find the print all the prime number betweeen l and r both l and r inclusive
example l=2 r=10 output 2 3 5 7
where 0<l,r,<10001
 */
public class PrimeInterval {
    public  static void primeInterval(int l, int r){
        boolean[] isPrime=new boolean[10001];//all false;
        // which value are true that means they are not prime number
        isPrime[0]=true;
        isPrime[1]=true;
        for (int i = 2; i*i <=10000; i++) {
            if(!isPrime[i]){
                for (int j = i*i; j <=10000 ; j=j+i) {
                    isPrime[j]=true;//they are not prime
                }
            }
        }

        for (int i = l; i <=r ; i++) {
            if(!isPrime[i])
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        primeInterval(l,r);
    }
}
