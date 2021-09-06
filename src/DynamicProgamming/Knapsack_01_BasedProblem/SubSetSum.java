package DynamicProgamming.Knapsack_01;
/*
Subset Sum Problem(Dynamic Programming)
Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.
Example:

Input:  set[] = {3, 34, 4, 12, 5, 2}, sum = 9
Output:  True  //There is a subset (4, 5) with sum 9.
 */
public class SubSetSum {
    public static void main(String[] args) {
        int[] arr={3, 34, 4, 12, 5, 2};
        int sum=9;
        boolean res=subSetSum(arr,arr.length,sum);
        System.out.println(res);
    }

    private static boolean subSetSum(int[] arr, int n, int sum) {
        boolean[][] t=new boolean[n+1][sum+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(i==0)
                    t[i][j]=false;
                if(j==0)
                    t[i][j]=true;
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum + 1; j++) {
               if(arr[i-1]<=j){
                   t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
               }
               else
               {
                   t[i][j]=t[i-1][j];
               }
            }

        }
        return t[n][sum];
    }
}
