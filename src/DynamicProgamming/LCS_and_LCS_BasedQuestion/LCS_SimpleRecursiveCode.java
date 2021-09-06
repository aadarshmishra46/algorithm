package DynamicProgamming.LCS_and_LCS_BasedQuestion;

import java.util.Scanner;

/*
Longest Common Subsequence Problem solution using recursion
Given two sequences, find the length of longest subsequence present in both of them.
A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.

For example, “abc”,  “abg”, “bdf”, “aeg”,  ‘”acefg”, .. etc are subsequences of “abcdefg”.
 */
public class LCS_SimpleRecursiveCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String y=sc.nextLine();
        int length_lcs=lcs(x,y,x.length(),y.length());
        System.out.println(length_lcs);
    }

    private static int lcs(String x, String y, int n, int m) {
        // base condition
        if(n==0 || m == 0){
            return 0;
        }
        if(x.charAt(n-1)==y.charAt(m-1)){
            return 1+lcs(x,y,n-1,m-1);
        }else {
            return Math.max(lcs(x,y,n,m-1),lcs(x,y,n-1,m-1));
        }
    }
}
