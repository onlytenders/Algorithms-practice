import java.util.*;

public class Dijkstra {
    public int weightedSearch(GraphConnection[] graph, String st, String fin) {
        String pointer;
        Queue<String> queue = new LinkedList<>();
        ArrayList<String> checked = new ArrayList<>();
        Hashtable<String, Integer> costs = new Hashtable<>();
        Hashtable<String, String> parents = new Hashtable<>();

        queue.add(st);
        for (GraphConnection i : graph) {
            if (i.node1.equals(st)) {
                costs.put(st, 0);
            } else {
                costs.put(i.node1, Integer.MAX_VALUE);
                costs.put(i.node2, Integer.MAX_VALUE);
            }
        }

        while (!queue.isEmpty()) {
            pointer = queue.remove();
            Hashtable<Integer, String> values = new Hashtable<>();

            for (GraphConnection i : graph) {
                boolean isChecked = false;
                for (Object j : checked.toArray()) {
                    if (j == i.node1) {
                        isChecked = true;
                    }
                }

                if (i.node1.equals(pointer) && !isChecked) {
                    int new_cost = costs.get(i.node1) + i.weight;
                    if (new_cost < costs.get(i.node2)) {
                        costs.put(i.node2, new_cost);
                        parents.put(i.node2, i.node1);
                        values.put(i.weight, i.node2);
                    }
                }
            }
            List<Integer> keys = new ArrayList<>(values.keySet());
            Collections.sort(keys);

            for (int i : keys) {
                queue.add(values.get(i));
            }

            checked.add(pointer);
        }
        String some = fin;
        while (true) {
            System.out.println(parents.get(some));
            some = parents.get(some);
            if (some.equals(st)) {
                break;
            }
        }
        return costs.get(fin);
    }
}
