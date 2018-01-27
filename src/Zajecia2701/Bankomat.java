package Zajecia2701;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] zlote = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] zloteZuzycie = new int[zlote.length];
        int[] grosze = {50, 20, 10, 5, 2, 1};
        int[] groszeZuzycie = new int[grosze.length];
        System.out.println("Podaj kwotę w formacie zl gr: ");
        int zloteSum = sc.nextInt();
        int groszeSum = sc.nextInt();
        int aktualnyNominal=0;
        int aktualnyNominalGr=0;
        while (zloteSum > 0 && groszeSum > 0) {
            if(zloteSum >= zlote[aktualnyNominal]){
                zloteSum -= zlote[aktualnyNominal];
                zloteZuzycie[aktualnyNominal]++;
            }
            else{
                aktualnyNominal++;
            }
            for (int i = 0; i < zlote.length; i++) {
                if(zloteZuzycie[i]>0)
                    System.out.printf("%d x %d zl\n",zloteZuzycie[i], zlote[i] );
            }

            /*if(groszeSum >= grosze[aktualnyNominalGr]){
                groszeSum -= grosze[aktualnyNominalGr];
                groszeZuzycie[aktualnyNominalGr]++;
            }
            else{
                aktualnyNominalGr++;
            }
            for (int i = 0; i < grosze.length; i++) {
                if(groszeZuzycie[i]>0)
                    System.out.printf("%d x %d gr\n",groszeZuzycie[i], grosze[i] );
            }*/

        }
    }
}
