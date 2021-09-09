package Interview_Mosaic;

import java.util.Stack;

public class Valid {
    public static void main(String[] args) {
      //  String s="{(((()}]}";
     //   String s="(){}";
        String s="}{";

        boolean res= validParantheses(s);
        System.out.println(res);

    }

    private static boolean validParantheses(String s) {
        Stack<Character> st=new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch=s.charAt(i);

                st.push(ch);
            char peek=st.peek();
            if(ch==')' && peek=='('){
                st.pop();
            }


        }
        if(st.isEmpty())
            return true;
        else
           return false;
    }
}
