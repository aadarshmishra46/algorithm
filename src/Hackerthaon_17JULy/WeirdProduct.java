package Hackerthaon_17JULy;

import java.math.BigInteger;
import java.util.Scanner;

public class WeirdProduct {
    public static void main(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        BigInteger a1= new BigInteger(a+"");
        BigInteger b1= new BigInteger(b+"");
        BigInteger c1= new BigInteger(c+"");
        BigInteger d1= new BigInteger(d+"");

        BigInteger  mult1 = a1.multiply(c1);
        BigInteger  mult2 = a1.multiply(d1);
        BigInteger  mult3 = b1.multiply(c1);
        BigInteger  mult4 = b1.multiply(d1);
        int compare1=mult1.compareTo(mult2);
        BigInteger x;
        BigInteger y;
        if(compare1==1 || compare1==0){
             x=mult1;
        }
        else
        {
             x=mult2;
        }
        int compare2=mult3.compareTo(mult4);
        if(compare2==1 || compare2==0){
             y=mult3;
        }
        else
        {
             y=mult4;
        }
        int res=x.compareTo(y);
        if(res==1 || res==0){
            System.out.println(x);
        }
        else
            System.out.println(y);
    }
}
