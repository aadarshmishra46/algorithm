package com.company.Array;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionAndUnion {

        //1. using hashset
        public  static  void usingHashset(int[] arr1,int[] arr2)
        {
            HashSet hs=new HashSet();
            ArrayList al=new ArrayList();
            for (int i = 0; i < arr1.length; i++) {
                hs.add(arr1[i]);
            }
            for (int i = 0; i < arr2.length; i++) {
                if(hs.contains(arr2[i]))
                {
                    al.add(arr2[i]);
                }
                else {
                    hs.add(arr2[i]);
                }
            }
            System.out.println(hs);
            System.out.println(al);
        }
//2. using Array
        public  static  void usingArray(int[] arr1,int[] arr2) {

        }
        public static void main(String[] args) {
            int[] arr1={1,2,3,4,5};
            int[] arr2={6,7,8,4,5};
            //1. usingHashset
            usingHashset(arr1,arr2);
            //2.


        }
    }


