package InterviewPrerationNS;

import java.util.Arrays;
import java.util.Scanner;

public class LuckyBoy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] desiredHeigt=new int[n];
        int[] acutalHieght=new int[m];
        for (int i = 0; i < n; i++) {
            desiredHeigt[i]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            acutalHieght[i]=sc.nextInt();
        }
        countNumberofBoy(desiredHeigt,acutalHieght,n,m,k);
    }

    private static void countNumberofBoy(int[] desiredHeigt, int[] acutalHieght, int n, int m, int k) {
        Arrays.sort(desiredHeigt);
        Arrays.sort(acutalHieght);
        for (int i = 0; i < n; i++) {
            System.out.print(desiredHeigt[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print(acutalHieght[i]+" ");
        }
        System.out.println();
        int count=0;
        int ind=0;

        for (int i = 0; i < n; i++) {//20 21 31 35 39 41 49 74 86 90
                                      //4 7 14 24 24 60 82 82 85 95

            for (int j = ind; j < m; j++) {
               int diff=Math.abs(desiredHeigt[i]-acutalHieght[j]);

               if(diff<=k){
                   count++;
                   acutalHieght[j]=Integer.MIN_VALUE;
                   ind=j+1;
                   break;
               }
               else if(((acutalHieght[j]-desiredHeigt[i])>k) ){
                   break;
               }
            }

        }
        System.out.println(count);

    }

}
