package Arrays;

import java.util.Arrays;

public class CommonValuesBetweenTwoArrays {
    static void commonValues(int[] arr1, int[] arr2) {
        for (int k : arr1) {
            for (int i : arr2) {
                if (k == i) {
                    System.out.println("Common values : " + k);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {66, 55, 77, 11, 88};
        commonValues(arr1, arr2);
    }
}
