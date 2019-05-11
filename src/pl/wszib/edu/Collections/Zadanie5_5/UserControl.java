package pl.wszib.edu.Collections.Zadanie5_5;

public class UserControl {

    public static void main(String[] args) {


        UserCollector userCollector = new UserCollector(new User("Tomasz", "Blabla", 34));
        userCollector.addUser(new User("Łukasz", "Hhhhhhh", 36));
        userCollector.addUser(new User("Maria", "iiiii", 16));
        userCollector.addUser(new User("Henryk", "Mnuuiu", 23));

        userCollector.printUser(2);


    }

}
