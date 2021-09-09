package TreeConcept.BinaryTree;
/*
                   2
              7         5
          2      6           9
               5    11     4
         if level=4
         then answer 5 11 4
 */
public class PrintElementAtGivenLevel_6 {
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.left=this.right=null;
            this.data=data;
        }
    }
    private static void printElementAtGivenLevel(Node node,int level) {
        if(node==null)
            return;
        if(level==1){
            System.out.print(node.data+" ");

        }
        printElementAtGivenLevel(node.left,level-1);
        printElementAtGivenLevel(node.right,level-1);
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
        printElementAtGivenLevel(root,4);// here level is  4 it print only 5 11 4

    }


}
