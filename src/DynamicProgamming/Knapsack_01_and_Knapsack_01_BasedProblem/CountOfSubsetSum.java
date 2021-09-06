package DynamicProgamming.Knapsack_01;
/*
Count of subsets sum with a Given sum
Given an array arr[] of length N and an integer X, the task is to find the number of subsets with sum equal to X.
Example:

Input: arr[] = {1, 2, 3, 3}, X = 6
Output: 3
All the possible subsets are {1, 2, 3},
{1, 2, 3} and {3, 3}
 */
public class CountOfSubsetSum {
    public static void main(String[] args) {
        int  arr[] = {1, 2, 3, 3};
        int sum=6;
        int res=countOfSubsetSum(arr,arr.length,sum);
        System.out.println(res);
    }

    private static int countOfSubsetSum(int[] arr, int n, int sum) {
        int[][] t=new int[n+1][sum+1];
        for (int i=0;i<sum+1;i++) {
            t[0][i] = 0;
        }
        for (int i=0;i<n+1;i++) {
            t[i][0] = 1;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j-arr[i-1]]+t[i-1][j];
                }else {
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}
