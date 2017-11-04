package com.insertsort;


import sort.Sort;

public class InsertionSort extends Sort {

    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j >= 1 && less(a[j], a[j - 1])) {
                exch(a, j, j - 1);
                j--;
            }
        }
    }
}




