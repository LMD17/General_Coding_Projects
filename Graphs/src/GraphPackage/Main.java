package GraphPackage;
//Imports from net.datastructures package inJAR file
import net.datastructures.AdjacencyMapGraph;
import net.datastructures.Edge;
import net.datastructures.Vertex;

public class Main {
    public static void main(String[] args) {

        AdjacencyMapGraph flight = new AdjacencyMapGraph(true);

        //create the vertices
        //use the created object 'flight'
        Vertex<String> bos = flight.insertVertex("BOS");
        Vertex<String> jfk = flight.insertVertex("JFK");
        Vertex<String> mia = flight.insertVertex("MIA");
        Vertex<String> sfo = flight.insertVertex("SFO");
        Vertex<String> dfw = flight.insertVertex("DFW");
        Vertex<String> ord = flight.insertVertex("ORD");
        Vertex<String> lax = flight.insertVertex("LAX");

        //insert the edges between the vertices
        Edge<String> NW35 = flight.insertEdge(bos, jfk, "NW35");
        Edge<String> DL247 = flight.insertEdge(bos, mia, "DL247");
        Edge<String> AA903 = flight.insertEdge(jfk, mia, "AA903");
        Edge<String> AA1387 = flight.insertEdge(jfk, dfw, "AA1387");
        Edge<String> SW45 = flight.insertEdge(jfk, sfo, "SW45");
        Edge<String> AA523 = flight.insertEdge(mia, dfw, "AA523");
        Edge<String> AA411 = flight.insertEdge(mia, lax, "AA411");
        Edge<String> DL335 = flight.insertEdge(dfw, ord, "DL335");
        Edge<String> AA49 = flight.insertEdge(dfw, lax, "AA49");
        Edge<String> UA877 = flight.insertEdge(ord, dfw, "UA877");
        Edge<String> UA120 = flight.insertEdge(lax, ord, "UA120");

        //Display the vertices in the graph 'flight'
        Iterable<Vertex<String>> vertices = flight.vertices();
        System.out.println("Vertices of the graph");
        for (Vertex<String> v : vertices){
            System.out.println(v.getElement());
        }

        //Display the edges in the graph 'flight'
        Iterable<Edge<String>> edge = flight.edges();
        System.out.println("\nEdges of the graph");
        for (Edge<String> e : edge){
            System.out.println(e.getElement());
        }

        //The number of vertices in the graph
        System.out.println("\nNumber of vertices in graph: " + flight.numVertices());
        //The number of edges in the graph
        System.out.println("Number of edges in graph: " + flight.numEdges());

        /////There are a lot more methods that we can do on the AdjacencyMapGraph object 'flights'
        flight.outgoingEdges(dfw);  //outgoing edges of dfw

    }
}

//QUESTION
//Implement the following graph:

//Flights
//FORMAT: depart > flight > arrive
//BOS > NW35 > JFK
//BOS > DL247 > MIA
//JFK > AA903 > MIA
//JFK > AA1387 > DFW
//JFK > SW45 > SFO
//MIA > AA523 > DFW
//MIA > AA411 > LAX
//DFW > DL335 > ORD
//DFW > AA49 > LAX
//ORD > UA877 > DFW
//LAX > UA120 > ORD