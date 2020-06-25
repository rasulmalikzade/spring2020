package day31_Arraylist_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class testing {


        //create your method below
        public static void main(String[] args) {
            ArrayList<String> wordList = new ArrayList<>();
            wordList.addAll(Arrays.asList("hi", "hello", "hi there" ));
            System.out.println(wordList);
            wordList.removeAll(Arrays.asList("hi", "hello", "hi there" ));

            System.out.println(wordList);



        }



}