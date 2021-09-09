package InterviewPrerationNS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Flames {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int length=flameTest(s1,s2);
        int res=length % 6;
        switch (res){
            case 0:
                System.out.println("Siblings");
                break;
            case 1:
                System.out.println("Friends");
                break;
            case 2:
                System.out.println("Love");
                break;
            case 3:
                System.out.println("Affection");
                break;
            case 4:
                System.out.println("Marriage");
                break;
            default:
                System.out.println("Enemy");

        }
    }

    private static int flameTest(String s1, String s2) {
        HashMap<Character,Integer> hs1=new HashMap<>();
        HashMap<Character,Integer> hs2=new HashMap<>();
        // for string s1
        for (int i = 0; i < s1.length(); i++) {
            if(hs1.containsKey(s1.charAt(i))){
                hs1.put(s1.charAt(i), hs1.get(s1.charAt(i))+1);
            }
            else
            {
                hs1.put(s1.charAt(i),1);
            }

        }
        for (int i = 0; i < s2.length(); i++) {
            if(hs1.containsKey(s2.charAt(i))){
                hs1.put(s2.charAt(i), hs1.get(s2.charAt(i))-1);
            }
        }
        // for string s2
        for (int i = 0; i < s2.length(); i++) {
            if(hs2.containsKey(s2.charAt(i))){
                hs2.put(s2.charAt(i), hs2.get(s2.charAt(i))+1);
            }
            else
            {
                hs2.put(s2.charAt(i),1);
            }

        }
        for (int i = 0; i < s1.length(); i++) {
            if(hs2.containsKey(s1.charAt(i))){
                hs2.put(s1.charAt(i), hs2.get(s1.charAt(i))-1);
            }
        }
        // for counting
        int count=0;
        for (Map.Entry<Character,Integer> ch:hs1.entrySet()){
            int ct = ch.getValue();
            if(ct > 0)
            count += ct;
        }

        for (Map.Entry<Character,Integer> ch:hs2.entrySet()){
            int ct = ch.getValue();
            if(ct > 0)
                count += ct;
        }
        return count;
    }
}
