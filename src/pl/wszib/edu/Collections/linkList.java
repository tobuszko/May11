package pl.wszib.edu.Collections;

import java.util.*;

public class linkList {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
       // list = Arrays.asList("element1","element2","element3","element4","element5","element6","element7");
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        list.add("element5");
        list.add("element1");
        list.add("element2");

        System.out.println(list);
        list.add(2, "nowy");
        System.out.println(list);

        //oliczanie wystepowania obiektów
        System.out.println(Collections.frequency(list,"element2"));

    }
}
