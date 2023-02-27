package org.example.ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        List list=new ArrayList<Integer>();
        List list = new List<Integer>();


        for (int i = 0; i < 5; i++) {

            list.add(i);

        }


//       Object  arr[] ;
//        arr=list.toArray();
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int i=0;i<arr.length;i++){
//
//            System.out.println(arr[i]);
//        }

        list.clear();



        for (int i = 0; i < 5; i++) {

            System.out.println(list.get(i)
            );
        }








    }
}
