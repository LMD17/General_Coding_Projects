//!!!!!!!!!!use ma'am's implementation for BreadthFirstSearch and DepthFirstSearch on MS Teams!!!!!!!!!!



package BreadthFirstSearch;

import net.datastructures.AdjacencyMapGraph;
import net.datastructures.Graph;
import net.datastructures.GraphAlgorithms;

public class Main {
    public static void main(String[] args) {
        //create Graph object
        GraphAlgorithms numbersGraph = new GraphAlgorithms(true);

        //add the vertices to the (undirected)graph
        numbersGraph.('1');
        numbersGraph.addVertex('2');
        numbersGraph.addVertex('3');
        numbersGraph.addVertex('4');
        numbersGraph.addVertex('5');
        numbersGraph.addVertex('6');

        //provide the edges to the graph
        numbersGraph.addEdge(0, 1);
        numbersGraph.addEdge(1, 2);
        numbersGraph.addEdge(0, 3);
        numbersGraph.addEdge(3, 4);
        numbersGraph.addEdge(4, 5);
        numbersGraph.addEdge(1, 3);

        //determine the number of visits
        numbersGraph.bfs();
        System.out.println("");
    }
}

// '1' = index 0
// '2' = index 1
// '3' = index 2
// '4' = index 3
// '5' = index 4
// '6' = index 5