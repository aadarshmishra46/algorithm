package DynamicProgamming.Knapsack_01;

import java.util.Arrays;
public class RecursionWithMemorization {
    static int[][] t=new int[5][5];

    public static void main(String[] args) {
        int[] wt={1,2,4,5};
        int[] value={1,4,5,7};
        int W=7;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               t[i][j]=-1;
            }
        }
        int maxProfit=knapSack(wt,value,W,wt.length);
        System.out.println(maxProfit);

    }

    private static int knapSack(int[] wt, int[] value, int w, int n) {
        if(n==0 || w==0){
            return 0;
        }
        if(t[n][w]!=-1){
            return t[n][w];
        }
        if(wt[n-1]<=w){
           return t[n][w]=Math.max(value[n-1]+knapSack(wt,value,w-wt[n-1],n-1),knapSack(wt,value,w,n-1));
        }
        else{
            return  t[n][w]=knapSack(wt,value,w,n-1);
        }

    }
}
