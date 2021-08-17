package DSAINTERPre;

import java.util.Scanner;

public class GoodNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long x=sc.nextLong();
        long diff=b-a;
        if(diff%x==0){
            diff=(diff/x)+1;
            System.out.println(diff);
        }
        else
        {
            System.out.println(diff/x);
        }
    }
}
