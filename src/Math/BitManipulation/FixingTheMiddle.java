package Math.BitManipulation;

import com.sun.org.glassfish.gmbal.ManagedAttribute;

import java.util.Scanner;

public class FixingTheMiddle {
    public static int fixingTheMiddleBit(int n)
    {

        int size = (int)(Math.log(n) / Math.log(2))+1;
      //  System.out.println(size);
    //if else for even odd
        if((size&1)==1)//odd
        {
            int middle=(int)Math.ceil(size/2);

            n=n^(1<<middle);
            System.out.println(n);
        }
        else
        {
            int middle=(int)Math.ceil(size/2);
            n=n^(1<<(middle-1));
            n=n^(1<<(middle));
            System.out.println(n);

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            fixingTheMiddleBit(n);

        }
    }
}
