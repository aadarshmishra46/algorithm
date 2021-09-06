package DynamicProgamming.UnboundedKnapSack_and_UnboundedKnapSack_BasedProblem;
/*
Input : W = 100
       val[]  = {1, 30}
       wt[] = {1, 50}
Output : 100
There are many ways to fill knapsack.
1) 2 instances of 50 unit weight item.
2) 100 instances of 1 unit weight item.
3) 1 instance of 50 unit weight item and 50
   instances of 1 unit weight items.
We get maximum value with option 2.

Input : W = 8
       val[] = {10, 40, 50, 70}
       wt[]  = {1, 3, 4, 5}
Output : 110
We get maximum value with one unit of
weight 5 and one unit of weight 3.;
 */
public class UnboundedKnapSack {
    public static void main(String[] args) {
        int[] wt = {1, 50};
        int[] value = {1, 30};
        int w = 100;
        int maxProfit = unboundedknapSack(wt, value, wt.length, w);
        System.out.println(maxProfit);
    }

    private static int unboundedknapSack(int[] wt, int[] value, int n, int w) {
        int[][] t = new int[n + 1][w + 1];
        for (int i = 0; i < w + 1; i++) {
            t[0][i] = 0;
        }
        for (int i = 0; i < n + 1; i++) {
            t[i][0] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(value[i-1] + t[i][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }
}
