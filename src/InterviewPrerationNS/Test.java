package InterviewPrerationNS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < a; i++) {
            al.add(sc.nextInt());

        }
        for (int i = 0; i < b; i++) {
            al.add(sc.nextInt());

        }
        Collections.sort(al, Collections.reverseOrder());
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));

        }
    }
}
