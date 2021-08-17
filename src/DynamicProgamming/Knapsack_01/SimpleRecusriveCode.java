package DynamicProgamming.Knapsack_01;
//simple recurrsive code without dp , you can say bruteforce approch
public class SimpleRecusriveCode {
    public static void main(String[] args) {
        int[] wt={1,2,4,5};
        int[] value={1,4,5,7};
        int W=7;
        int maxProfit=knapSack(wt,value,W,wt.length);
        System.out.println(maxProfit);
    }

    private static int knapSack(int[] wt, int[] value, int W, int n) {
        if(W==0 || n==0){
            return 0;
        }
        if(wt[n-1]<=W){
            return Math.max(value[n-1]+knapSack(wt,value,W-wt[n-1],n-1),knapSack(wt,value,W,n-1));
        }
        else {
            return knapSack(wt,value,W,n-1);
        }
    }
}
