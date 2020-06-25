package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {
        /*int a =100; // primitive
        Integer b =200;  //wrapper class
        // Integer b = a;
        short s1 = 200;
        int n1 = s1;

        // Integer N1 = s1; // Integer is dedicated to int primitive
        int a1 = 20;
        float f1 = a1;
         // Float f2 = a1;
         Integer I1 = 200;
         int a2 = I1;

         // AUTOBOXING
        // AutoBoxing : converting primitive values to wrapper class
        int a3 = 100;
        Integer b3 = a3;

        // UNBOXING
        // UNBOXING  : Converting wrapper to primitive values
        //Byte numb1 =  98;
        // Short numb2 = numb1; // unboxing
        //byte numb3 = numb1; // unboxing
        Short sh1 = 34;
        int aa1 = sh1;
        System.out.println(aa1);
        String str = "True";
        boolean bb1 = Boolean.valueOf(str);
        System.out.println(!bb1);
        String str1 ="22222";
        int a4 = Integer.parseInt(str1);
        System.out.println(a4+1);
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        int min = Integer.MIN_VALUE;
        System.out.println(min);

         */
        String [] arr = {"1", "2.5", "3", "4.5", "3.5"};
        double []arr1 = new double[arr.length];
        for (int i = 0; i<arr.length; i++) {
            arr1[i] = Double.valueOf(arr[i]);
        }
        Arrays.sort(arr1);
        double max1 = arr1[arr1.length-1];
        System.out.println(max1);












    }
}
