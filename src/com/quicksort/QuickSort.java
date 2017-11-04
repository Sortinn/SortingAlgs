package com.quicksort;

import edu.princeton.cs.algs4.StdRandom;
import sort.Sort;

public class QuickSort extends Sort {
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) return;  ////**??
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable p = a[lo];
        while (true) {

            while (less(a[++i], p)) {
                if (i == hi) break;
            }

            while (less(p, a[--j])) {
                if (j == lo) break;
            }

            if (i >= j) break;

            exch(a, i, j);
        }

        exch(a, lo, j);
        return j;
    }


//    public static void main(String[] args) {
//        Integer[] a = new Integer[]{32, 43, 232, 2343, 2131, 6546, 7654, 543};
//        sort(a);
//        for (int i : a) {
//            StdOut.print(i + " ");
//        }
//    }
}




