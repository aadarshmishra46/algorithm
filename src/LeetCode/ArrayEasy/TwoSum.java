package LeetCode.ArrayEasy;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,5,5,11};
        int target=10;
        int[] res=twoSum(arr,target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    public static int[] twoSum(int[] arr, int target) {
        int[] res = new int[2];
        int val1 = 0;
        int val2 = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if (hs.contains(temp)) {
                 val1=temp;
                 val2=arr[i];
                 break;
            }
            hs.add(arr[i]);
        }
        System.out.println(val1+" "+val2);
        boolean b1=false;
        boolean b2=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==val1 && b1==false){
                res[0]=i;
                b1=true;
            }
           else if(arr[i]==val2 &&  b2==false){
                res[1]=i;
                b1=true;
            }
        }
        return res;
    }
}
