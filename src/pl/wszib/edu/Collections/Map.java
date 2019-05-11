package pl.wszib.edu.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Map {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Wojtek");
        set.add("Agata");
        set.add("Tomek");
        set.add("Wojtek");
        set.add("Michał");
        set.add("Wojtek");

        System.out.println("Ilość: " + set.size());


        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name + "   "  + name.hashCode());
        }

        set.remove("Wojtek");
        System.out.println("Ilość: " + set.size());



        String a = "Tomek";
        String b = "Tomek";
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());






    }
}
