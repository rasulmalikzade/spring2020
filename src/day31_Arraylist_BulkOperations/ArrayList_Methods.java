package day31_Arraylist_BulkOperations;
/*
3.    .contains("A)     .contains(7
 */
import java.util.ArrayList;

import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        list2.add(10);
        list2.add(100);
        list2.add(1000);
        list2.add(20);

        list3.add("C");
        list3.add("D");
        list3.add("A");
        list3.add("B");

/*3*/   boolean r1 = list1.contains("B");          // out: true
        System.out.println(r1);
        boolean r11 = list2.contains(30);
        System.out.println(r11);
/*3a*/  boolean r2 = list1.contains("F");          // out: false
        System.out.println(r2);
        System.out.println("=====================================");
        Collections.sort(list3);
        boolean r3 = list3.equals(list1);
        System.out.println(r3);
        // write Arraylist high to low
        System.out.println("+++++++++++++++++++++++++");
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(100);
        list4.add(1000);
        list4.add(20);
        ArrayList<Integer> list5 = new ArrayList<>();

        Collections.sort(list4);
        for (int i=list4.size()-1; i>=0; i--) {
            list5.add(list4.get(i));
        }System.out.println(list5);

    }
}
