package day20_ArrayContinue;
import java.util.Arrays;


public class arrays_combine_test {
    public static void main(String[] args) {

        int [] a1 = {1,2,3,5555,6666,77};
        int [] a2 = {4,5,6,7};
        int [] a3 = new int [a1.length +a2.length];
        for (int i = 0; i<a1.length; i++) {
            a3[i] = a1[i];
        }
        for (int j = 0; j<a2.length; j++) {
            a3[a1.length+j] = a2[j];
        }
        System.out.println(Arrays.toString(a3));





    }
}
