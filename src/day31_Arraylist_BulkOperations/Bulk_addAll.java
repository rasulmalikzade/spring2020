package day31_Arraylist_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {
       String [] names = {"Ali", "Vali", "Dali", "Tali"};
        System.out.println(Arrays.toString(names));
        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(names));
        list1.add("Wali");
        list1.remove("Vali");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("AA", "BB", "CC"));
        list2.add("FF");
        list2.remove("BB");
        System.out.println(list2);
        System.out.println("=========================================================================");
        Integer [] numbers = {1,2,3,4,5,6,7,8,9,10};
        ArrayList <Integer> numList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numList);


    }
}
