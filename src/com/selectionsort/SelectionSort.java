package com.selectionsort;

import edu.princeton.cs.algs4.StdOut;
import sort.Sort;

public class SelectionSort extends Sort {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

//    public static void main(String[] args) {
//
//        Integer[] a = new Integer[]{3434, 432, 21331, 1, 0, 543, 312, 123, 65, 43};
//        sort(a);
//        for (int i : a)
//            StdOut.print(i + " ");
//    }
}
