package pl.wszib.edu.Collections.Zadanie5_5_Alicja;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class AliceMain {

    public static void main(String[] args) {
        BookReader br = new BookReader("src/pl/wszib/edu/Collections/Zadanie5_5_Alicja/alice30.txt");
        System.out.println("Ilość wiereszy w książce: " + br.numberOfLines());
        br.changeLinesToWords();
        br.mostOftenStarts();

    }

}



class BookReader {

    List<String> alice=new ArrayList();
    Set<String> aliceWords = new TreeSet();
    String[] arr;
    String bookAddress;
    BookReader (String bookPath) {
        this.bookAddress = bookPath;
        {
            try {
                alice = Files.readAllLines(Paths.get(bookAddress));
            } catch (IOException e) {
                System.out.println("Nie udało się odczytać książki");
                e.printStackTrace();
            }
        }
    }


    public int numberOfLines (){
        return alice.size();
    }



    public void changeLinesToWords (){
        for (String s: this.alice){
            arr=s.split("[^a-zA-Z]+");
            for(int i = 0; i < arr.length; i += 1)
            {
                if(!arr[i].isEmpty()){
                    aliceWords.add(arr[i].toLowerCase());
                }

            }
        }
        System.out.println("");
        System.out.println("Ilość unikatowych wyrazów w książce:");
        System.out.println(aliceWords.size());
    }


    public void mostOftenStarts (){
        Map<Character, Integer> stats = new TreeMap<>();
        char firstLetter;
        for (String s : aliceWords){
            firstLetter = s.charAt(0);

            if (stats.containsKey(firstLetter)){
                stats.put(firstLetter, stats.get(firstLetter)+1);
            }else{
                stats.put(firstLetter, 1);
            }

        }
        System.out.println(stats);
        stats.
    }


}