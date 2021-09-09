package InterviewPrerationNS;

import java.util.Scanner;

public class MaxFlags {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
       while (t-->0){
           int n=sc.nextInt();
           int m=sc.nextInt();
           int[] arr=new int[m];
           for (int i = 0; i < m; i++) {
               arr[i]=sc.nextInt();
           }
           int[] flag=new int[n+1];
           flagChange(arr,flag,m,flag.length);
       }

    }


    private static void flagChange(int[] arr, int[] flag, int m, int n) {
        int max=0;
        for (int i = 0; i < m; i++) {
            int val=arr[i];

            if(val<n){
                flag[val]++;
                if(flag[val]>max){
                    max=flag[val];
                }
            }
            else if(val == n)
            {
                for (int j = 1; j < n; j++) {
                    flag[j]=max;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            System.out.print(flag[i]+" ");
        }
        System.out.println();
    }
}
