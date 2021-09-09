import javax.management.ObjectName;
import java.lang.annotation.Native;
import java.lang.management.GarbageCollectorMXBean;
import java.util.Arrays;

public class Adp {
    public static void main(String[] args) {
        // 1 2 5 -7 2 3
        // n=4
        // 5 3 2 2 1 -7
        // india is my country
        //
        // i want to United state of america

        // i tawn ot detinU etats
        // StringBuffer vs StringBuilder
        // Thread--->    <--Thread //
        String s="i want to United state of america";
        System.out.println(s);
        String res= reverseWord(s);
        System.out.println(res);
        int [] arr={1 ,2 ,5, -7, 2 ,3};
        int n=-2;
        int nth_Max=nthMax(arr,n);


    }

    private static String reverseWord(String s) {
        String[] arr=s.split(" ");
        String res="";
        for (int i = 0; i < arr.length; i++) {// O(n)
            String word=arr[i];
            String rev="";

            for (int j = 0; j < word.length(); j++) {//O(length(i))
                rev =rev+word.charAt(word.length()-j-1);//

            }

            res =res+" "+rev;

        }
        return  res;

    }

    public static int nthMax(int[] arr, int n){
        Arrays.sort(arr);//O( nlongn) +n =O(nlogn);
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            count++;
            if(n==count){
                return arr[i];
            }
        }
        // object

        return -1;
    }

// o(n)*O(length(i))=O(n2)
}
//tc= nlogn
