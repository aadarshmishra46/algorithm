package TreeConcept.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
/*
                   2
              7         5
          2      6           9
               5    11     4
        level order printing 2 7 5 2 6 9 5 11 4

 */
public class PrintLevelOrderTraversalWithoutUsingRecurssion_7 {
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.left=this.right=null;
            this.data=data;
        }
    }

    private static void printLevelOrderTraversalWithoutUsingRecurssion_7(Node node) {
        if(node==null)
            return;
        Queue<Node> q=new LinkedList<>();
        q.add(node);// root node add
        while (q.size()>0){
            Node top=q.remove();
            System.out.print(top.data+" ");
            if(top.left!=null)
                q.add(top.left);
            if(top.right!=null)
                q.add(top.right);
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
        printLevelOrderTraversalWithoutUsingRecurssion_7(root);

    }

}
// TM=O(n) and space =O(N)