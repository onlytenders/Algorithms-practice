public class Main {
    public static void main(String[] args) {
        GraphConnection[] graph = {
                new GraphConnection("S", "A", 4),
                new GraphConnection("S", "C", 8),
                new GraphConnection("S", "D", 2),
                new GraphConnection("A", "B", 7),
                new GraphConnection("A", "C", 5),
                new GraphConnection("D", "C", 5),
                new GraphConnection("D", "E", 3),
                new GraphConnection("C", "B", 3),
                new GraphConnection("C", "F", 6),
                new GraphConnection("C", "E", 7),
                new GraphConnection("B", "F", 2),
                new GraphConnection("E", "F", 8)
        };

        Dijkstra algo = new Dijkstra();
        int result = algo.weightedSearch(graph, "S", "F");
        System.out.println(result);
    }
}
