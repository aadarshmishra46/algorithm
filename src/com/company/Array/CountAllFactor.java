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

    public static class MinPlateform {
        public static int minPlateForm(int[] arr, int[] dep , int n){
            // base condition
            int min=1;
            int result=1;
            for (int i = 0; i < n; i++) {
                min=1;
                for (int j = i+1; j <n ; j++) {
                    if(arr[i]>=arr[j] && arr[i]<=dep[j]  || arr[j]>=arr[i] && arr[j]<=dep[i])//
                    {
                        min++;
                    }
                }// 1 , 2
               result=  Math.max(min,result);
            }

            return result;
        }
        public static void main(String[] args) {
            //taking input
            int arr[] = {900, 840, 950, 1100, 1500, 1800};
            int dep[] = {910, 945, 1005, 1130, 1805, 2000};
            int n=arr.length;
           int min=minPlateForm(arr, dep,n);
            System.out.println(min);
        }
    }
}
