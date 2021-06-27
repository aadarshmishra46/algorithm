package Math.Modulo;

import java.util.Scanner;

public class MatrixPoweerModulo {
   /* public static long[][] powerMatrix(long[][] arr,long[][] arr1,long[] [] res,int n,long p,int mod)
    {
for(int x=0;x<p-1;x++)
{
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    res[i][j]=0;
                    for (int k = 0; k < n; k++) {
                        res[i][j] = ((res[i][j]%mod) +((arr[i][k]%mod * arr1[k][j]%mod)%mod)%mod)%mod;

                    }
                }
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                    arr[i][j]=res[i][j];

                    }

                }


        }
        return res;
    }

    */
   private static long[][] multiply(long[][] a, long[][] b,int n,int mod){

       long[][] result = new long[n][n];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               for(int k=0;k<n;k++){
                   result[i][j] += ((a[i][k]*b[k][j])%mod);
                   result[i][j] %=mod;
               }
           }
       }
       return result;
   }

    private static long[][] powerMatrix(long[][] arr,int n,int k,int mod){

        long[][] cur = new long[n][n];
        long[][] result = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j)
                    result[i][j]=1;
                else
                    result[i][j]=0;

            }

        }
        cur = arr;

        while(k!=0){
            if(k%2 ==1) result = multiply(result, cur, n, mod);
            cur = multiply(cur, cur, n, mod);
            k/=2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p= sc.nextInt();
        int mod= (int) (1e9+7);
        long[][] arr=new long[n][n];
        long[][] arr1=new long[n][n];

        long[][] res=new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextLong();
            }
        }

      long[][] result=  powerMatrix(arr,n,p,mod);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(result[i][j]+" ");

                }
                System.out.println();

        }
    }
}
