package CollectionConcept;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        //dynamic
//        HashSet hs=new HashSet();
//        hs.add("Abc");
//        //hs.add(1);
//        hs.add("saba");
//        hs.add("Saba");
//        hs.add("Abc");
//        hs.add(5);
//        System.out.println(hs);//[1, Abc, saba, Saba] there is no order
//        LinkedHashSet lhs=new LinkedHashSet();
////        lhs.add("Abc");
////        lhs.add(1);
////        lhs.add("saba");
////        lhs.add("Saba");
////        lhs.add("Abc");
//        lhs.addAll(hs);
//        lhs.add(5);
//        System.out.println(lhs);
        HashSet hs=new HashSet();
        hs.add("abc");
       hs.add("saba");
       hs.add("aba");
       hs.add("Ab");
        System.out.println(hs);
        TreeSet ts=new TreeSet();
        ts.addAll(hs);
        System.out.println(ts);


     }

}
