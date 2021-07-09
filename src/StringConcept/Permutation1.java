package StringConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Permutation1 {
    static ArrayList<String> al=new ArrayList<>();
    public static void permutation(String s,int l, int r){
        if(l==r)
            al.add(s);
        else{
            for (int i = l; i <=r ; i++) {
                s=swap(s,l,i);
                permutation(s,l+1,r);
                s=swap(s,l,i);
            }
        }
    }
    public static String swap(String a,int i,int j){
        char temp;
        char[] ch=a.toCharArray();
        temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        permutation(s,0,s.length()-1);
        Collections.sort(al);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i)+" ");
        }
    }
}
