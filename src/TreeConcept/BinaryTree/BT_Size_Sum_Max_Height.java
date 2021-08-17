package TreeConcept.BinaryTree;

public class BT_Size_Sum_Max_Height {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
        // Binary Tree size method
        public static int size(Node node){
            if(node==null){
                return 0;
            }
           int ls= size(node.left);
            int rs =size(node.right);
            int ts=ls+rs+1;
            return ts;
        }
        public static int sum(Node node){
            if(node==null){
                return 0;
            }
           int lsm=sum(node.left);
           int rsm=sum(node.right);
           int tsm=lsm+rsm+ node.data;
           return tsm;
        }
        public static int max(Node node){
            if(node==null){
                return 0;
            }
            int lmax=max(node.left);
            int rmax=max(node.right);
           int max=Math.max(node.data, Math.max(lmax,rmax));
           return max;

        }
        public static int height(Node node){
            if(node==null){
                return 0;// for nodes 0 and for edges -1
            }
            int lh=height(node.left);
            int rh=height(node.right);
            int height=Math.max(lh,rh)+1;
            return height;
        }
        //main method
        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.right.left = new Node(5);
            root.right.right = new Node(6);
            root.right.left.left = new Node(7);
            root.right.left.right = new Node(8);
            root.right.left.right.right = new Node(9);
            int size=size(root);
            System.out.println(size);
            int sum=sum(root);
            System.out.println(sum);
            int max=max(root);
            System.out.println(max);
            int height=height(root);
            System.out.println(height);

        }
    }
}
