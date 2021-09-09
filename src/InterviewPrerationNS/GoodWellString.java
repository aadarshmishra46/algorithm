package InterviewPrerationNS;

import java.util.Scanner;

public class GoodWellString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
        int count=0;
        if(s.length()%2==0) {
            for (int i = 0; i < s.length() / 2; i++) {
                int preIndex=i;
                int lastIndex=2*i+1;
                String s1=s.substring(0,preIndex+1);
                String s2=s.substring(preIndex+1,lastIndex+1);
                if(s1.equals(s2))
                    count++;


            }
            System.out.println(count);
        }
        else
        {
            for (int i = 0; i < (s.length()-1) / 2; i++) {
                int preIndex=i;
                int lastIndex=2*i+1;
                String s1=s.substring(0,preIndex+1);
                String s2=s.substring(preIndex+1,lastIndex+1);
                if(s1.equals(s2))
                    count++;


            }
            System.out.println(count);

        }
    }
}
