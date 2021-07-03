package Math.Combinations;

import java.util.Scanner;

public class NumberOfSubSequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        long count=0;
        int mod=(int)1e9+7;

        for (int i = 0; i < s.length(); i++) {
            boolean bool=true;
            for (int j = i; j < s.length(); j++) {
                if(s.charAt(j)=='a' && bool==true)
                {
                    count=(count%mod+1%mod)%mod;

                    bool=false;
                }
                else if(s.charAt(j)!='a')
                {
                    bool=true;
                }
            }

        }
        System.out.println(count);
    }
}
