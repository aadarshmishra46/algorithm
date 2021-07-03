package Math.BitManipulation;

import java.util.Scanner;
//link https://www.interviewbit.com/problems/reverse-bits/
public class ReverseBits {
    public static long reverse(long a) {
        String s="";
        for(int i=0;i<32;i++)
        {
            long n=a&(1<<i);
            if(n>=1){
                s=s+1;
            }
            else
            {
                s=s+0;
            }
        }
       // System.out.println(s+" "+s.length());
       a = Long.parseLong(s, 2);
        return a;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println( reverse(sc.nextLong()));
    }
}
