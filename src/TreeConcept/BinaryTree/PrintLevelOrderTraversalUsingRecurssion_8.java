package TreeConcept.BinaryTree;
/*
                   2
              7         5
          2      6           9
               5    11     4
        level order printing 2
                             7 5
                             2 6 9
                             5 11 4
 */
public class PrintLevelOrderTraversalUsingRecurssion_8{
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.left=this.right=null;
            this.data=data;
        }
    }
    private static void PrintLevelOrderTraversalUsingRecurssion(Node node) {
        if(node==null)
            return;
        int height=getHightOfTree(node);
       for(int i=1;i<=height;i++){
           printElementAtGivenLevel(node,i);// here i is level
           System.out.println();
       }
    }

    private static void printElementAtGivenLevel(Node node, int level) {
        if(node==null)
            return;
        if(level==1)
            System.out.print(node.data+" ");
        printElementAtGivenLevel(node.left,level-1);
        printElementAtGivenLevel(node.right,level-1);
    }

    private static int getHightOfTree(Node node) {
        if(node==null)
            return 0;
        return Math.max( getHightOfTree(node.left),getHightOfTree(node.right))+1;
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
        PrintLevelOrderTraversalUsingRecurssion(root);
    }


}
