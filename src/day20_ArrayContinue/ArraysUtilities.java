package day20_ArrayContinue;
import java.util.Arrays;  // arrays metodlarini islemek ucun evvelce bura link qoyuruq
public class ArraysUtilities {

    public static void main(String[] args) {
                      //..::Arrays.toString(arrayName)::..\\
        // Arrays.toString(arrayName) : converst the array to String, return th string
        int[] arr = {1,2,3};
        String arrS = Arrays.toString(arr);
        // System.out.println(arr);  // out [I@1b6d3586
        System.out.println(arrS); // out [1, 2, 3]

        String [] names = {"Rasul", "Anar", "Orxan"};
        System.out.println(Arrays.toString(names));
        double [] number = {2,3,4,5};
        System.out.println(Arrays.toString(number)); // out [2.0, 3.0, 4.0, 5.0]
        System.out.println(number[0] + 1);  // out 3.0

    }
}
