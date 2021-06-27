package Math.BitManipulation;

import java.util.Scanner;

public class RightmostDifferentBit {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int k = 0; k <t; k++) {
            String s1 = Integer.toBinaryString(sc.nextInt());
            String s2 = Integer.toBinaryString(sc.nextInt());
            int n1=s1.length();
            int n2=s2.length();
            int difference=0;
            if(n1>n2)
            {
                difference=n1-n2;
                for (int i = 0; i < difference; i++) {
                    s2 ="0"+s2;

                }
            }

            else
            {
                difference=n2-n1;
                for (int i = 0; i < difference; i++) {
                    s1 ="0"+s1;

                }
            }
            n1=s1.length();
            n2=s2.length();
            System.out.println(s1);
            System.out.println(s2);
            if (s1.equals(s2)) {
                System.out.println(-1);
            }
            else
            {
                for(int i=n1-1;i>=0;i--)
                {
                    if(s1.charAt(i)!=s2.charAt(i))
                    {
                        System.out.println(n1-i);
                        break;
                    }
                }
            }

        }

    }

}
