package TreeConcept.BinaryTree;

public class PrintRightViewOfBT_12 {
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.left=this.right=null;
            this.data=data;
        }
    }
    static int maxLevel;
    private static void printRightViewOfBST(Node node,int level){
      if(node==null)
          return;
      if(level>=maxLevel){
          System.out.print(node.data+" ");
          maxLevel++;
      }
      printRightViewOfBST(node.right,level+1);
      printRightViewOfBST(node.left,level+1);
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
        printRightViewOfBST(root,0);// level
    }

}
