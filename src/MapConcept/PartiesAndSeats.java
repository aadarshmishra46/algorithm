package MapConcept;

import java.util.*;

/*
standard input/output: 2s/128000 kB

Given two arrays, one is array of political parties namely - party, and their corresponding array of seats received - seats. You have to print the political parties in lexicographical sorted order along with their seats, and highest seats received by the party.
Input
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains three lines of input. The first line contains number of parties N. The second line contains the names of the parties (single upper case letter of the english alphabet). The third line contains the votes corresponding to each party.

Constraints:
1 <= T<= 100
1 <= N <= 26
1 <= seats <= 100000
Output
For Each test case you have to print the political parties in lexicographical sorted order along with their seats, and highest seats received by the party.
Example
Input:
1
7
A B C D E F G
90 150 33 23 17 500 2
Output:
A 90
B 150
C 33
D 23
E 17
F 500
G 2
500

Explanation:
Testcase1:
We print parties and their respective seats in lexiographically sorted order. At the end we print the maximum seats.
 */
public class PartiesAndSeats {
    public static void printPartiesAndSeates(String[] parties,int[] seats,int n){
        TreeMap<String,Integer> tm=new TreeMap<>();
        int max=1;
        for (int i = 0; i < n; i++) {
            if(seats[i]>max)//1 2 3 4 5
            {
                max=seats[i];
            }
        }
        for (int i = 0; i < n; i++) {
            tm.put(parties[i],seats[i]);

        }
        for(Map.Entry e:tm.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String[] parties = new String[n];
            for (int j = 0; j < n; j++) {
                parties[j] = sc.next();
            }
            int[] seats=new int[n];
            for (int j = 0; j < n; j++) {
                seats[j]= sc.nextInt();
            }
            printPartiesAndSeates(parties,seats,n);
        }
    }
}
