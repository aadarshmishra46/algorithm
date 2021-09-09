package DynamicProgamming.LCS_and_LCS_BasedQuestion;

import java.util.Scanner;

/*
Longest Common Subsequence Problem solution using recursion
Given two sequences, find the length of longest subsequence present in both of them.
A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.

For example, “abc”,  “abg”, “bdf”, “aeg”,  ‘”acefg”, .. etc are subsequences of “abcdefg”.
 */
public class LCS_TopDownDP {
    public static void main(String[] args) {
        Scanner scc=new Scanner(System.in);
        String x= "babbb";
        String y="bbbab";
        int lenght_lcs=lcs(x,y,x.length(),y.length());
        System.out.println(lenght_lcs);
    }

    private static int lcs(String x, String y, int m, int n) {
        int[][] t=new int[m+1][n+1];
        for (int i = 0; i < n+1; i++) {
            t[0][i]=0;
        }
        for (int i = 0; i < m+1; i++) {
            t[i][0]=0;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n+1; j++) {
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j] =1+t[i-1][j-1];
                }
                else
                {
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        return t[m][n];
    }
}
