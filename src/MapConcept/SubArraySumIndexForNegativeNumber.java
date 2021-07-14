package MapConcept;

import java.util.HashMap;
import java.util.Scanner;

public class SubArraySumIndexForNegativeNumber {
    public  static  void checkSumindex(int[] arr,int n, int k){
        int currunt_Sum=0;
        int start=0;
        int end=-1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < n; i++) {
            currunt_Sum=currunt_Sum+arr[i];
            if(currunt_Sum-k==0){
                start=0;
                end =i;
                break;
            }
            if(hm.containsKey(currunt_Sum-k)){
                start=hm.get(currunt_Sum-k)+1;
                end =i;
                break;
            }
            hm.put(currunt_Sum,i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        checkSumindex(arr,n,k);
    }
}
