package Heap;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class KNonRepeatingCharInString {
    public static void main(String[] args) {
        String s="ABCBACCDAGCAAF";
        LinkedHashSet<Character> hs=new LinkedHashSet<>();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(hs.add(s.charAt(i))){
                count++;
            }
            else{
                hs.remove(s.charAt(i));
            }

        }
        System.out.println(hs);
    }
}
