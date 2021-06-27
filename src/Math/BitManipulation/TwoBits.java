package Math.BitManipulation;


import java.util.Arrays;
import java.util.Scanner;

public class TwoBits {
    public static void twoBits(long x) {
        long copy=x;
        String s1 = "";//for binary x
        while (x > 0) {
            s1 = x % 2 + s1;
            x = x / 2;
        }
        int count=0;
        for (int i = 0; i <s1.length() ; i++) {
            if(s1.charAt(i)=='1')
            {
                count++;

            }
        }
        if(count==2)
        {
            System.out.println(0);
        }
        else if(count>2)
        {

            char[] arr1=new char[s1.length()+1];
            arr1[0]='1';
            arr1[arr1.length-1]='1';
            for (int i = 1; i <arr1.length-1 ; i++) {

                    arr1[i]='0';

            }

            String s3=new String(arr1);
            long number = Long.parseLong(s3, 2);

            char[] arr=s1.toCharArray();
            for (int i = arr.length-1 ;i >0 ; i--){
                if(arr[i]=='1' && count>2)
                {
                    count--;
                    arr[i]='0';
                }

                if(count==2)
                {
                    break;
                }
            }
            String s2= new String(arr);
            long number1 = Long.parseLong(s2, 2);
            long diff1=Math.abs(number-copy);
            long dif2=Math.abs(number1-copy);
            if(diff1<dif2)
            {
                System.out.println(diff1);
            }
            else
            {
                System.out.println(dif2);
            }

        }
        else
        {
            if(copy==1){
                System.out.println(2);
            }
            else{
                char[] arr=s1.toCharArray();
                arr[arr.length-1]='1';
                String s2= new String(arr);
                long number = Long.parseLong(s2, 2);
                System.out.println(Math.abs(copy-number));
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        twoBits(x);
    }
}
