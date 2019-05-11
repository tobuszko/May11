package pl.wszib.edu.Collections;

import java.util.HashSet;
import java.util.Set;

public class listHash {
    public static void main(String[] args) {

        Set<A> set = new HashSet<>();

        for (int i = 0 ;  i < 100; i++){
            set.add(new A(1, "aaa"));
        }

        System.out.println(set.size());


    }
}
