package day29_Wrapper_ArrayList;


import java.util.ArrayList;

public class list_intro {

    public static void main(String[] args) {
        ArrayList <String> shoping = new ArrayList<String>();
        shoping.add("milk");
        shoping.add("coffee");
        shoping.add("bread");
        shoping.add("toilet paper");
        shoping.add("eggs");
        for(String each :shoping) {
            System.out.println(each);
        }

        int size = shoping.size();
        System.out.println(size);
        System.out.println(shoping.get(shoping.size()-1));

    }
}
