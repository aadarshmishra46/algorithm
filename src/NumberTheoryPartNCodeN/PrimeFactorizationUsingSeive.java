package NumberTheoryPartNCodeN;

import java.util.Scanner;
import java.util.Vector;

public class PrimeFactorizationUsingSeive {
    static  final int maxN=100001;
    static int spf[]=new int[maxN];// smallest prime factor of every number
    static void seive(){
        spf[1]=1;
        for (int i = 2; i < maxN; i++) {
            spf[i] = i;//spf {0,1,2,3,4,.....maxN-1}
        }
            // for every even number smalles prime factor is 2 it is sepreatly
        for (int i = 4; i < maxN; i+=2) {
            spf[i]=2;//spf {0,1,2,3,2,5,2.....}
        }
        for (int i = 3; i*i < maxN; i++) {
            //check if i is prime
            if(spf[i]==i){
                for (int j = i*i; j <maxN ; j+=i) {
                    if(spf[j]==j)
                        spf[j]=i;
                }
            }
        }
    }
    static Vector<Integer> getFactorization(int x){
        Vector<Integer> v=new Vector<>();
        while (x!=1) {
            v.add(spf[x]);
            x = x / spf[x];
        }
        return v;
    }
    public static void main(String[] args) {
        seive();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            Vector<Integer> v=getFactorization(n);
            for (int i = 0; i < v.size(); i++) {
                System.out.print(v.get(i)+" ");

            }
        }
    }
}
