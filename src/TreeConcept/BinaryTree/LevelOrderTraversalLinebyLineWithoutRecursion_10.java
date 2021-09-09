package TreeConcept.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLinebyLineWithoutRecursion_10 {
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.left=this.right=null;
            this.data=data;
        }
    }
    private static void levelOrderTraversalLinebyLineWithoutRecursion(Node node) {
        if(node == null)
            return;
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        while (true){
            int size=q.size();
            if(q.size()==0){
                break;
            }
            while (size>0){
                Node top=q.peek();
                System.out.print(top.data+" ");
                q.remove();
                if(top.left!=null)
                    q.add(top.left);
                if(top.right!=null)
                    q.add(top.right);
                size--;
            }
            System.out.println();
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
        levelOrderTraversalLinebyLineWithoutRecursion(root);
    }



}
