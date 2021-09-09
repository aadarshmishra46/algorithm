package DynamicProgamming.LCS_and_LCS_BasedQuestion;
/*
Longest Palindromic Subsequence
Given a sequence, find the length of the longest palindromic subsequence in it.
Example :
Input:"bbbab"
Output:4
 */
public class LongestPalendromicSubSeqeunce {
    public static void main(String[] args) {
        String s1="bbbab"; // there is some problem with stringBuffer ?
        String s2= "babbb";// reverse of s1 //


        // approch
        // longest palendromic subseqeunce=LCS(string a, reverse(string a))
        int longestLengthOfLPS=lps(s1,s2,s1.length(),s2.length());
        System.out.println(longestLengthOfLPS);

    }

    private static int lps(String x, String y, int m, int n) {
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
