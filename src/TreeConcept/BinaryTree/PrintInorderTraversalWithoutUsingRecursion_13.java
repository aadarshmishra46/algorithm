package TreeConcept.BinaryTree;

import java.util.Stack;

/*
                   2
              7         5
          2      6           9
               5    11     4
         inorder= 2 7 5 6 11 2 5 4 9
 */
public class PrintInorderTraversalWithoutUsingRecursion_13 {
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.left=this.right=null;
            this.data=data;
        }
    }
    private static void printInorderTraversalWithoutUsingRecursion(Node node){
        if(node == null)
            return;
        Stack<Node> st=new Stack<>();
        while (node != null){
            st.push(node);
           // node=
        }
        while (st.size()>0){

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
        printInorderTraversalWithoutUsingRecursion(root);
    }

}
