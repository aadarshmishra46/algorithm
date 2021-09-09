package InterviewPrerationNS;

/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class Shadi_Com {
    public static void main(String args[] ) throws Exception {

        //Write code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long val=0;
            if(n==1 || n==2){
                System.out.println(1);
            }
            else if(n==3) {
                System.out.println(3);
            }
           if(n>3){
               if(n%2==0){
                   long half =(long) n/2;
                   val = half*n+ -1;
                   System.out.println(val);
               }
               else {
                   long half =(long) n/2;
                   val = half*n + half -1;
                   System.out.println(val);
               }
           }
        }
    }
}
