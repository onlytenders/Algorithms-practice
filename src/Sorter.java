import java.util.ArrayList;

public class Sorter {
    public int[] selectionSortInt(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int smallest = list[i];
            int smallest_i = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j] < smallest) {
                    smallest = list[j];
                    smallest_i = j;
                }
            }
            int tmp = list[i];
            list[i] = smallest;
            list[smallest_i] = tmp;
        }
        return list;
    }

    public int[] bubbleSortInt(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i-1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = tmp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }

    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        return arr;
    }
}
