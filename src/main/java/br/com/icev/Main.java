package br.com.icev;

import br.com.icev.graph.Graph;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        graph.addVertex("João");
        graph.addVertex("Lorenzo");
        graph.addVertex("Creuza");
        graph.addVertex("Creber");
        graph.addVertex("Craudio");

        graph.addEdge(2.0, "João", "Lorenzo");
        graph.addEdge(5.0, "Lorenzo", "Creber");
        graph.addEdge(4.0, "Creber", "Creuza");
        graph.addEdge(5.0, "João", "Creuza");
        graph.addEdge(1.0, "Craudio", "Lorenzo");
        graph.addEdge(8.0, "Craudio", "João");

        graph.breadthFirstSearch();
    }
}
