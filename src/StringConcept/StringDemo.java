package StringConcept;

public class StringDemo {
    public static void main(String[] args) {


        //String -immutable class
        //->constructor
//    String s1="SABA";//string literal
//    String s2=new String("SABA");// string by creating new opertor
        // case 1:
        //immuatability
//        String s = new String("SABA");
//       System.out.println(s.hashCode());
//        System.out.println(s);//SABA
//        s=s+"Aadarsh";
//        System.out.println(s.hashCode());
//        System.out.println(s);//SABAAadarsh
       // StringBuffer sb="ABC";//not possible

//        StringBuffer sb=new StringBuffer("SABA");
//        System.out.println(sb.hashCode());
//        System.out.println(sb);//SABA
//        sb.append("Aadarsh");//concatenation
//        System.out.println(sb.hashCode());
//        System.out.println(sb);//SABAAadarsh
/////////////////////////////case 2.
     // String s1 = new String("SABA");
//        String s2 = new String("SABA");
//        System.out.println(s1==s2);//NO
//        System.out.println(s1.equals(s2));//YES

        StringBuffer s1 = new StringBuffer("SABA");
//        System.out.println(s1.hashCode());
//        StringBuffer s2 = new StringBuffer("SABA");
//        System.out.println(s2.hashCode());
//        System.out.println(s1==s2);//NO
//        System.out.println(s1.equals(s2));//NO


    }

}
