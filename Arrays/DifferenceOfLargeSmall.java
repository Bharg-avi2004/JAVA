package Arrays;

import java.util.Arrays;

public class DifferenceOfLargeSmall {
     static void difference_Min_Max(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int difference;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        difference = max - min; 
        System.out.println("\nDifference of large and small values : " + difference);
    }

    public static void main(String[] args) {
        int[] my_arr = {11, 22, 33, 44, 55};
        difference_Min_Max(my_arr);
    }
}
