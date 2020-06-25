package day20_ArrayContinue;

import java.util.Arrays;

public class Arrays_Sort__ArrayName__ {
    public static void main(String[] args) {
        /*
        int [] arr1 = {9,5,7,10,11,14,2};
        Arrays.sort(arr1);
        int max = arr1 [arr1.length-1];
        int min = arr1 [0];
        System.out.println("max: " + max);
        System.out.println("min: " + min);
         */
        int [] arr = {3,1,4,-1,100,-100,200,155};
        Arrays.sort(arr);
        int a = arr.length;
        int [] arr2 = new int [a];
        for (int i = 0; i<a; i++) {    // a-1 vermesen sehv alinacaq, cunki sonuncu reqem yeri a-1-dir
            arr2 [i] = arr [(a-1)-i];   //
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(a);
        System.out.println(Arrays.toString(arr2));

    }
}
