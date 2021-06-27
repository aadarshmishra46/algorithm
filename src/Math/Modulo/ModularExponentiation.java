/*

Given a number N and a number P, your task is to calculate NP. Since the ans can be very long calculate your ans as NP%M where M = 109+7
Input
Input contains only two integers N and P separated by spaces.

Constraints:-
1 < = N, P <= 1000000000
Output
Print NP%M.
Example
Sample Input:-
2 5

Sample Output:-
32

Sample Input:-
2 100

Sample Output:-
976371285

500000000 400000000
63612387
 */

package Math.Modulo;

import java.util.Scanner;

public class ModularExponentiation {

    public static long powerMod(long n, long p, int mod) {
        long res=1;
        while (p>0)
        {
            if ((p & 1) == 1) {//check if run if p is odd
                res =(res*(n%mod))%mod;// both are same because res never big as compare mode
            }

            n = (n%mod )*(n%mod)%mod;
            p=p>>1;//half of p
        }

        return res;
    }

    public static void main(String[] args) {
        int mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        System.out.println(powerMod(n, p, 1000000007));
    }
}
