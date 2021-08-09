package StackConcept.gfgStack;

import java.util.Scanner;
import java.util.Stack;

public interface JerryAndBrackets {

    static boolean checkBracket(String s, int n) {
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        for (int i = 1; i < n; i++) {
           if(s.charAt(i)==')' && st.peek()=='(') {
               st.pop();
            }
           else if(s.charAt(i)=='}' && st.peek()=='{') {
               st.pop();
           }
           else if(s.charAt(i)==']' && st.peek()=='[') {
               st.pop();
           }
         else
             st.push(s.charAt(i));
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        boolean res=checkBracket(s,n);
        if(res==true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}
