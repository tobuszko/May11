package pl.wszib.edu.Collections.Zadanie5_5_Alicja;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AliceMain {

    public static void main(String[] args) {


        try {
            List<String> book = Files.readAllLines(Paths.get("pl/wszib/edu/Collections/Zadanie5_5_Alicja/alice30.txt"));
            System.out.println("Ilość wiereszy w książce: " + BookReader.numberOfLines(book));
        } catch (IOException e) {
            e.printStackTrace();
        }



        BookReader br = new BookReader("alice30.txt");
        System.out.println("");
        System.out.println("Listowanie co 100 wiersz");
        br.every100();
        System.out.println("");
        System.out.println("Poszukiwanie najdłuższego wiersza");
        br.longest();

    }

}



class BookReader {

    List<String> alice=new ArrayList();
    String bookAddress;
    BookReader (String bookPath) {
        this.bookAddress = bookPath;
        {
            try {
                alice = Files.readAllLines(Paths.get(bookAddress));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static int numberOfLines (List<String> book){
        return book.size();

    }




    public void every100 (){
        for (int i = 100 ; i < alice.size(); i=i+100){
            System.out.println("Linia nr: " + i + " to: " + alice.get(i));
        }
    }



    public void longest (){
        String longest = alice.get(0);
        for (String ls : alice) {
            if (longest.length() < ls.length()){

                longest = ls;
            }

        }
        System.out.println("Najdłuższy wiersz to: " + longest.toUpperCase());
    }





}