package DynamicProgamming.Knapsack_01_and_Knapsack_01_BasedProblem;
/*
Target Sum Problem
Given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.

Find out how many ways to assign symbols to make sum of integers equal to target S.

Example 1:
Input: nums is [1, 1, 1, 1, 1], S is 3.
Output: 5
Explanation:

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3

There are 5 ways to assign symbols to make the sum of nums be target 3.

 */
// Note this is the same problem of countSubsetWithGivenDiffernce  only the statement is changed
public class TargetSum {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1};
        int targetSum=3;
         /* solution
     let s1 and s2 two subset
     then sum(s1)-sum(s2)=diff;
          sum(s1)+sum(s2)=sum(arr);
     -->adding both equation
     2*sum(s1)=diff+sum(arr);
     sum(s1)=(diff+sum(arr))/2;
     Now we should only count the no of subset which sum is (diff+sum(arr))/2; that is sum(s1);
     */
        // find array sum
        int sumOfArray=0;
        for(int i=0;i<nums.length;i++){
            sumOfArray +=nums[i];
        }
        // here sum is sum(s1);
        int sum=(targetSum+sumOfArray)/2;
        int countOfTargetSum=targetSum(nums,nums.length,sum);
        System.out.println(countOfTargetSum);
    }

    private static int targetSum(int[] nums, int n, int sum) {
        int[][] t=new int[n+1][sum+1];
        for (int i = 0; i < sum+1; i++) {
            t[0][i]=0;
        }
        for (int i = 0; i < n+1; i++) {
            t[i][0]=1;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(nums[i-1]<=j){
                    t[i][j]=t[i-1][j-nums[i-1]]+t[i-1][j];
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
