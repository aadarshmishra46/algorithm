package TreeConcept;

import java.util.Scanner;
import java.util.Stack;

public class MirrorOfBinaryTree {
    static class Node{
        int key;
        Node left,right;
    }
    static Node newNode(int key){
        Node n=new Node();
        n.left=null;
        n.right=null;
        return n;
    }
    static int findMirrorRec(int target,Node left,Node right){
        if(left==null || right==null)
            return 0;
        if(left.key==target){
            return right.key;
        }
        if(right.key==target){
            return left.key;
        }
        int mirror_val=findMirrorRec(target,left.left,right.right);
        {
            if(mirror_val!=0){
                return mirror_val;
            }
        }
        return findMirrorRec(target,left.right,right.left);
    }
    static int findMirror(Node root,int target) {
        if (root == null)
            return 0;
        if (root.key == target)
            return target;
        return findMirrorRec(target, root.left, root.right);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int q= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Node root=newNode(1);
        Node temp=root;
        Stack<Node> st=new Stack<Node>();
        for (int i = 0; i < arr.length; i++) {
        }


    }
}
