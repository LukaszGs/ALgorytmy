package Projekty.RockScissorsPaper;
        import java.util.Random;
        import java.util.Scanner;

public class Game {
    private Choices computerChoice;
    private Choices userChoice;

    private int gamesNumber = 0;
    private int gamerWins=0;
    private int computerWins=0;

    public void startGame(){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("n - nożyczki, p - papier, " +
                    "k - kamień, q - wyjście");
            String userInput = sc.next();
            userInput = userInput.toLowerCase().trim();
            if (userInput.equals("q")) {
                break;
            }

            int computerInput = rand.nextInt(3);
            computerChoice = Choices.getEnumBasedOnInt(computerInput);

            if (userInput.equals("k") || userInput.equals("n")
                    || userInput.equals("p")) {
                userChoice = Choices.getEnumBasedOnString(userInput);
            } else {
                System.out.println("Błędny wybór");
                continue;
            }
            gamesNumber++;
            calculateResult();
        }

        System.out.println("Wygrałeś: " + gamerWins +
                " razy. Przegrałeś: " + computerWins +
                " Zagrałeś " + gamesNumber + " gier.");

    }

    private void calculateResult(){
        if(userChoice.equals(computerChoice)){
            System.out.println("Remis, obaj wybraliście: "
                    + userChoice.getFirstLetter());
        }
        else if(userChoice.equals(Choices.ROCK) &&
                computerChoice.equals(Choices.SCISSORS)){
            gamerWins++;
            System.out.println("Gratulacje wygrałeś!"
                    + " Wskazałeś kamień, a komputer nożyczki");
        }
        else if(userChoice.equals(Choices.ROCK) &&
                computerChoice.equals(Choices.PAPER)){
            computerWins++;
            System.out.println("Przegrałeś!"
                    + " Wskazałeś kamień, a komputer papier");
        }
        else if(userChoice.equals(Choices.SCISSORS) &&
                computerChoice.equals(Choices.ROCK)){
            computerWins++;
            System.out.println("Przegrałeś!"
                    + " Wskazałeś nożyczki, a komputer kamień");
        }
        else if(userChoice.equals(Choices.SCISSORS) &&
                computerChoice.equals(Choices.PAPER)) {
            gamerWins++;
            System.out.println("Wygrałeś!"
                    + " Wskazałeś nożyczki, a komputer papier");
        }
        else if(userChoice.equals(Choices.PAPER) &&
                computerChoice.equals(Choices.ROCK)){
            gamerWins++;
            System.out.println("Wygrałeś!"
                    + " Wskazałeś papier, a komputer kamień");
        }
        else if(userChoice.equals(Choices.PAPER) &&
                computerChoice.equals(Choices.SCISSORS)){
            computerWins++;
            System.out.println("Przegrałeś!"
                    + " Wskazałeś papier, a komputer nożyczki");
        }
    }
}
/*

import java.util.Scanner;
        import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int iloscGier = 0;
        int iloscZwyciestw = 0;
        Figury figura;

        while (true) {
            iloscGier += 1;
            int f = rand.nextInt(2);
            switch (f) {
                case 0:
                    figura = Figury.PAPIER;
                    break;
                case 1:
                    figura = Figury.KAMIEN;
                    break;
                default:
                    figura = Figury.NOZYCE;
            }

            System.out.println("Podaj figurę (p/k/n), " +
                    "lub wyjdz z gry (q) \n");
            Figury figura1;
            String p, k, n, q;
            String figuraPodana = sc.nextLine();

            System.out.println(figura);

            if (figura1 == Figury.PAPIER && figura == Figury.PAPIER ||
                    figura1 == Figury.NOZYCE && figura == Figury.NOZYCE ||
                    figura1 == Figury.KAMIEN && figura == Figury.KAMIEN) {
                System.out.println("Remis.\n");
            } else if (figura1 == Figury.KAMIEN && figura == Figury.NOZYCE ||
                    figura1 == Figury.PAPIER && figura == Figury.KAMIEN ||
                    figura1 == Figury.NOZYCE && figura == Figury.PAPIER) {
                System.out.println("Gracz wygrywa\n");
                iloscZwyciestw += 1;
            } else if (figura == Figury.KAMIEN && figura1 == Figury.NOZYCE ||
                    figura == Figury.PAPIER && figura1 == Figury.KAMIEN ||
                    figura == Figury.NOZYCE && figura1 == Figury.PAPIER) {
                System.out.println("Komputer wygrywa\n");
            } else if (sc.nextLine().equals(q)) {
                double procent = iloscZwyciestw / iloscGier;
                System.out.printf("Wygrano %d z %d gier (%.2f)\n." +
                                " Zakonczono program", iloscZwyciestw,
                        iloscGier, procent);
            }
        }
    }
}
*/
