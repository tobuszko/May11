package pl.wszib.edu.Generic;

import pl.wszib.edu.Collections.Zadanie5_3.ListOperations;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("test");

        String s = (String)list.get(0);
    }
}
