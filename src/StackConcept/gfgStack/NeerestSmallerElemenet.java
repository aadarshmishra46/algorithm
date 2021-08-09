package StackConcept.gfgStack;

import java.util.Scanner;
import java.util.Stack;

public class NeerestSmallerElemenet {
    private static void neerestSmallest(int[] arr, int n) {
        Stack<Integer> st=new Stack<>();//[]
        for (int i = 0; i < n; i++) {
            while (!st.empty() && st.peek()>=arr[i]){//1 3
                st.pop();
            }
            if(st.empty())
                System.out.print("-1 ");
            else
                System.out.print(st.peek()+" ");
            st.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        neerestSmallest(arr ,n);
    }


}
