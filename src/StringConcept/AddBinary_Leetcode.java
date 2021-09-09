package StringConcept;

import java.util.Scanner;

public class AddBinary_Leetcode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String res = addBinary(a,b);
    }

    private static String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        String res ="";
        int carry=0;

        if(len1 >= len2){

            for (int i=0; i<len2 ; i++){
                char ch1 = a.charAt(len2-i-1);
            //    System.out.println(len2-i-1);
                char ch2 = b.charAt(len2-i-1);

                if(ch1=='0' && ch2=='0'){
                    if(carry == 0){
                        res = "0" + res;
                    }
                    else {
                        res = "1" + res;
                        carry =0;
                    }
                }
                else if((ch1=='1' && ch2=='0') || (ch1=='0' && ch2=='1')){
                    if(carry == 0){
                        res = "1" + res;
                    }
                    else{
                        res = "0" + res;
                        carry = 1;
                    }
                }
                else if(ch1=='1' && ch2=='1'){
                    if(carry == 0){
                        res = "0" + res;
                        carry = 1;
                    }
                    else
                    {
                        res = "1" + res;
                        carry = 1;
                    }
                }
            }
            if(len1 == len2){
                if(carry == 1){
                    res = "1" +res;
                }
                System.out.println(res);
            }
            else
            {
                String rem = a.substring(0,len1-len2);
                int l3=rem.length();
                if(carry==1) {
                    while (l3--> 0) {
                        char ch = rem.charAt(l3 - 1);
                        if (ch == '1') {
                            res = "0" + res;
                            carry =1;
                        }
                        else if(ch =='0'){
                            res ="1"+res;
                            res =rem.substring(0,l3)+res;
                            System.out.println(res);
                            break;
                        }
                    }
                }
                else{
                    res =rem +res;
                }
                System.out.println(res);
            }
        }
        else{

        }

return  null;
    }
}
