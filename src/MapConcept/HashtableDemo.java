package MapConcept;

import java.util.*;

public class HashtableDemo {
    public static void main(String[] args) {
       // HashMap<Integer,String> ht=new HashMap<>();
       //put(key,value)
        //putAll(map)
        //remove(Object key)
        //containskey(Object Key)
        //containsValue(Object Value)
        //isEmpty()
        //size();
        //clear();
        //keySet();
        //keyValue();
        //entrySet()
//        ht.put(1,"SABA");
//        ht.put(2,"Aadarsh");
//        ht.put(3,"aman");
//        System.out.println(ht);
//        ht.remove(3);
//        System.out.println(ht);
       // System.out.println(ht.containsKey(10));
        //System.out.println(ht.containsValue("Aman"));
      //  System.out.println(ht.isEmpty());
       // ht.clear();
      //  System.out.println(ht);
     //   System.out.println(ht.isEmpty());
//        Set s= ht.keySet();
//        System.out.println(s);//1 2
//        Collection al= ht.values();
//        System.out.println(al);
////key value
//      Object o=  ht.get(2);
//        System.out.println(o);
//       int n=ht.get(2).hashCode();
//        System.out.println(n);

//        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
//        lhm.put(101,"Aadarsh");
//        lhm.put(102,"Saba");
//        lhm.put(105,"Anup");
//        lhm.put(103,"Dk");
//        lhm.put(104,"pk");
//        System.out.println(lhm);//insertion order presverd

        TreeMap<Integer, String> lhm
                = new TreeMap<>(Collections.reverseOrder());
        lhm.put(101,"Aadarsh");
        lhm.put(102,"Saba");
        lhm.put(105,"Anup");
        lhm.put(103,"Dk");
        lhm.put(104,"pk");
        System.out.println(lhm);//in default sorting order by using keys (dictionry order)

    }
}
