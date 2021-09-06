package DynamicProgamming.UnboundedKnapSack_and_UnboundedKnapSack_BasedProblem;
/*
Rod Cutting Problem
 Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n. Determine the  maximum value obtainable by cutting up the rod and selling the pieces.
Example:
if length of the rod is 8 and the values of different pieces are given as following, then the maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)


length   | 1   2   3   4   5   6   7   8
--------------------------------------------
price    | 1   5   8   9  10  17  17  20
 */
public class RodCuttingProblem {
    public static void main(String[] args) {
        int[] length={1,2,3,4,5,6,7,8};
        int[] price={1,5,8,9,10,17,17,20};
        int n=8;// total rod length
        int maxProfit=rodCutting(length,price,length.length,n);
        System.out.println(maxProfit);

    }

    private static int rodCutting(int[] length, int[] price, int m, int n) {
        int[][] t=new int[m+1][n+1];
        for (int i = 0; i < n+1; i++) {
            t[0][i]=0;
        }
        for (int i = 0; i < m+1; i++) {
            t[i][0]=0;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n+1; j++) {
                if(length[i-1]<=j){
                    t[i][j] = Math.max(price[i-1]+t[i][j-length[i-1]],t[i-1][j]);
                }
                else
                {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[m][n];
    }
}
