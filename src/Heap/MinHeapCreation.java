package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinHeapCreation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            minHeapInsertion(al,x);
        }
        System.out.println(al);
       // int x=sc.nextInt();
        //minHeapInsertion(al,x);
     //   System.out.println(al);
        // deletion all node of heap then we get asending order sorted
        while (al.size()>0){
          int element=  minHeapDeletion(al);// delete all root node
            System.out.print(element+" ");
        }
    }
//10
//10 1 2 3 20 6 7 8 9 11

    private static void minHeapInsertion(ArrayList<Integer> al, int x) {
        al.add(x);
        int sz= al.size()-1;
        while (sz>0){
            if(al.get(sz)<al.get(sz/2)){
                Collections.swap(al,sz,sz/2);
                sz=sz/2;
            }
            else
                return;
        }
    }
    private static int minHeapDeletion(ArrayList<Integer> al) {
        if(al.size()==0)
            return -1;
        int res=al.get(0);
        int sz=al.size()-1;
        Collections.swap(al,0,sz);
        al.remove(sz);
        int i=0;
        while (i<al.size()){
          //  System.out.println(i*2+2+" index");
            if(i*2+2<al.size() && al.get(i*2+1)>al.get(i*2+2)){
                Collections.swap(al,i,i*2+2);
                i=i*2+2;
            }
            else if(i*2+1<al.size() &&  al.get(i)>al.get(i*2+1) ) {
                Collections.swap(al, i, i * 2 + 1);
                i = i * 2 + 1;
            }
            else
            {
                i=Integer.MAX_VALUE;
            }
        }
        return res;
    }

}
