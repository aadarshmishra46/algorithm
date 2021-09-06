package DynamicProgamming.LCS_and_LCS_BasedQuestion;

import java.util.Scanner;

/*
Longest Common Subsequence Problem solution using recursion
Given two sequences, find the length of longest subsequence present in both of them.
A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.

For example, “abc”,  “abg”, “bdf”, “aeg”,  ‘”acefg”, .. etc are subsequences of “abcdefg”.
 */
public class LCS_Memorization {
    static  int[][] t=new int[100][100];// it depend on the size of string x and string y , that means depend on constraint given on question
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String y=sc.nextLine();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                t[i][j]=-1;
            }
        }
        int length_lcs=lcs(x,y,x.length(),y.length());
        System.out.println(length_lcs);
    }
    public static int lcs(String x,String y, int m,int n){
        if(m==0 || n==0){
            return 0;
        }
        if(t[m][n] != -1){
            return t[m][n];
        }
        if(x.charAt(m-1) == y.charAt(n-1)){
            return t[m][n] = 1+lcs(x,y,m-1,n-1);
        }
        else
        {
            return t[m][n] =Math.max(lcs(x,y,m,n-1),lcs(x,y,m-1,n));
        }
    }

}
