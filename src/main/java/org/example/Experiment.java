package org.example;
import org.example.Sorter;
import org.example.Searcher;
import java.util.Random;

public class Experiment {
    Sorter sorter = new Sorter();
    Searcher searcher = new Searcher();

    long measureSortTime(int[] arr, String type) {
        int[] copy = arr.clone();
        long time1 = System.nanoTime();
        if (type.equals("advanced")) {
            sorter.advancedSort(copy, 0, arr.length - 1);
        }
        else {
            sorter.basicSort(copy);
        }
        long time2 = System.nanoTime();

        return time2 - time1;
    }

    long measureSearchTime(int[] arr, int target){
        long time1 = System.nanoTime();
        searcher.search(arr, target);
        long time2 = System.nanoTime();
        return time2 - time1;
    }

    public void runaAllExperiments() {
        Random rand = new Random();
        int[] smallSorted = sorter.generateArray(10, "sorted");
        int[] mediumSorted = sorter.generateArray(100, "sorted");
        int[] largeSorted = sorter.generateArray(10000, "sorted");

        int[] smallRandom = sorter.generateArray(10, "random");
        int[] mediumRandom = sorter.generateArray(100, "random");
        int[] largeRandom = sorter.generateArray(10000, "random");

        int[][] arrays = new int[][] {smallSorted, mediumSorted, largeSorted,
        smallRandom, mediumRandom, largeRandom};
        for (int i = 0; i < arrays.length; i++) {
            if (i==0) System.out.println("Sorted lists:\n");
            if (i==3) System.out.println("\nNow random lists:\n");

            measureSortTime(arrays[0], "basic");
            measureSearchTime(arrays[0], 10);
            int target = rand.nextInt(arrays[i].length);
            System.out.println("size: " + arrays[i].length + ", search target: " + target);
            System.out.println(measureSearchTime(arrays[i], target));
            System.out.println("basic sort: ");
            System.out.println(measureSortTime(arrays[i], "basic"));
            System.out.println("advanced sort: ");
            System.out.println(measureSortTime(arrays[i],"advanced"));
        }

    }
}
