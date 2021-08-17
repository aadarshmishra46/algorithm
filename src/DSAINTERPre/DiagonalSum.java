package DSAINTERPre;

import java.awt.datatransfer.FlavorEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class DiagonalSum {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static HashMap<Integer, Integer> hm = new HashMap<>();

    public static void add(Node root, int level, int index) {
        if (root == null) {
            return;
        }
        if (hm.containsKey(level - index)) {
            hm.put(level - index, hm.get(level - index) + (root.data));
        } else {
            hm.put(level - index,root.data);
        }
        add(root.left,level+1,index-1);
        add(root.right,level+1,index+1);
    }
    public static Vector<Integer> dgSum(Node root){
        hm.clear();
        add(root,0,0);
        Vector<Integer> sum=new Vector<>();
        for(Map.Entry<Integer,Integer> it:hm.entrySet()){
            sum.add(it.getValue());
        }
        return sum;
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(4);
        root.right=new Node(5);
        Vector<Integer> vt=dgSum(root);
        for (int i = 0; i < vt.size(); i++) {
            System.out.println(vt.get(i));
        }
    }
}
