package pl.wszib.edu.Collections.Zadanie5_3;

import java.util.List;

public class ListOperations {

    public static void listOpertions (List<Person> persons){
        for (int i = 0; i <100_000; i++){
            persons.add(0 ,new Person("ImieNr" + i, "NazwiskoNr" + i));
        }
        System.out.println("Wielkość listy na początku:");
        System.out.println(persons.size());

        for (int i = 0; i < persons.size(); i ++){
            for (int j = persons.size() -1; j > 0; j--){
                persons.remove(j);
            }
            persons.remove(i);
        }
        System.out.println("Wielkość listy na końcu:");
        System.out.println(persons.size());
    }


}
