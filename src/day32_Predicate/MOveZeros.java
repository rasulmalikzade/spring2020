package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class MOveZeros {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);
        int count =0;
        for (Integer each: list) {
            if (each==0) {
                count++;
            }
        }
        System.out.println(count);
        list.removeAll(Arrays.asList(0));
        System.out.println(list);
        for (int i = 1; i<=count; i++) {
            list.add(0);    // if you want add 0 first and number then write two time (index 0)  0
        }
        System.out.println(list);
    }

}
