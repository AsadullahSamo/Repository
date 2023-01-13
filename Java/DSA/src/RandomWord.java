import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Random {

    public Random(){ }
    public static void shuffle(Object[] x) {
        int n = x.length;
        for (int i = 0; i < n; i++) {
            int r = (int) (Math.random() * (i + 1));
            Object swap = x[r];
            x[r] = x[i];
            x[i] = swap;
        }
    }

    public static void shuffleAlternate(Object[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            // choose index uniformly in [i, n-1]
            int r = i + (int) (Math.random() * (n - i));
            Object swap = a[r];
            a[r] = a[i];
            a[i] = swap;
        }
    }

    public static void main(String[] args) {

        String[] a = new String[0];
        if (!StdIn.isEmpty()) {
            a = StdIn.readAllStrings();
            Random.shuffle(a);
        }

        for (String s : a) {
            StdOut.println(s);
        }

    }
}
