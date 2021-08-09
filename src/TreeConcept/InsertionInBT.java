package TreeConcept;

import java.util.LinkedList;
import java.util.Queue;

public class InsertionInBT {
    static class Node{
        int key;
        Node left,right;
        Node(int key){
            this.key=key;
            left=null;
            right=null;
        }
    }
    static Node root;
    static Node temp=root;
    //inorder travesal of a binary tree;
    static void inorder(Node temp){
        if(temp==null){
            return;
        }
        inorder(temp.left);
        System.out.print(temp.key+" ");
        inorder(temp.right);
    }
    //function to insert element in bt
    static void insert(Node temp,int key)
    {
        if(temp==null){
            root=new Node(key);
            return;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(temp);
        System.out.println(temp.key);
        while (!q.isEmpty()){
            temp=q.peek();
            q.remove();
            if(temp.left==null){
                temp.left=new Node(key);
                break;
            }
            else
                q.add(temp.left);
            if(temp.right==null){
                temp.right=new Node(key);
                break;
            }
            else
            q.add(temp.right);
        }
    }

    public static void main(String[] args) {
        root=new Node(10);
        root.left=new Node(11);
        root.left.left=new Node(7);
        root.right=new Node(9);
        root.right.left=new Node(15);
        root.right.right=new Node(8);
        inorder(root);
        System.out.println();
        insert(root,12);
        System.out.println();
        inorder(root);
    }
}
