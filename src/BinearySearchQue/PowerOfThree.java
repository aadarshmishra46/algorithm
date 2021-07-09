package BinearySearchQue;

import java.util.Scanner;

public class PowerOfThree {
    public  static  long power1(int n){
        long res=1;
        int power=0;
        while (n>res){
            res=powerofThree(power);
            res=res+1;
            power++;
        }
       return  res;
    }
    public static long powerofThree(int power) {
        long res=1;
        int base=3;
        while (power>0)
        {
            //power is odd
            if((power&1)==1){
                res=res*base;
                power--;
            }
            else
            {
                power=power/2;
                base=base*base;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n= sc.nextInt();

            System.out.println(power1(n));
        }
    }
}
