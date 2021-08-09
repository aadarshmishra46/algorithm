package Recursion;

import java.util.Scanner;

public class PowerInBinaryCoef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(x,n));
    }
    public static int power(int x, int n){
        if(n==0)
            return 1;
        int pwx2=power(x,n/2);
        int res=pwx2*pwx2;
        if(n%2==1){
            res=res*x;
        }
        return res;
    }
}
