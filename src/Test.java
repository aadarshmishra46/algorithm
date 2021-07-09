import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class Test {
    static final int ASCII_SIZE = 256;
    static int getMaxOccuringChar(String str)
    {

        int count[] = new int[ASCII_SIZE];

        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;

        int max = -1;
        char result = ' ';
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);

            }
        }
        int count1=0;
        for (int i = 0; i < len; i++) {
            if(str.charAt(i)==result)
            {
                count1++;
            }

        }

        return count1;
    }

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int rep=getMaxOccuringChar(s);
        if(rep>s.length()/2)
        {
            System.out.println((s.length()-(rep) )*2);
        }
        else
            System.out.println(s.length());



    }

}
