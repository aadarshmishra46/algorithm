package Heap;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class HeapCreation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();// for inserting an element thats why n+1
        for (int i = 0; i < n; i++) {
            int x= sc.nextInt();
            maxHeapInsertion(al,x);
        }
        System.out.println(al);
        System.out.print("Enter to Insert an value in heap ");
        System.out.println(al);
     //   System.out.println("Deletion of root node ");
        //deletionInHeap(al);
    }













    private static void maxHeapInsertion(ArrayList<Integer> al, int x) {
        al.add(x);
        int index=al.size()-1;// 2  1
        while (index>0) {
            if (al.get(index) < al.get((index - 1) / 2)) {
                Collections.swap(al, index, (index - 1) / 2);
                index = (index - 1) / 2;
            } else
                break;
        }
    }




//
//    private static void insertionInHeap(ArrayList al,int x) {// [5 1  ] 4
//        al.add(x);// [ 5 1  4]
//       int index= al.size()-1; //2
//       while (index>0){
//           if((int)al.get(index)>(int)al.get(index/2)){// agar parent chhota hai to swap honga max heap
//               Collections.swap(al,index,index/2);// [5 1]
//               index=index/2;// 1/2 =
//           }
//           else
//               break;
//       }
//
//
//    }
    private static void deletionInHeap(ArrayList<Integer> al) {
        if(al.size()==0)
            return;
        int size= al.size()-1;
        Collections.swap(al,0,size);
        al.remove(size);
        int i=0;
        while ((i*2+2)<al.size()){
            if(al.get(i*2+2)>al.get(i*2+1)) {
                Collections.swap(al,i*2+2 , i);
               i=i*2+2;
            }
            else {
                Collections.swap(al,i*2+1 , i);
                i=i*2+1;
            }
        }
        System.out.println(al);
    }

}
