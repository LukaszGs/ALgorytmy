package Zajecia2701;


//nie dziala
public class SitoArystotelesa {
    public static void main(String[] args) {

        boolean liczby[] = new boolean[100];
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = true;
        }
        for (int i = 2; i < liczby.length; i++) {
            if (liczby[i]) {
                for (int j = i + i; j < liczby.length; j += 1) {
                    liczby[j] = false;
                }
            }
        }
        for (int i = 1; i < liczby.length; i++) {
            if (liczby[i])
                System.out.printf("%d \n",i);
        }

    }
}

