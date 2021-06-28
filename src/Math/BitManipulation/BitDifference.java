package Math.BitManipulation;

import java.util.Scanner;

public class BitDifference {
    //approch 1

  /*  public static int bitDiffernce(int[] arr,int n)
    {
        int total=0;
        int mod=(int)1.e9+7;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {

                int A=arr[i];
                int B=arr[j];
                int XOR = A ^ B;
                // Check for 1's in the binary form using
                // Brian Kerninghan's Algorithm
                int count = 0;
                while (XOR > 0) {
                    XOR = XOR & (XOR - 1);
                    count=(count%mod+1%mod)%mod;
                }
                total =(total%mod+(count%mod*2%mod)%mod%mod)%mod;

            }

        }

        return total;
    }


   */
    //approch 2
  public static int bitDiffernce(int[] arr,int n) {
      int ans = 0;
      int mod=(int)1e9+7;

      for (int i = 0; i < 32; i++) {


          int count = 0;

          for (int j = 0; j < n; j++)
              if ((arr[j] & (1 << i)) == 0)
                  count=(count%mod+1%mod)%mod;


          ans =(ans%mod+ ((count %mod * (n - count)%mod)%mod%mod * 2%mod)%mod%mod)%mod;
      }

      return ans;
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();


        }
        System.out.println(bitDiffernce(arr,n));
    }
}
