package Math;
/*
import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;

public class GoodTeamLeader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

    }
/*
public static int gcd(int first ,int second)
    {
        if(first%second==0)
        {
            return second;
        }
        return gcd(second,first%second);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        int res=-1;
        for (int i = 0; i < n; i++)
        {
            int count=0;
            for (int j = i+1; j <n; j++) {
               int gc=gcd(arr[i],arr[j]);
               if(gc!=1)
               {
                   count++;
                   if(count>res)
                   {
                    //   System.out.println(i+" "+j);
                       res=count;
                   }
               }

            }
        }
        System.out.println(res+1);

    }
 */