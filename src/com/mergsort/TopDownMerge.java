package com.mergsort;

import edu.princeton.cs.algs4.StdOut;
import sort.Sort;

import static com.mergsort.Merge.merge;

public class TopDownMerge extends Sort {
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);

    }


//    public static void main(String[] args) {
//        Integer[] a = new Integer[]{32, 43, 232, 2343, 2131, 6546, 7654, 543};
//        sort(a);
//        for (int i : a) {
//            StdOut.print(i + " ");
//        }
//    }


}
