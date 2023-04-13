package br.com.icev.linkedlist.implementation;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private Integer size = 0;

    public Integer getSize() {
        return size;
    }
}
