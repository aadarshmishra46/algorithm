package DynamicProgamming.Knapsack_01;
/*
Sum of subset differences
Given a set of integers, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum.
If there is a set S with n elements, then if we assume Subset1 has m elements, Subset2 must have n-m elements and the value of abs(sum(Subset1) – sum(Subset2)) should be minimum.

Example:
Input:  arr[] = {1, 6, 11, 5}
Output: 1
Explanation:
Subset1 = {1, 5, 6}, sum of Subset1 = 12
Subset2 = {11}, sum of Subset2 = 11
 */
public class MinimumSubsetSumProblem
{
    public static void main(String[] args) {
        int arr[] = {1, 6, 11, 5};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        // here sum is range that means your minimum subset sum lie on 0 to sum(range ) here to 0 to 23;
        int res=minimumSubsetSum(arr,arr.length,sum);
        System.out.println(res);
    }

    private static int minimumSubsetSum(int[] arr, int n, int sum) {
        boolean[][] t=new boolean[n+1][sum+1];
        // initial initilization of matrix
        for (int i = 0; i < sum+1; i++) {
            t[0][i]=false;
        }
        for (int i = 0; i < n+1; i++) {
            t[i][0]=true;
        }
        // intilization subset sum in range is possible or not in dp matrix
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j-arr[i-1]] ||t[i-1][j];
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }
            }
        }
        // consider last row  and find the minimum subset sum using sum-2*i;
        int minimumSum=Integer.MAX_VALUE;
        for (int i = 0; i < (sum+1)/2; i++) {
            if(t[n][i]==true){
                int diff=Math.abs(sum-2*i);
                if(diff<minimumSum){
                    minimumSum=diff;

                }
            }
        }
        return minimumSum;
    }
}
