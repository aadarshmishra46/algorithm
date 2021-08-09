package StackConcept.gfgStack;

public class StackImplementationUsingArray {
    static final int max=1000;
    int top;
    int[] a=new int[max];//max size of stack
    boolean isEmpty(){
        return (top<0);
    }
    StackImplementationUsingArray(){
        top=-1;
    }
    boolean push(int x) {
        if (top >= (max - 1)) {
            System.out.println("Stack overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
        int pop(){
            if(top<0){
                System.out.println("Stack Underflow");
                return 0;
            }
            else{
                int x=a[top--];

                return x;
            }
        }
    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }

    public static void main(String[] args) {
        StackImplementationUsingArray s=new StackImplementationUsingArray();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop()+" Popped from Stack");
        System.out.println(s.peek());
    }

}
