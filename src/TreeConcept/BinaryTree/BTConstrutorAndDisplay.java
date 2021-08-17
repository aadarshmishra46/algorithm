package TreeConcept.BinaryTree;

import java.util.Stack;

public class BTConstrutorAndDisplay {
//    class node
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    // pair class for state
    public static class Pair{
        Node node;
        int state;
//        if state is 1 in stack that means you have to push left child
//        if state 2 that means you have to push right child
//        if  state 3 that's means you have to pop from the stack
        public Pair(Node node,int state){
            this.node=node;
            this.state=state;
        }
    }
    public static void display(Node node){
        if(node==null){
            return;
        }
        String str="";
        str +=node.left==null? ".":node.left.data+"";
        str +="<-"+node.data+"->";
        str +=node.right==null? ".":node.right.data+"";
        System.out.println(str);
        display(node.left);
        display(node.right);
    }
    public static void main(String[] args) {
        Integer[] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Stack<Pair> st=new Stack<>();
        Node root=new Node(arr[0],null,null);
        Pair rtp=new Pair(root,1);
        st.push(rtp);
        int idx=0;
        while (st.size()>0){
            Pair top=st.peek();
            if(top.state==1) {
                idx++;
                if(arr[idx]!=null){
                    top.node.left=new Node(arr[idx],null,null);
                    Pair lp=new Pair(top.node.left,1);
                    st.push(lp);
                } else
                {
                    top.node.left=null;
                }
                top.state++;
            }else if(top.state==2){
                idx++;
                if(arr[idx]!=null){
                    top.node.right=new Node(arr[idx],null,null);
                    Pair rp=new Pair(top.node.right,1);
                    st.push(rp);
                } else
                {
                    top.node.right=null;
                }
                top.state++;
            }
            else
            {
                st.pop();
            }
        }
        display(root);
    }
}
