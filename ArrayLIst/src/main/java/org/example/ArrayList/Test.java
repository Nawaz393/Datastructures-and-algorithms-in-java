package org.example.ArrayList;

public class Test {
    public static void main(String[] args) {
//        List list=new ArrayList<Integer>();
        List list = new List<Integer>();


        for (int i = 0; i < 5; i++) {

            System.out.println(list.add(i));

        }
        for (int i = 0; i < 5; i++) {

            System.out.println(list.get(i)
            );
        }


    }
}
