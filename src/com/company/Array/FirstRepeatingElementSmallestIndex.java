/*
Given an array of integers, find the first repeating element in it. We need to find the element that occurs more than once and whose index of first occurrence is smallest.

Examples:

Input:  arr[] = {10, 5, 3, 4, 3, 5, 6}
Output: 5 [5 is the first element that repeats]
 */
package com.company.Array;

import java.util.Arrays;
import java.util.HashSet;

public class FirstRepeatingElementSmallestIndex {


       public  static  void usingNestedLoop(int[] arr)
        {
            boolean bool=false;
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i]==arr[j])
                    {
                        System.out.println(arr[i]);
                        bool=true;
                        break;
                    }
                }
                if(bool)
                    break;
            }
            if(!bool)
                System.out.println("No element is repeating here");
        }
        //2.Using one more array tc=O(n) and space also O(n)
        public  static  void usingExtraArray(int[] arr)
        {
            //first you have to find max value of an array
            int max = Arrays.stream(arr).max().getAsInt();
            int[] a=new int[max+1];
            for (int i = 0; i < a.length; i++) {
                a[i]=-1;
            }
            int minInd=Integer.MAX_VALUE;
            int k=0;
            for (int i = 0; i < arr.length; i++)
            {
                if(a[arr[i]]!=-1)
                {
                    if(minInd>a[arr[i]])
                        minInd=a[arr[i]];

                }
                else {
                    a[arr[i]] = i;
                }
            }
            System.out.println(arr[minInd]);


        }
        //3. using hashset time complexity O(n);
        public static void usingHashset(int[] arr)
        {
            HashSet hs=new HashSet();
            int min=-1;
            int minInd=Integer.MAX_VALUE;
            for (int i = arr.length-1 ;i >=0 ;i--) {//if you use forward loop then last repeat value
                if(hs.contains(arr[i]))
                {
                    min=i;
                    System.out.println(min);
                }
                else
                {
                    hs.add(arr[i]);
                }


            }
            System.out.println(arr[min]);
        }

        public static void main(String[] args) {
            int[] arr= { 10,5, 3, 4, 3, 5, 6,10};
            //1 using nested
            usingNestedLoop(arr);
            //2 using extra array
            usingExtraArray(arr);
            //3. using hashset
            usingHashset(arr);
        }
}


