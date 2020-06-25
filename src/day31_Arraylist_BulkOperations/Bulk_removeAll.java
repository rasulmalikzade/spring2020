package day31_Arraylist_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bulk_removeAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,3));
        //remove 1,3,5,8;

        Integer a =1;
        Integer b = 3;
        list.remove(a);
        list.remove(a);
        list.remove(a);
        list.remove(b);
        list.remove(b);
        list.removeAll(Arrays.asList(2,4,5,6,7,8));
        System.out.println(list);
    }
}
