package QueueConcept.GFG;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarayNumberTillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        generatePrintBinary(n);
    }

    private static void generatePrintBinary(int n) {
        Queue<String> q=new LinkedList<String>();
        q.add("1");//1
        while (n-->0){
            String s1=q.peek();
            q.remove();
            System.out.print(s1+" ");
            String s2=s1;
            q.add(s1+"0");
            q.add(s2+"1");
        }
        System.out.println(q);
    }
}
