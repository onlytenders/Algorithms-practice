import java.util.ArrayList;

public class Searcher {
    public int binarySearchInt(ArrayList<Integer> list, int item) {
        int min = 0;
        int max = list.size()-1;
        System.out.println(max);
        int mid;

        while (max>=min) {
            System.out.println("new step");
            mid = Math.round((max + min)/2);
            if (list.get(mid) > item) {
                max = mid - 1;
            } else if (list.get(mid) < item) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
