package DynamicProgamming.Knapsack_01;
/*
int[] arr={1,1,2,3}
diff=1
o/p=3
explaination
subset are - {1 ,2} ,{3,1}
             {1 ,2},{1,3}
             {1 1 2}{3}
 */
public class CountSubsetWithGivenDifference {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
        int diff = 1;
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
        for(int i=0;i<arr.length;i++){
            sumOfArray +=arr[i];
        }
        // here sum is sum(s1);
        int sum=(diff+sumOfArray)/2;
        int result=countNoSubsetWithGivenDiff(arr,arr.length,sum);
        System.out.println(result);
    }

    private static int countNoSubsetWithGivenDiff(int[] arr, int n, int sum) {
        int[][] t=new int[n+1][sum+1];
        for (int i = 0; i < sum+1; i++) {
            t[0][i]=0;
        }
        for (int i = 0; i < n+1; i++) {
            t[i][0]=1;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j-arr[i-1]]+t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }

}
