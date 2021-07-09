package NumberTheoryPartNCodeN;

import java.util.Scanner;

public class PowerUsingBinaryExponetiation {
    public  static  long power(int base,int power){
       long res=1;
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
        int base=sc.nextInt();
        int power=sc.nextInt();
        System.out.println(power(base,power));
    }
}
