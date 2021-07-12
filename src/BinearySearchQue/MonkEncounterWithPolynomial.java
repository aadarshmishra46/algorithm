package BinearySearchQue;

import javax.print.attribute.standard.PresentationDirection;
import java.sql.PreparedStatement;
import java.util.Scanner;

//link  https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/monks-encounter-with-polynomial/
public class MonkEncounterWithPolynomial {
    public static long F(int A,int B,int C,long x) {
        long result=A*x*x+B*x+C;
      //  System.out.println(result);
        return result;
    }
    public static long minPolynominalX0(int A,int B,int C,long K){
        long l=1;
        long h=(int)Math.ceil(Math.sqrt(K));
        while (l<=h){
            long mid=l+(h-l)/2;//
            long x=F(A,B,C,mid);
            long y=F(A,B,C,mid-1);
            if(x>=K && y<K )
                return mid;
            if(x<K)
                l=mid+1;
            else
                h=mid-1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int C=sc.nextInt();
            long K= sc.nextLong();
            System.out.println(minPolynominalX0(A,B,C,K));
        }
    }

}
