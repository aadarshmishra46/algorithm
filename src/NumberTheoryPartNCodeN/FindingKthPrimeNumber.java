package NumberTheoryPartNCodeN;

import java.util.ArrayList;
import java.util.Scanner;

//link https://www.spoj.com/problems/TDKPRIME/
public class FindingKthPrimeNumber {
    public static int seive(int k)
    {
        ArrayList<Integer> al=new ArrayList<>();
        boolean[] is_Prime=new boolean[90000001];
        int maxN=90000000;
        for(int i=1;i<=maxN;i++){
            is_Prime[i]=true;
        }
        is_Prime[0]=is_Prime[1]=false;
        for (int i = 2; i*i <=maxN ; i++) {
            if(is_Prime[i]){
                for (int j = i*i; j <=maxN ; j+=i) {
                    is_Prime[j]=false;
                }
            }
        }
        for (int i = 2; i <=maxN ; i++) {
            if(is_Prime[i])
            {
                al.add(i);
            }
        }
        return al.get(k-1);

        }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            int k= sc.nextInt();
            System.out.println(seive(k));
        }


    }
}
