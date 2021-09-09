package InterviewPrerationNS;

import java.util.Arrays;
import java.util.Scanner;

public class MeInMiddle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
       int middleIndex=middleNumber(arr,n);
        System.out.println(arr[middleIndex]);
    }

    private static int middleNumber(int[] arr, int n) {
        Arrays.sort(arr);
        return (int)Math.floor(n/2);
    }

}
