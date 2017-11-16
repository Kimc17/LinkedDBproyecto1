package org.tec.algo.sort;

public class ShellSort {


// Algoritmo de ordenacion ShellSort
    public static void ordenacionShell(int[] v) {
        final int N = v.length;
        int incremento = N;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < N; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && v[j] < v[j - incremento]) {
                        int tmp = v[j];
                        v[j] = v[j - incremento];
                        v[j - incremento] = tmp;
                        j -= incremento;
                    }
                }
            }
        } while (incremento > 1);
    }
}
