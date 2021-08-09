package StackConcept.gfgStack;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesesCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        CountParanthesesForBalance(s);
    }

    private static void CountParanthesesForBalance(String s) {
        Stack<Character> stack=new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==')'&& stack.size()>0 && stack.peek()=='(')
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        System.out.println(stack.size());
    }
}
