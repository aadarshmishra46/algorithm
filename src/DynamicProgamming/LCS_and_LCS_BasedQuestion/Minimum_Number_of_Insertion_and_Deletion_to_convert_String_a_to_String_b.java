package DynamicProgamming.LCS_and_LCS_BasedQuestion;

import java.util.Scanner;

public class Minimum_Number_of_Insertion_and_Deletion_to_convert_String_a_to_String_b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        // approch
        // Minimum_Number_of_Insertion_and_Deletion_to_convert_String_a_to_String_b
        // deletion=a.length-lcsLenth
        //insertion=b.lenth-lcsLenth
        int lcs_length=lcs_Length(a,b,a.length(),b.length());
        //   System.out.println(lcs_length);
        int insertion=b.length()-lcs_length;
        System.out.println("insertion "+insertion);
        int deletion=a.length()-lcs_length;
        System.out.println("deletion "+deletion);
    }

    private static int lcs_Length(String a, String b, int m, int n) {
        int[][] t=new int[m+1][n+1];
        for (int i = 0; i < n+1; i++) {
            t[0][i]=0;
        }
        for (int i = 0; i < m+1; i++) {
            t[i][0]=0;
        }
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if(a.charAt(i-1)==b.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[m][n];
    }
}
