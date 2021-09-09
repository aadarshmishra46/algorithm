package InterviewPrerationNS;

import java.util.HashSet;
import java.util.Scanner;

public class Fine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> hs=new HashSet<>();
        int count=0;
        for (int i = 0; i < n; i++) {
            if(hs.add(arr[i])==false){
                count++;
            }else{
                hs.add(arr[i]);
            }
        }
        System.out.println(count);
    }
}
/*
int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> hs=new HashSet<>();
        int count=0;
        for (int i = 0; i < n; i++) {
            if(hs.add(arr[i])==false){
                count++;
            }else{
                hs.add(arr[i]);
            }
        }
        System.out.println(count);
 */