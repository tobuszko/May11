package pl.wszib.edu.Generic;

import java.awt.*;

public class Lab5_4 {

    public static void main(String[] args) {

        Integer[] table1 = {1,2,3,4,5};
        String[] table2 = {"el1", "el2", "el3", "el4",};

        printTable(table1);
        printTable(table2);

        Integer a = 6;
        Double l = 3.4;
        Point p = new Point(3,4);
        String s = "test";


        ThreeObjects<Integer, Double, String> threeObjects = new ThreeObjects<>(a, l, s);
        ThreeObjects<Point, Point, Integer> threeObjects1 = new ThreeObjects<>(p, p, a);


    }

    public static <E> void printTable ( E[] tab){
        for (int i =0; i <tab.length; i++){
            System.out.println(tab[i]);
        }
    }

}

class ThreeObjects <T, K,  X >{
    private T t;
    private K k;
    private X x;


    public ThreeObjects(T t, K k, X x) {
        this.t = t;
        this.k = k;
        this.x = x;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }


}

