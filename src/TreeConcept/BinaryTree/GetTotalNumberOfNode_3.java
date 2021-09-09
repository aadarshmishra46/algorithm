package TreeConcept.BinaryTree;
/*
                   2
              7         5
          2      6           9
               5    11     4
               total number of node=9
 */
public class GetTotalNumberOfNode_3 {
        static class Node{
           Node left;
           Node right;
            int data;
            public Node(int data){
                this.left=this.right=null;
                this.data=data;
            }
        }
    private static int getTotalNumberOfNode(Node node) {
            if(node==null)
                return 0;
            return 1+getTotalNumberOfNode(node.left)+getTotalNumberOfNode(node.right);
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
        int res=getTotalNumberOfNode(root);
        System.out.println(res);
    }


}
