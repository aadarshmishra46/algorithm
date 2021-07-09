package StringConcept;

import java.util.Scanner;

public class ConsecutiveSequencedNumbersString {
    public  static long isConsecutiveNumber(String s){
        long start=0;
        int length=s.length();
        for (int i = 0; i < length/2; i++) {
            String newStr=s.substring(0,i+1);
            long num=Long.parseLong(newStr);
       //     System.out.println(num);
            start=num;
            while (newStr.length()<length)
            {
                num++;
                String s3=Long.toString(num);

                newStr=newStr+s3;
            }
            if(newStr.equals(s))
                return start;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        long res=isConsecutiveNumber(s);
        if(res==-1)
            System.out.println("No");
        else
            System.out.println("Yes "+res);
    }
}
