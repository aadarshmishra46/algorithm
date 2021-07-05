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

     //   StringBuffer s1 = new StringBuffer("SABA");
//        System.out.println(s1.hashCode());
//        StringBuffer s2 = new StringBuffer("SABA");
//        System.out.println(s2.hashCode());
//        System.out.println(s1==s2);//NO
//        System.out.println(s1.equals(s2));//NO
// case 3 memory level things string .......what is difference between  String s1="SABA"; and String s1=new String("SABA");
//          String s=new String("SABA");
//          //1. in this case two object will be created one in the heap Area and other is SCP(String constant pool) and
//        //2.  s  (refence varible) is alwayes point into heap part.
//        String s="SABA";
//        //1. in this cae only one object will be created in SCP and s is alwayes point into that object...

        //Point 1.Object creation in SCP is opational first ,it will check already object is present or not in SCP if Object is present
        // in scp then Existing object will reused... otherwise it will create that object in SCP..but this rule applicable for scp not heap
//point 2. Garbage collector is not allowed to access SCP area. even though object does not contain refernce varible it is not elligble for GC . if it is present in ScP
//        String s1=new String("SABA");
//        String s2=new String("SABA");
//        String s3="SABA";
//        String s4="SABA";
        //point 3. whenever we are using new operator compulsorry a new object will be created in heap area. hence there may be a chance
        //existing two object with same content in heap area . but not in scp area .. that is duplicate object are not allowed in scp but in heap
        // duplicate is allowed
//        String s1=new String("SABA");
//        s1.concat("Aadarsh");// othere s1=s1+"Aadarsh;
//        String s2=s1.concat("Anup");
//        s1=s1.concat("Friend");
//        System.out.println(s1);
//        System.out.println(s2);
//         String s1=new String("Spring");
//         s1.concat("Summer");
//         String s2=s1.concat("Winter");
//         s1=s1.concat("Fall");
//        System.out.println(s1);//SpringFall --saba  SpringFall--Anup
//        System.out.println(s2);//SpringWinter --saba  SpringWinter--anup
//        ///how many object will create in scp  4-scp
//        //how many object will create in heap


        ////////////////constructor of String Class

//        //1.
//        String s=new String();//create an empty string
//        //2
//        String s1=new String("SABA");
//        //3.
//        StringBuffer sb=new StringBuffer("SABa");
//        String s3=new String( sb);
//        System.out.println(s3);
//        char[] ch={'A','B','c'};
//        //4
//        String s4=new String(ch);//ABc
//        System.out.println(s4);
        //5
//        byte[] arr={101,102,100,65};
//        String s5=new String(arr);
//        System.out.println(s5);

        // importent method of method String
        //1 chatAt(int index);
//        String s="SABA";
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }
//        System.out.println(s.charAt(30));//String out of range

        //2. public String concat(String s) "+"
        String s="SABA";
        s=s.concat("Engineer");
        s=s+"Engineer";
        s +="Engineer";




    }


}
