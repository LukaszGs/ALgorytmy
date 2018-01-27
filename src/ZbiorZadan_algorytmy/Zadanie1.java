package ZbiorZadan_algorytmy;

import java.util.Scanner;

public class Zadanie1 {


    public static void main(String[] args) {


        int a, b, c, d, e, f, g, h, i, k, l, m, p, rok, dzien, miesiac;
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj rok");
        rok = sc.nextInt();
        a = rok % 19;
        b = (int) Math.floor(rok / 100);
        c = rok % 100;
        d = (int) Math.floor(b / 4);
        e = b % 4;
        f = (int) Math.floor((b + 8) / 25);
        g = (int) Math.floor((b - f + 1) / 3);
        h = (19 * a + b - d - g + 15) % 30;
        i = (int) Math.floor(c / 4);
        k = c % 4;
        l = (32 + 2 * e + 2 * i - h - k) % 7;
        m = (int) Math.floor((a + 11 * h + 22 * l) / 451);
        p = (h + l - 7 * m + 114) % 31;
        dzien = p + 1;
        miesiac = (int) Math.floor((h + l - 7 * m + 114) / 31);
        String miesiac1 = (miesiac == 3) ? "Marca" : "Kwietnia";
        System.out.printf("wielkanoc w roku %d wypada %d %s", rok, dzien, miesiac1);


    }
}
