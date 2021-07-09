package StringConcept;

import java.util.*;

public class RemoveDuplicatesFromString {
    public static void removeDuplicate(String s)
    {
        LinkedHashSet<Character> lhs=new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            lhs.add(s.charAt(i));
        }

        Iterator<Character> itr=lhs.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s=sc.next();
            removeDuplicate(s);
        }
    }
}
