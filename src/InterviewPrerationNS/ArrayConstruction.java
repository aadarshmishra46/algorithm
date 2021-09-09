package InterviewPrerationNS;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class ArrayConstruction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] value=new int[n];
        int[] freq=new int[n];

        for (int i = 0; i < n; i++) {
            value[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            freq[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        kthSmallestAfterMerge(value,freq,n,k);
    }

    private static void kthSmallestAfterMerge(int[] value, int[] freq, int n, int k) {
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for (int i = 0; i < n; i++) {
            if(tm.containsKey(value[i])){
                int getRepeatedFreq =tm.get(value[i])+freq[i];
                tm.put(value[i],getRepeatedFreq);
            }
            else
            tm.put(value[i],freq[i]);
        }
        int range=0;
        for (Map.Entry<Integer,Integer> val:tm.entrySet()){
            int eleFre = val.getValue();
            range=eleFre+range;
           // System.out.println(range);
            if(range >= k){
                System.out.println(val.getKey());
                break;
            }
        }
    }


}
