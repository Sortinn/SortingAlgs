package com.mergsort;

import static sort.Sort.less;

public class Merge {

    public static void merge(Comparable[] a, int lo, int mid, int hi) {

        int i = lo, j = mid + 1;
        Comparable[] aux = new Comparable[a.length];

        for (int k = lo; k <= hi; k++) {      //将所有元素复制到aux[]中
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];        //左半边用尽，取右边元素
            } else if (j > hi) {
                a[k] = aux[i++];        //右半边用尽，取左边元素
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];        //右半边比左半边小，取右半边元素
            } else {
                a[k] = aux[i++];        //左半边比右半边小，取左半边元素
            }
        }
    }
}
