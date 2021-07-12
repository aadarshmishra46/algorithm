package Math;

import java.util.Scanner;

public class Fibnacci {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
//using iteration
// base condition

        int n=sc.nextInt();// user gives nth number for fibonacci;
        long res=fibonacci(n);
        System.out.println(res);
    }
    static long fibonacci(int n)
    {
        int a=0;
        int res=1;
        if(n<=1)
        {
            return n;
        }
        for(int i=0;i<n-1;i++)
        {
            int temp=a+res;
// swapping the number
            a=res;
            res=temp;
        }
        return res;
    }
}
