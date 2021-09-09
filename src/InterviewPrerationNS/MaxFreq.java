package InterviewPrerationNS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxFreq {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        maxFreq(arr,n);
    }

    private static void maxFreq(int[] arr, int n) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(hs.containsKey(arr[i])){
                hs.put(arr[i],hs.get(arr[i])+1);
            }
            else
            {
                hs.put(arr[i],1);
            }
        }
        int max_freq=0,ele=-1;
        int res=-1;
        for (Map.Entry<Integer,Integer> val:hs.entrySet()){
            if(max_freq <= val.getValue()){
                ele= val.getKey();
           //     System.out.println(ele);
                if(ele>res){
                    res=ele;
                    max_freq= val.getValue();
                }
            }
        }
        System.out.println(res);
    }

}
