package InterviewPrerationNS;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        sumOfTwo(arr,n,k);
    }

    private static void sumOfTwo(int[] arr, int n, int k) {
        LinkedHashMap<Integer,Integer> lhm= new LinkedHashMap<>();
        int minIndexRight=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int rem=k-arr[i];
            if(lhm.containsKey(rem)){
                int count=lhm.get(rem);

                for(int j = 0; j < count; j++) {
//                    System.out.print("(" + rem +
//                            ", " + arr[i] +
//                            ")" + "\n");
                   if(minIndexRight>i){
                       minIndexRight=i;
                   }
                }
            }
            if (lhm.containsKey(arr[i]))
            {
                lhm.put(arr[i], lhm.get(arr[i]) + 1);
            }
            else
            {
                lhm.put(arr[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]+arr[minIndexRight]==k){
                System.out.println((i+1)+" "+(minIndexRight+1));
                break;
            }
        }

    }

}
