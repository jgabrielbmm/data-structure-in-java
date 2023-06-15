package br.com.icev.graph;

import java.util.ArrayList;

public class Vertex<T>{
    private T data;
    private ArrayList<Edge<T>> inputEdges;
    private ArrayList<Edge<T>> outputEdges;
    public Vertex(T value){
        this.data = value;
        this.inputEdges = new ArrayList<>();
        this.outputEdges = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void addInputEdges(Edge<T> edge){
        this.inputEdges.add(edge);
    }

    public void addOutputEdges(Edge<T> edge){
        this.outputEdges.add(edge);
    }

    public ArrayList<Edge<T>> getInputEdges() {
        return inputEdges;
    }

    public void setInputEdges(ArrayList<Edge<T>> inputEdges) {
        this.inputEdges = inputEdges;
    }

    public ArrayList<Edge<T>> getOutputEdges() {
        return outputEdges;
    }

    public void setOutputEdges(ArrayList<Edge<T>> outputEdges) {
        this.outputEdges = outputEdges;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                data +
                '}';
    }
}
