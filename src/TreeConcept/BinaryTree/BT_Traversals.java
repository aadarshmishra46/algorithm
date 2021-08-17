package TreeConcept.BinaryTree;

public class BT_Traversals {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }
//    Traversals
    //pre-order Traveresal (root, left, right)
    public static void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    //In-order Traveresal (left,root, right)
    public static void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    //post-order Traveresal (left, right,root)
    public static void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);


        System.out.print("Pre-Order -");
        preOrder(root);
        System.out.println();
        System.out.print("In-Order -");
        inOrder(root);
        System.out.println();
        System.out.print("Post-Order -");
        postOrder(root);
    }

}
