package Projekty.RockScissorsPaper;


public enum Choices {
    ROCK(0, "k"),
    SCISSORS(1, "n"),
    PAPER(2, "p");

    private int values;
    private String firstLetter;
    Choices(int values, String firstLetter) {
        this.values = values;
        this.firstLetter = firstLetter;
    }
    public int getValues() { return values; }

    public String getFirstLetter() {return firstLetter;}

    public static Choices getEnumBasedOnInt(int e){
        for (Choices choice : Choices.values()) {
            if(choice.getValues() == e)
                return choice;
        }
        return ROCK;
    }
    public static Choices getEnumBasedOnString(String e){
        for (Choices choice : Choices.values()) {
            if(choice.getFirstLetter().equals(e))
                return choice;
        }
        return ROCK;
    }

}

/*
public enum Figury {
    PAPIER(0), KAMIEN(1), NOZYCE(2), KONIEC(3);

    private final int value;

    Figury(int value) {
        this.value = value;
    }
}

public enum Choices {
    ROCK(0, "r"),
    SCISSORS(1, "s"),
    PAPER(2, "p"),



    //zapisujemy w zmiennej values
    private int values;

    private String firstLetter;

    //kontruktor
    Choices(int values, String firstLetter) {
        this.values = values;
        this.firstLetter = firstLetter;
    }

    //metody zeby inta pobrac
    public int getValue() {
        return values;
    }

    //PARAMETR int e
    public static Choices getEnumBasedOnInt(int e) {
        for (Choices choice : Choices.values()) {
            if (choice.getValue() == e)
                return choice;
        }
        return ROCK;
    } //po forze zwrocic wartosc bazowa jesli bedzie taka koniecznosc

    public static Choices getEnumBasedOnString(String  e) {
        for (Choices choice : Choices.values()) {
            if (choice.getValue() == e)
                return choice;
        }
        return ROCK;
    }

    }*/
