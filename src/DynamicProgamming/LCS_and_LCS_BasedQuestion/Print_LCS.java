package DynamicProgamming.LCS_and_LCS_BasedQuestion;

import java.util.Scanner;

/*
Printing Longest Common Subsequence
Given two sequences, print the longest subsequence present in both of them.
Example:
LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
 */
public class Print_LCS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String y=sc.nextLine();
        int m=x.length();
        int n=y.length();
        int[][] t=new int[m+1][n+1];
        lcs(x,y,t,m,n);
        printLCS(x,y,t,m,n);
    }
    private static void lcs(String x, String y, int[][] t,int m, int n) {
        for (int i = 0; i < n+1; i++) {
            t[0][i]=0;
        }
        for (int i = 0; i < m+1; i++) {
            t[i][0]=0;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n+1; j++) {
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else
                {
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
    }
    private static void printLCS(String x, String y, int[][] t, int m, int n) {
        String s="";
        int i=m;
        int j=n;
 while (i>0 && j >0){
                if(i==0 ||  j==0){
                    break;
                }
                if(x.charAt(i-1)==y.charAt(j-1)){
                    s = s+x.charAt(i-1);


                    i--;
                    j--;
                }
                else
                {
                    if(t[i-1][j]>t[i][j-1]){

                        i--;
                    }
                    else if(t[i-1][j]<t[i][j-1])

                        j--;
                }
            }
            StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());
    }

}
