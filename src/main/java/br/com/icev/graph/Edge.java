package br.com.icev.graph;

public class Edge<T> {
    private Double weight;
    private Vertex<T> from;
    private Vertex<T> to;


    public Edge(Double weight, Vertex<T> from, Vertex<T> to) {
        this.weight = weight;
        this.from = from;
        this.to = to;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Vertex<T> getFrom() {
        return from;
    }

    public void setFrom(Vertex<T> from) {
        this.from = from;
    }

    public Vertex<T> getTo() {
        return to;
    }

    public void setTo(Vertex<T> to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "weight=" + weight +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
