package StackConcept.gfgStack;

import java.security.PublicKey;
// STOPSHIP: 18-Jul-21 @aadarshmisrha
import java.util.EmptyStackException;

public class StackImplementationUsingLinkedList<E> {
    private Node<E> top;
    private int size;
     class Node<E>{
      private  E data;
       private Node<E> next;
        public Node(E data){
            this.data=data;
            next=null;
        }
    }
    public boolean isEmpty(){
        if(size==0)
            return true;
            return false;
    }
    public void push(E data){
        Node new_node=new Node(data);// data null
        if(size==0){
            top=new_node;
            size++;
            return;
        }
            new_node.next=top;
            top=new_node;
            size++;
    }
    public E pop(){
        if(size==0){
            throw new EmptyStackException();
        }
            Node temp=top;
            top=top.next;
            size--;
          return (E) temp.data;
    }
    public E peek(){
        if(size==0){
            throw new EmptyStackException();
        }
            return (E)top.data;
    }
    public boolean search(E data){
            if(size==0){
                return false;
            }
            Node temp=top;
            while (temp!=null){
                if(temp.data==data){
                    return true;
                }
                temp=temp.next;
            }
        return false;
    }
    public void print(){
        Node temp=top;
        if(size==0){
            throw new EmptyStackException();
        }
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {

        StackImplementationUsingLinkedList stack=new StackImplementationUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.search(50));
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.print();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push("Aadarsh Mishra");
        stack.push(20.30);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
