package Math.BitManipulation;

import java.util.Scanner;

public class BitRotation {
    /*
   public static void decimalToBinary(long x,long y)
    {
        String s1="";//for binary x
        String s2="";//for binary y
        while (x>0)
        {
            s1=x%2+s1;
            x=x/2;
        }
        while (y>0)
        {
            s2=y%2+s2;
            y=y/2;
        }
        int diff1=32-s1.length();
        for (int i = 0; i < diff1; i++) {
            s1 ="0"+s1;

        }

        int diff2=32-s2.length();
        for (int i = 0; i < diff2; i++) {
            s2 ="0"+s2;

        }
        System.out.println(bitManipulation(s1,s2));
    }


    public static String bitManipulation(String x, String y)
    {
        if(x.equals(y))
        {
            return "Yes";
        }
        else
        {
            //array rotation
            char[] arr1=x.toCharArray();
            char[] arr2=y.toCharArray();


            for (int k= 0; k < 31; k++) {
                char temp=arr1[arr1.length-1];
                boolean bool=true;
                for (int j = arr1.length-1; j >0 ; j--) {


                    arr1[j]=arr1[j-1];
                }
                arr1[0] = temp;
                for (int i = 0; i < arr1.length; i++) {
                    if (arr1[i] != arr2[i]) {
                        bool = false;
                        break;
                    }

                }
                if(bool)
                {
                    return "Yes";
                }

            }
            return "No";
        }
    }
*/
    public  static  boolean rotation(long x,long y)
    {

        long x64=(x<<32);

        while (x64>=y)
        {
            System.out.println(x64);
            if(x64==y)
            {
                return true;
            }
            x64>>=1;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x= sc.nextLong();
        long y=sc.nextLong();
         //decimalToBinary(x,y);
        if(rotation(x,y))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
