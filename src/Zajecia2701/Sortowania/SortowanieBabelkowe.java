package Zajecia2701.Sortowania;

public class SortowanieBabelkowe {
    public static void main(String[] args) {
        int[] d = {5, 1, 2, 4, 3, 8, 7, 6};
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length - 1; j++) {
                if (d[j] > d[j + 1]) {
                    int x = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = x;
                }

            }
        }
        for (int i = 0; i <d.length; i++) {
            System.out.println(d[i]);
        }
    }
}
