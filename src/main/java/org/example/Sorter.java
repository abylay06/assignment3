package org.example;
import java.util.Random;


public class Sorter {
    // Insert sort
    public void basicSort(int[] numbers) {

        for (int i = 0; i < numbers.length- 1; i++) {
            for (int j = i; j > -1; j--) {
                if (numbers[j + 1] > numbers[j]) {
                    break;
                }
                int temp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = temp;
            }
        }
    }

    //merge sort
    public void advancedSort(int[] x, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            advancedSort(x, start, mid);
            advancedSort(x, mid+1, end);

            int i = start, j = mid+1;

            int[] temp = new int[end-start+1];
            for (int k = 0; k <= end - start; k++) temp[k] = x[start+k];
            int k = 0;

            while (i <= mid && j <= end) {
                if (temp[i-start] <= temp[j-start]) x[start+(k++)] = temp[-start+i++];
                else x[start+k++] = temp[-start+j++];
            }

            while(i <= mid) x[start+k++] = temp[-start+i++];
            while(j <= end) x[start+k++] = temp[-start+j++];
        }
    }


    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int[] generateArray(int size, String type) {
        int[] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            if (type.equals("random")) arr[i] = rand.nextInt(size);
            else arr[i] = i;
        }
        return arr;
    }

}
