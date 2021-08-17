package DSAINTERPre;

import java.util.HashSet;
import java.util.Scanner;

public class DistnictVals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> hs=new HashSet<>();
        int count=0;
        for (int i = 0; i < n; i++) {
            boolean bool =hs.add(arr[i]);
            if(!bool)
                count++;
        }
        System.out.println(count);
    }
}
