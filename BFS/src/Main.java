

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Node> graph;
    public static ArrayList<Node> explored = new ArrayList<>();
    public static ArrayList<Node> queue = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        initializeQueue(1);
        BFS();
        System.out.println(explored);

    }

    private static void BFS() {
        if (queue.size() != 0) {
            Node node = queue.get(0);
            queue.remove(0);
            explored.add(node);
            ArrayList<Integer> points = (ArrayList<Integer>) node.getNodes();
            for (Integer point : points) {
                for (Node node1 : graph) {
                    if(node1.getKey() == point && !node1.isVisited()){
                        node1.setVisited(true);
                        queue.add(node1);
                    }
                }
            }
            BFS();
        }
    }
    private static void initializeQueue(int num){
        for (Node node : graph){
            if (node.getKey() == num){
                node.setVisited(true);
                queue.add(node);

            }
        }
    }

    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("tree.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}
