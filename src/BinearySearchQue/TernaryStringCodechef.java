package BinearySearchQue;

import java.util.Scanner;

//link https://codeforces.com/problemset/problem/1354/B
public class TernaryStringCodechef {
    public static int ternaryString(String s){
        int res=Integer.MAX_VALUE;
        int l=3;// atleast
        int r=s.length();
        while (l<=r){
            int mid=(l+r)/2;
            if(isValid(mid,s)){
                res=Math.min(res,mid);
                r=mid-1;
            }
            else
                l=mid+1;
        }
        if(res==Integer.MAX_VALUE)
            return 0;
        else
            return res;
    }
    public static boolean isValid(int k,String s){
        int[] arr=new int[4];
        for (int i = 0; i < k-1; i++) {
            int idx=s.charAt(i)-'0';
            arr[idx]++;
        }
        for (int i = k-1; i <s.length(); i++) {
            int idx=s.charAt(i)-'0';
            if(arr[1]>0 && arr[2]>0 && arr[3]>0)
                return true;
            idx=s.charAt(i-k+1)-'0';
            arr[idx]--;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


            String s=sc.nextLine();
            System.out.println(ternaryString(s));

    }
}
