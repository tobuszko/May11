package pl.wszib.edu.Generic;

import pl.wszib.edu.Collections.A;
import pl.wszib.edu.Collections.Zadanie5_3.ListOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

    /*    Box<String> box = new Box();
        box.setObject("siedem");
        String s = box.getObject();*/


    Pair<Integer, String> p1 = new OrderedPair<>(1, "Apple");
    Pair<Integer , String> p2 = new OrderedPair<>(2, "pear");

    //Pair<String, Box<Integer>> p3 = new OrderedPair<>("Alina", new Box<Integer>());

boolean same = Util.compare(p1,p2);
        System.out.println(same);

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("dwa");
        list.add("siedem");

        printList(list);


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        printList(list1);


        List<A> list2 = new LinkedList<>();
        list2.add(new A(1, "jeden"));
        list2.add(new A(2, "dwa"));
        list2.add(new A(3, "trzy"));

        printList(list2);

    }

    public static void printList(List<?> list){
        for (Object s : list){
            System.out.println(s +  " " );
        }
    }
}

// E - element
// T - type
// K - key
// N - number
// V - value
// S,U


class Box<T> {
    private T object;
    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

}


interface Pair<K, V> {
    K getKey();
    V getValue();
}

class OrderedPair<K, V> implements Pair<K, V>{
    private K key;
    private V  value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }



}



class Util {
    public static <K, V> boolean compare (Pair<K, V> p1,  Pair<K, V> p2){
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }
}