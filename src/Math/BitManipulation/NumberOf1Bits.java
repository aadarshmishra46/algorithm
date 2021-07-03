package Math.BitManipulation;

import java.util.Scanner;

public class NumberOf1Bits {
    public static int numSetBits(long n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(numSetBits(sc.nextLong()));
    }
}
