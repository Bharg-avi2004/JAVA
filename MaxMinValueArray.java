package Arrays;

import java.util.Arrays;

public class MaxMinValueArray {
     static int minValue(int[] arr) {
        int min = arr[0];
        for (int j : arr)
            if (j < min)
                min = j;
        return min;
    }
    static int maxValue(int[] arr) {
        int max = arr[0];
        for (int j : arr)
            if (j > max)
                max = j;
        return max;
    }
    public static void main(String[] args) {
        int[] my_arr = {12,13,14,15,16,17};
        System.out.println("The Maximum value = " + maxValue(my_arr));
        System.out.println("The Minimum value = " + minValue(my_arr));
    }
}
