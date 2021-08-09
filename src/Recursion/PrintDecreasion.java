package Recursion;

import java.util.Scanner;

public class PrintDecreasion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDecreasting(n);
    }

    private static void printDecreasting(int n) {
        if(n==0)
            return;
        System.out.println(n);
        printDecreasting(n-1);
    }
}
