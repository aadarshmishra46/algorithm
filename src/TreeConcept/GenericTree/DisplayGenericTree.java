package TreeConcept.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class DisplayGenericTree {
    private static class Node{
        int data;
        ArrayList<Node> children=new ArrayList<Node>();
    }

    public static void main(String[] args) {
        Node root=null;
        int[] arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,
                -1,120,-1,-1,90,-1,-1,40,100,-1,-1};
        Stack<Node> st=new Stack<Node>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==-1){
                st.pop();
            }else{
                Node t=new Node();
                t.data=arr[i];
                if(st.size()>0){
                    st.peek().children.add(t);
                }
                else
                {
                    root=t;
                }
                st.push(t);
            }
        }
     display(root);
    }

    private static void display(Node node) {
        String s=node.data+"->";
        for(Node child:node.children){
            s+=child.data+",";
        }
        s+=".";
        System.out.println(s);
        for(Node child:node.children){
            display(child);
        }
    }

}
