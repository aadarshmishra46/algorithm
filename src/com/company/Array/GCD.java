package com.company.Array;

import java.util.Scanner;

public class GCD {
//1. Loop
    public static void usingLoop(long first,long second)
    {
        long temp=first%second;
        //temp=
        long rem=temp;
        while(rem>0)
        {
            rem=second%temp;
            if(rem==0)
            {
                System.out.println(temp);
                break;
            }
            second=temp;
            temp=rem;

        }


    }
    //2 using recursion
    public  static long usingRecursion(long first, long second)
    {
        if(first%second==0)
        {
            return second;
        }
        return usingRecursion(second,first%second);

    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);

        long a=sc.nextLong();
        long b=sc.nextLong();

        if(a==b || a %b==0)
        {
            System.out.println(b);
        }
        else
        {
            long first=0;
            long second=0;
            if(a>b)
            {
                first=a;
                second=b;
            }
            else
            {
                first=b;
                second=a;
            }
            usingLoop(first,second);
            System.out.println(usingRecursion(first,second));
        }


    }
}

