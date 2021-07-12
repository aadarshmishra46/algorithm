package WeekendContest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SameString {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="";
     ArrayList al=new ArrayList();

        int count=0;
        int countb=0;
        for(int i=0;i<s.length();i++)
        {
            s1=s.charAt(i)+"";
           // System.out.print(s1+" ");
            String s2="";
            for(int j=i;j<s.length();j++)
            {
                s2 =s2+s.charAt(j);
             //   System.out.print(s2+" ");
                al.add(s2);


            }
        }

    for(int i=0;i<al.size();i++){
        for (int j = i+1; j < al.size(); j++) {
            if(al.get(i).equals(al.get(j))){
                count++;
            }
        }
    }
        System.out.println(count);
    }
}
