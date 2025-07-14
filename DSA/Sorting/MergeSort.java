package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }

    private static void merge(int[] prices, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (prices[i] <= prices[j]) temp[k++] = prices[i++];
            else temp[k++] = prices[j++];
        }
        while (i <= mid) temp[k++] = prices[i++];
        while (j <= right) temp[k++] = prices[j++];

        System.arraycopy(temp, 0, prices, left, temp.length);
    }

    public static void main(String[] args) {
        int[] prices = {500, 150, 300, 450, 250};
        System.out.println("Original: " + Arrays.toString(prices));
        mergeSort(prices, 0, prices.length - 1);
        System.out.println("Sorted:   " + Arrays.toString(prices));
    }
}
