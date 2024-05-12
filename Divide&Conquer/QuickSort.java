import java.util.*;

public class QuickSort {
    
    public static void main(String args[]) {
        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end <= start) return; // Base case

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivotValue = array[end]; // Choose the last element as the pivot
        int i = start - 1;

        for (int j = start; j <= end; j++) {
            if (array[j] <= pivotValue) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        return i;
    }
}
