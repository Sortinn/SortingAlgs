package com.mergsort;

import edu.princeton.cs.algs4.StdOut;
import sort.Sort;

import static com.mergsort.Merge.merge;

public class DownTopMerge extends Sort {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int sz = 1; sz < N; sz = sz + sz) {
            for (int lo = 0; lo < N - sz; lo += sz + sz) {
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
    }


//    public static void main(String[] args) {
//        Integer[] a = new Integer[]{32, 43, 232, 2343, 2131, 6546, 7654, 543};
//        sort(a);
//        for (int i : a) {
//            StdOut.print(i + " ");
//        }
//    }
}