import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxHeapInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();// for inserting the element
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            insertionInHeap(al,x);// n
        }

        System.out.println(al);
    }

    private static void insertionInHeap(ArrayList<Integer> al, int x) {
        al.add(x);
        int size=al.size()-1;
        while (size>0){
            if(al.get(size)>al.get(size/2)){
                Collections.swap(al,size,size/2);
                size=size/2;
            }
            else
                break;
        }// logn
    }

}
// time compplixity
// if every element  rea