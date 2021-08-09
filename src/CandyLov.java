import java.util.Scanner;

public class CandyLov {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long t=sc.nextInt();
        System.out.println(maxSweetness(a,b,t));
    }
    private static long maxSweetness(long a, long b, long t) {
        long low=1;
        long high=(long)1e9;
        long temp=0;
        boolean bool=false;
        while(low<high){
            long mid=low+(high-low)/2;
            long cost=a*mid+b*fun(mid);

           if(t>=cost){
               low=mid;//97
              temp=cost;
               bool=true;
           }
           else {
               high=mid-1;
           }
           if(bool==true && temp<cost){
               if(t>cost)
               return 0;
               else
                   return high;
           }
        }
      //  return low;
        return 0;
    }

    private static long fun(long mid) {
        String s=String.valueOf(mid);
        return s.length();

    }

}
