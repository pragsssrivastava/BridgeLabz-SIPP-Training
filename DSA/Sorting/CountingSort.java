package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] ages, int maxAge) {
        int[] count = new int[maxAge + 1];
        for (int age : ages)
            count[age]++;

        int index = 0;
        for (int i = 0; i <= maxAge; i++) {
            while (count[i]-- > 0)
                ages[index++] = i;
        }
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 18, 10, 12, 14, 13};
        System.out.println("Original: " + Arrays.toString(ages));
        countingSort(ages, 18);
        System.out.println("Sorted:   " + Arrays.toString(ages));
    }
}
