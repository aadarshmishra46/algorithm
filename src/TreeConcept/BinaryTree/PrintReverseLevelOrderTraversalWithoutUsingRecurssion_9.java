package TreeConcept.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/*
                   2
              7         5
          2      6           9
               5    11     4
        level order printing 2 7 5 2 6 9 5 11 4

 */
public class PrintReverseLevelOrderTraversalWithoutUsingRecurssion_9 {
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.left=this.right=null;
            this.data=data;
        }
    }
    private static void printReverseLevelOrderTraversalWithoutUsingRecurssion(Node node) {
        if(node == null)
            return;
        Queue<Node> q=new LinkedList<>();
        Stack<Node> st=new Stack<>();
        q.add(node);// root added in queue
        while (q.size()>0){
            Node top=q.remove();
            if(top.right!=null)
                q.add(top.right);
            if(top.left!=null)
                q.add(top.left);

            st.add(top);
        }
        while (st.size()>0){
            System.out.print(st.pop().data+" ");
        }
    }

    public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(7);
        root.right=new Node(5);
        root.left.left=new Node(2);
        root.left.right=new Node(6);
        root.left.right.left=new Node(5);
        root.left.right.right=new Node(11);
        root.right.right=new Node(9);
        root.right.right.left=new Node(4);
        printReverseLevelOrderTraversalWithoutUsingRecurssion(root);
    }


}
