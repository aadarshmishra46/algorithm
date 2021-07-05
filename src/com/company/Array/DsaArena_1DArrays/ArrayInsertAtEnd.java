package com.company.Array.DsaArena_1DArrays;

import java.util.Scanner;

/*

Insertion is a basic but frequently used operation. Arrays in most languages cannnot be dynamically shrinked or expanded. Here, we will work with such arrays and try to insert an element at the end of array.

You are given an array arr. The size of the array is given by sizeOfArray. You need to insert an element at end and print the modified array.
Input
The first line of input contains T denoting the number of testcases.
T testcases follow. Each testcase contains two lines of input.
The first line contains size of the array denoted by sizeOfArray and element to be inserted.
The third line contains sizeOfArray elements separated by spaces.

Constraints:
1 <= T <= 20
2 <= sizeOfArray <= 10000
0 <= element, arri <= 10^6
Output
For each testcase, in a new line, print the modified array.
Example
Input:
2
5 90
1 2 3 4 5
3 50
1 2 3


Output:
1 2 3 4 5 90
1 2 3 50

Explanation:
Testcase 1: After inserting 90 at end, we have array elements as 1 2 3 4 5 90.
Testcase 2: After inserting 50 at end, we have array elements as 1 2 3 50.
 */
public class ArrayInsertAtEnd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int sizeOfArray=sc.nextInt();
            int insertElement= sc.nextInt();
            int[] arr=new int[sizeOfArray];
            for (int j = 0; j < sizeOfArray; j++) {
                arr[j]= sc.nextInt();

            }
            int[] newArr=new int[sizeOfArray+1];

            for (int j = 0; j < sizeOfArray; j++) {
                newArr[j]=arr[j];
                System.out.print(newArr[j]+" ");
            }
            newArr[sizeOfArray]=insertElement;
            System.out.println(newArr[sizeOfArray]+" ");



        }
    }

}
