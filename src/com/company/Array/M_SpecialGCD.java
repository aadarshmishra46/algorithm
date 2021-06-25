/*
standard input/output: 2s/128000 kB

Given two positive integers N and M. Your task is to print first M Special GCD numbers which are greater than N.
M Special GCD numbers : First M numbers which are greater than N and whose GCD with N is equal to the smallest prime factor of N.
Input
User Task:
Since this is a functional problem, you don’t have to worry about the input, you just have to complete the function printM_SpecialGCD(), where you will get N and M as a parameter.

Constraints:
2 <= N <= 10^6
1 <= M <= 10^5
Output
Print the required answers separated by space.
Example
Sample Input:-
10 2

Sample Output:-
12 14

Explanation:-least prime divisor of 10 is 2.
Numbers greater than 10 whose gcd with 10 is equal to 2 are :- 12 14 16 18 22 . . . .
First two numbers of this series are:- 12 and 14

Sample Input:-
9 3

Sample Output:-
12 15 21
 */
package com.company.Array;

import java.util.Scanner;

public class M_SpecialGCD {
    public static void mSpecialGCD(int N, int M, int smallestPrimeFactor)
    {
        int ans = smallestPrimeFactor;
        //System.out.println(ans);
        int count=0;
        int num = N+ans;//12
        while(count < M){
            if(num%ans==0){
                if(gcd(N,num)==ans){
                    count++;
                    System.out.print(num+" ");
                }
            }
            num+=ans;
        }



    }
    public static int gcd(int n1,int n2){
        while(n1 != n2) {

            if(n1 > n2) {
                n1 -= n2;
            }

            else {
                n2 -= n1;
            }
        }
        return n1;
    }
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int smallestPrimeFactor=0;
        boolean isPrime=true;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                smallestPrimeFactor=i;
                isPrime=false;
                break;
            }

        }
        if (isPrime)
        {
            smallestPrimeFactor=n;
            for(int i=0;i<m;i++)
            System.out.print(smallestPrimeFactor*(i+2)+" ");
        }
        else {
            mSpecialGCD(n, m, smallestPrimeFactor);
        }
    }
}
/*
static void printM_SpecialGCD(int n, int m)
	{ //Enter your code here
int smallestPrimeFactor=0;
        boolean isPrime=true;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                smallestPrimeFactor=i;
                isPrime=false;
                break;
            }

        }
        if (isPrime)
        {
            smallestPrimeFactor=n;
             for(int i=0;i<m;i++)
            System.out.print(smallestPrimeFactor*(i+2)+" ");
        }
        else {
            mSpecialGCD(n, m, smallestPrimeFactor);
        }
    }
     public static void mSpecialGCD(int n, int m, int smallestPrimeFactor)
    {
        long temp=n;
        for (int i = 0; i < m; i++) {
             temp +=smallestPrimeFactor;
            if(temp%n!=0)
            {
                System.out.print(temp+" ");
            }
            else
            {
                m=m+1;
            }


        }
    }
 */