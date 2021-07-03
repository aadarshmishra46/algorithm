package Math.BitManipulation;

public class TripalRoatate {
    public static void main(String[] args) {
        int [] a={1,1,2,3,3,1,3,4,4,4};
        int[] ans=new int[32];

        for(int j=31;j>=0;j--) {


            int temp = 0;
            for (int i = 0; i < a.length; i++) {
                if ((a[i] & 1) == 1) temp++;
                a[i] = a[i] >> 1;
            }
            ans[j] = temp % 3;
        }
        int solve = 0;
        int p = 1;

        for(int i=31;i>=0;i--){
            solve += ans[i]*p;
            p = p<<1;
        }
        System.out.println(solve);

    }
}
