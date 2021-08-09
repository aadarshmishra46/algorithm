package StringConcept;

import java.util.Scanner;

public class PalindromString {
    public static void checkPalidrom(String s){
        String strArray[] = s.split(" ");
        String temp="";
        for (int i = strArray.length-1; i >=0 ; i--) {
            temp +=strArray[i]+" ";
        }
        s=s+" ";
        if(s.equals(temp)){
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();//A good day
        checkPalidrom(s);

    }
}
