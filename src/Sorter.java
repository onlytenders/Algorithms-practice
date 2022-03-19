import java.util.ArrayList;

public class Sorter {
    public ArrayList<Integer> selectionSortInt(ArrayList<Integer> list) {
        ArrayList<Integer> new_list = new ArrayList<>();
        int size = list.size();
        int prev_smallest = -1;
        for (int i = 0; i < size; i++) {
            int index = 0;
            int smallest = list.get(0);
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) < smallest && list.get(j) > prev_smallest) {
                    smallest = list.get(j);
                    index = j;
                }
            }
            list.remove(index);
            prev_smallest = smallest;
            new_list.add(smallest);
        }
        return new_list;
    }
}
