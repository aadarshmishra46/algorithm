package InterviewPrerationNS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CompletelyDifferent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int res = numberOfAllUniqueSubstring(s);
        System.out.println(res);
    }

    private static int numberOfAllUniqueSubstring(String s) {
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                char[] temp=s.substring(i,j).toCharArray();
                Arrays.sort(temp);
                String s1=new String(temp);
                hs.add(s1);
            }

        }
        return hs.size();
    }
}
