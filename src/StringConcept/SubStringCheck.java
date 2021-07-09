package StringConcept;

import java.util.Scanner;

public class SubStringCheck {
    public static void stringCheck(String s1,String s2)
    {
            int l1=s1.length();
            int l2=s2.length();
            boolean b=false;
         if(l1<=l2)
         {
             for (int i = 0; i < l2-l1+1; i++) {
                 String s3="";
                 for (int j = i;   j <l1+i; j++) {
                     s3=s3+s2.charAt(j);
                 }
                 if(s3.equals(s1))
                 {
                     b=true;
                     break;
                 }

             }
         }
         else
         {
             for (int i = 0; i < l1-l2+1; i++) {
                 String s3="";
                 for (int j = i;   j <l2+i; j++) {
                     s3=s3+s1.charAt(j);
                 }
                 if(s3.equals(s2))
                 {
                     b=true;
                     break;
                 }

             }
         }
         if(b)
             System.out.println("Yes");
         else
             System.out.println("No");


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        stringCheck(s1,s2);
    }
}
