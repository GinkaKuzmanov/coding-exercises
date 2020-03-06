package joke_ginka;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {
    //this collection is used in methods below
    public static List<Joke> jokers = new ArrayList<>();

    public static void main(String[] args) {
        Joke arthur = new Joke("joker1", "joker1@mail.com", "Arthur",
                "Fleck", "555533332"
                , 1, "This is a joke.");
        Joke ben = new Joke("jokerlight", "joker2@mail.com"
                , "Ben", "Benson"
                , "333999222", 2, "This is a funny joke.");

        Joke john = new Joke("jokerjohn", "joker3@mail.com", "John"
                , "Johnson", "022993857", 3,
                "This is a hilarious joke.");

        jokers.add(arthur);
        jokers.add(ben);
        jokers.add(john);

        printJokes();
        printSpecificJoke("jokerjohn");
        removeJokerById(2); //removed
        removeJokerById(5); //user not found
        createJokeAndAddToList("jokeMartin", "MartiJ@ggg.bg", "Martin"
                , "Aleksandrov", "6666666", 4, "Hugely hilarious joke for test");
        searchJokeTexts("hilarious");  //printira celiq element ot masiva


    }

    public static void printJokes() {
        for (Joke joker : jokers) {
            //the toString is Override in Joke
            System.out.println(joker);
        }
    }

    public static void printSpecificJoke(String username) {
        boolean isPresent = false;
        for (Joke joker : jokers) {
            if (joker.getUsername().equals(username)) {
                System.out.println(joker.getJokeText());
                isPresent = true;
            }
        }
        if (!isPresent) {
            System.out.println("User not found.");
        }
    }

    public static void removeJokerById(int id) {
        boolean isRemoved = false;
        Iterator<Joke> it = jokers.iterator();
        while (it.hasNext()) {
            Joke joker = it.next();
            if (joker.getJokeID() == id) {
                it.remove();
                isRemoved = true;
                System.out.println("Елемента е премахнат.");
                break;
            }
        }

        if (!isRemoved) {
            System.out.println("User not found.");
        }
    }

    public static void createJokeAndAddToList(String username, String email, String firstName,
                                              String lastName, String phoneNumber, int jokeID, String jokeText) {
        Joke type = new Joke(username, email, firstName, lastName, phoneNumber, jokeID, jokeText);
        jokers.add(type);
        System.out.println("Успешно добавихте нов Joke.");
    }

    //proverqva dali prisastva daden tarsen tekst
    public static void searchJokeTexts(String searchedText) {
        jokers.stream().filter(joke -> joke.getJokeText().contains(searchedText)).forEach(x -> System.out.println(x.toString()));
    }
}
