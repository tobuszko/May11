package pl.wszib.edu.Collections;

import java.util.*;

public class LIstTester {

    public static void main(String[] args) {

        List<Integer> listTest= new ArrayList<>();
        listTest = Arrays.asList(1,2,3,4,44,5454,222,5,6,7,8,9,10);
        System.out.println(listTest.get(5));
        System.out.println(listTest.size());


        System.out.println("Iterowanie z x");
        for (int x =0 ; x <listTest.size(); x++){
            System.out.println(listTest.get(x));
        }

        System.out.println("Iterowanie po uproszczonej");
        for (Integer list : listTest){
            System.out.println(list);
        }


        Iterator<Integer> iterator = listTest.listIterator();

        System.out.println("z iteratorem");
        while (iterator.hasNext()) {

            if(iterator.next() == 7){
                //System.out.println(((ListIterator<Integer>) iterator).previous());
            }

        }


        System.out.println();
        System.out.println("parzyste elementy");
        for (Integer list : listTest){
            if (list%2 == 0){
                System.out.println(list);
            }

        }



/*
        //bez określania typu
        List listTest= new ArrayList<>();

        listTest.add(1);
        listTest.add(new Object());
        listTest.add("dwa");

        System.out.println(listTest);

        System.out.println((int)listTest.get(0) + (String)listTest.get(2));

*/

/*
List<Integer> listTest= new ArrayList<>();
listTest.add(10);
        listTest.add(90);

        System.out.println(listTest);
        System.out.println(listTest.get(0));
        System.out.println(listTest.remove(0));
        System.out.println(listTest.get(0));

        System.out.println(listTest.size());
        listTest.clear();
        System.out.println(listTest.size());*/

    }
}
