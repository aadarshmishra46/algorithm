package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    private static void toh(int n, char A, char B, char C) {
        if(n==0)
            return;
        toh(n-1,A,C,B);
        System.out.println(n+"["+A+" -> "+B+"]");
        toh(n-1,C,B,A);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        char A='A';
        char B='B';
        char C='C';
        toh(n,A,B,C);
    }


}
