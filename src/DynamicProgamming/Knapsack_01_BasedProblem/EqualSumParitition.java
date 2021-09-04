package DynamicProgamming.Knapsack_01;
/*
Equal Sum Partition Problem
Partition problem is to determine whether a given set can be partitioned into two subsets such that the sum of elements in both subsets is same.
Examples:

arr[] = {1, 5, 11, 5}
Output: true
The array can be partitioned as {1, 5, 5} and {11}
 */
public class EqualSumParitition {
    public static void main(String[] args) {
        int[] arr={3, 5, 11, 5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        if(sum%2!=0){
            System.out.println("false");
        }
        else
        {
            boolean res=equalSumPartiion(arr, arr.length,sum/2);
            System.out.println(res);
        }
    }

    private static boolean equalSumPartiion(int[] arr,int n, int sum) {
        boolean[][] t=new boolean[n+1][sum+1];
        for (int i = 0; i < sum+1; i++) {
            t[0][i]=false;
        }
        for (int i = 0; i < n+1; i++) {
            t[i][0]=true;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
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
