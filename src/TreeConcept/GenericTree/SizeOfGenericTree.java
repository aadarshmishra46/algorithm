package TreeConcept.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class SizeOfGenericTree {
    public static  class Node{
        int data;
        ArrayList<Node> children=new ArrayList<>();
    }
    public static void main(String[] args){
        Node root=null;
        int[] arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,
                -1,120,-1,-1,90,-1,-1,40,100,-1,-1};
        Stack<Node> st=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==-1){
                st.pop();
            }
            else
            {
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
        int size=size(root);
        System.out.println("size = "+size);
    }

    private static int size(Node node) {
        int s=0;
        for (Node child:node.children){
            int cs=size(child);
            s=s+cs;
        }
        s=s+1;
        return s;
    }

    public static void display(Node node){
        String s=node.data+"->";
        for (Node child:node.children){
            s+=child.data+",";
        }
        System.out.println(s);
        for(Node child:node.children)
        display(child);
    }
}
