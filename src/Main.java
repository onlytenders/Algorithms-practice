import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,6,2,5,7};

        Sorter sort = new Sorter();
        arr = sort.insertionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
