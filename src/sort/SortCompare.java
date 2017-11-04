package sort;

import com.insertsort.InsertionSort;
import com.insertsort.ShellSort;
import com.jdk.JdkSort;
import com.mergsort.DownTopMerge;
import com.mergsort.TopDownMerge;
import com.quicksort.QuickSort;
import com.selectionsort.SelectionSort;
import edu.princeton.cs.algs4.Quick3way;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SortCompare {
    public static double time(int input, Comparable[] a) {
        Stopwatch timer = new Stopwatch();
        if (input == 1) {
            SelectionSort.sort(a);
        }
        if (input == 2) {
            InsertionSort.sort(a);
        }
        if (input == 3) {
            ShellSort.sort(a);
        }
        if (input == 4) {
            TopDownMerge.sort(a);
        }
        if (input == 5) {
            DownTopMerge.sort(a);
        }
        if (input == 6) {
            QuickSort.sort(a);
        }
        if (input == 7) {
            Quick3way.sort(a);
        }
        if (input == 8) {
            JdkSort.sort(a);
        }

        return timer.elapsedTime();
    }

    public static void timeSpent(int input, int times, int N) {
        Random random = new Random();
        double runTime = 0.0;
        double totalTime = 0.0;
        Integer[] a = new Integer[N];
        for (int t = 0; t < times; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = random.nextInt();
            }
            runTime = time(input, a);
            totalTime += runTime;
            StdOut.printf("%.2fs\t",runTime);
        }
        StdOut.printf("%.2fs",totalTime / times);
    }

    public static void main(String[] args) {
        String Menu = "[1] Selection\n" +
                "[2] Insertion\n" +
                "[3] Shell\n" +
                "[4] TopDownMerge\n" +
                "[5] DownTopMerge\n" +
                "[6] Quick\n" +
                "[7] Quick3Way\n" +
                "[8] JDK\n";

        Scanner input = new Scanner(System.in);
        StdOut.println(Menu);
        StdOut.println("Enter the number of sort algorithm you want to generate:");
        int[] a = new int[8];
        for (int i = 0; i<a.length;i++) {
            a[i] = input.nextInt();
        }

        StdOut.println("Enter the size of the array to be sorted:");
        int N = input.nextInt();
        StdOut.println("Enter the number of times you want to sort:");
        int times = input.nextInt();

        for (int i = 0; i < times; i++) {
            if (i == 0) {
                StdOut.print("            \t");
            }
            StdOut.print("Run" + (i + 1) + "\t");
        }
        StdOut.print("Average\n");
        for (int i : a) {
            String name = "";
            switch (i) {
                case 1:
                    name = "Selection   ";
                    break;
                case 2:
                    name = "Insertion   ";
                    break;
                case 3:
                    name = "Shell       ";
                    break;
                case 4:
                    name = "TopDownMerge";
                    break;
                case 5:
                    name = "DownTopMerge";
                    break;
                case 6:
                    name = "Quick       ";
                    break;
                case 7:
                    name = "Quick3Way   ";
                    break;
                case 8:
                    name = "JDK         ";
                    break;
                case 0:
                    continue;
            }
            StdOut.print(name + "\t");
            timeSpent(i, times, N);
            StdOut.print("\n");

        }


    }

}
