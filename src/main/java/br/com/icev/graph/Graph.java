package br.com.icev.graph;

import java.util.ArrayList;

public class Graph <T> {
    private ArrayList<Vertex<T>> vertices;
    private ArrayList<Edge<T>> edges;

    public Graph() {
        this.vertices = new ArrayList<Vertex<T>>();
        this.edges = new ArrayList<Edge<T>>();
    }

    public void addVertex(T data){
        Vertex<T> newVertex = new Vertex<T>(data);
        this.vertices.add(newVertex);
    }

    public void addEdge (Double weight, T dataFrom, T dataTo){
        Vertex<T> from = this.getVertex(dataFrom);
        Vertex<T> to = this.getVertex(dataTo);
        Edge<T> edge = new Edge<T>(weight, from, to);
        from.addOutputEdges(edge);
        to.addInputEdges(edge);
        this.edges.add(edge);
    }

    public Vertex<T> getVertex(T data){
        Vertex<T> vertex = null;
        for (int i = 0; i < this.vertices.size(); i++){
            if(this.vertices.get(i).getData().equals(data)){
                vertex = this.vertices.get(i);
                break;
            }
        }
        return  vertex;
    }

    public void breadthFirstSearch(){
        ArrayList<Vertex<T>> marked = new ArrayList<>();
        ArrayList<Vertex<T>> queue = new ArrayList<>();
        Vertex<T> current = this.vertices.get(0);
        marked.add(current);
        System.out.println(current.getData());
        queue.add(current);
        while (queue.size() > 0){
            Vertex<T> visited = queue.get(0);
            for( int i = 0; i < visited.getOutputEdges().size(); i++){
                Vertex<T> next = visited.getOutputEdges().get(i).getTo();
                if(!marked.contains(next)){
                    marked.add(next);
                    System.out.println(next.getData());
                    queue.add(next);
                }
            }

            queue.remove(0);
        }
    }

    public ArrayList<Vertex<T>> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Vertex<T>> vertices) {
        this.vertices = vertices;
    }

    public ArrayList<Edge<T>> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge<T>> edges) {
        this.edges = edges;
    }
}
