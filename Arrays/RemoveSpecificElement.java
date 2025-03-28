package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSpecificElement {
  public static int[] removeElement(int[] arr, int index)
    {

        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }
    public static void main(String[] args) {
        int[] arr = { 6,7,8,9,10,11};
        System.out.print("Select an index to remove a value from arr = " + Arrays.toString(arr) + ": ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("Array after removing Element at index " + index );
        arr = removeElement(arr, index);
        System.out.println("arr = " + Arrays.toString(arr));
    }  
}
