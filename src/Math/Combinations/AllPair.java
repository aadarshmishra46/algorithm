package Math.Combinations;

import java.util.HashMap;
import java.util.Scanner;

public class AllPair {
    static int getPairsCount(int n)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Store counts of all elements in map hm
        for (int i = 0; i < n; i++) {

           int x=i+1;
            if (!hm.containsKey(x))
                hm.put(x, 0);

            hm.put(x, hm.get(x) + 1);
        }
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < n; i++) {
            int x=i+1;
            if (hm.get(n - x) != null)
                twice_count += hm.get(n - x);

            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (n - x == x)
                twice_count--;
        }

        // return the half of twice_count
        return twice_count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println(getPairsCount(n));
        
    }
}
