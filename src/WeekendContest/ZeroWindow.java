package WeekendContest;

import java.util.HashMap;
import java.util.Scanner;
//01010  010 101 010
public class ZeroWindow {
    static  void  zeroWindow(String s, int n, int k){
//        int c0=0;
//        int c1=0;
//
//        for (int i = 0; i < k; i++) {
//            if(s.charAt(i)=='0'){
//                c0++;
//            }
//            else
//                c1++;
//        }
//        if(c0>=c1){
//            count++;
//        }
        int count=0;
        HashMap<Character,Integer> hs=new HashMap<>();
        for (int i =4 ; i <n-k ; i++) {
            for (int j = 0; j < k+i; j++) {
                hs.put(s.charAt(i),i);
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=sc.nextLine();
        zeroWindow(s,n,k);
    }

}
