package joker_ginka;

public class Joke {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int jokeID;
    private String jokeText;

    public Joke(String username, String email, String firstName,
                String lastName, String phoneNumber, int jokeID, String jokeText) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.jokeID = jokeID;
        this.jokeText = jokeText;
    }

    public int getJokeID() {
        return this.jokeID;
    }

    public String getUsername() {
        return this.username;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getJokeText() {
        return this.jokeText;
    }

    @Override
    public String toString() {
        return String.format("Author: %s %s, posted a joke: %s"
                , this.getFirstName(), this.getLastName(), this.getJokeText());
    }
}
