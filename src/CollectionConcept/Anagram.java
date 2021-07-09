package CollectionConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        ArrayList<Character> al=new ArrayList<>();
        if(s1.length()==s2.length())
        {
            for(int i=0;i<s1.length();i++)
            {
                al.add(s1.charAt(i));//naman
            }
            for(int i=0;i<s2.length();i++)
            {
                if(al.contains(s2.charAt(i)))//naman
                    al.remove(al.indexOf(s2.charAt(i)));
            }
            if(al.isEmpty())
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
           else
            {
                System.out.println("NO");
            }
        }
}
