package StackConcept.gfgStack;

import netscape.security.UserTarget;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueImpUsingStack {
    private int size;


    //operation push and pop and isEmpty and number of element in queue
    static class Que {
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();

        public void push(int x) {
            stack1.push(x);
        }

        public int pop() {
            if (stack1.isEmpty() && stack2.isEmpty()){
                throw new EmptyStackException();
            }
            if(stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.peek());
                    stack1.pop();
                }
            }
                int peekValue=stack2.peek();
                stack2.pop();
                return peekValue;

        }
        public boolean Isempty(){
            if(stack1.isEmpty() && stack2.isEmpty())
                return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Que q=new Que();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());

        System.out.println(q.Isempty());
        q.push(5);
        q.push(6);
        System.out.println(q.pop());
    }
}