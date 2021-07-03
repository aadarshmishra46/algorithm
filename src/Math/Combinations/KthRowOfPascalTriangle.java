package Math.Combinations;

import java.util.ArrayList;
import java.util.Scanner;

public class KthRowOfPascalTriangle {

    public  static void kthRowOfPascalTriangle(int k)
    {
        for (int i = 0; i <=k; i++) {
            System.out.print(nCr(k,i)+" ");
        }
    }
    public  static long nCr(int n,int r)
    {
        int mod=(int)1e9+7;
        r=Math.min(r,n-r);
        long res=1;
        for (int i = 1; i <=r; i++) {
            res=((res*(n-i+1))/i)%mod;
        }
        return res;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
     long mod = (long) 1e9 + 7;
    kthRowOfPascalTriangle(k);
        /*
        ArrayList<Long> al=new ArrayList();
        for (int i = 0; i < k+1; i++) {
            al.add(1l);

        }
        for (int i = 1; i < k; ++i) {
            for (int j = i; j >0 ; --j) {
                al.set(j,(al.get(j)%mod+al.get(j-1)%mod)%mod);

            }

        }
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i)+" ");
        }

         */
    }


}
