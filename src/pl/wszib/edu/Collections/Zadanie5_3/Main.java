package pl.wszib.edu.Collections.Zadanie5_3;

import org.omg.CORBA.PERSIST_STORE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new LinkedList<>();
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        ListOperations.listOpertions(persons);
        endTime = System.currentTimeMillis();
        System.out.println("Czas wykonania dla LinkedList : " + (endTime - startTime) + " milisekund");

        persons = new ArrayList<>();
        startTime = System.currentTimeMillis();
        ListOperations.listOpertions(persons);
        endTime = System.currentTimeMillis();
        System.out.println("Czas wykonania dla ArrayList: " + (endTime - startTime) + " milisekund");

    }



}
