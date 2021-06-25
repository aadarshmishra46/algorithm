package com.company.Array;

import java.util.Scanner;

public class CountAllFactor{
    public static void countAllFactor(long n)
    {
        long count=1;
        boolean isPrime=true;
        long perfectIndex=0;//for check perfect square of any number
        for (int i = 2; i*i<=n; i++) {
            if(n%i==0)
            {
                count++;

            }

        }
        if(isPrime)
        {
            System.out.println(2);
        }
        else if(perfectIndex*perfectIndex==n)
        {
            System.out.println(count*2+1);
        }
        else
        {
            System.out.println(count*2+2);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextLong();
        countAllFactor(n);
    }
}
