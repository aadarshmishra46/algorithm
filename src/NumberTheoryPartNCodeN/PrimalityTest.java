package NumberTheoryPartNCodeN;

import java.util.Scanner;

//link https://www.codechef.com/problems/PRB01
public class PrimalityTest {
    public  static boolean primalityTest(int n){
        if(n==1)
            return false;
        for (int i = 2; i*i <=n ; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            System.out.println(primalityTest(n));

        }

    }
}
