package Math.BitManipulation;

import java.util.Scanner;

public class DivideIntegers {
    public static int divide(int a, int b) {
        long x=b;
        long y=b;
        long count=0;
        while (x<=a)

        {
            while (y!=0) {
                long carry = x & y;
                x = x ^ y;
                y = carry << 1;

            }
            y=b;

            count++;

        }
        return (int)count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(divide(a,b));
    }
}
