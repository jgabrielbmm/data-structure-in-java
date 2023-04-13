package br.com.icev.linkedlist.implementation;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private Integer size = 0;

    private LinkedList<T> list = new LinkedList<>();

    private void addInHead(T value){
        Node <T> cell = new Node<>(value);
        if (size == 0) {
            head = cell;
            tail = cell;
            size++;
            return;
        }

        cell.setNext(cell);
        head = cell;
        size++;
    }

    private void addInTail(T value) {
        Node <T> cell = new Node<>(value);
        tail.setNext(cell);
        tail = cell;
        size++;
    }

    private void addInTheMiddle(T value, int position){
        Node<T> cell = new Node<>(value);
        Node<T> aux = head;
        for(int i = 0; i < position; i++){
            aux = aux.getNext();
        }
        cell.setNext(aux.getNext());
        aux.setNext(cell);
        size++;
    }

    public void add (T value, int position) {
        if(position == 0 || size == 0){
            list.addInHead(value);
        } else if (position == size) {
            list.addInTail(value);
        } else if (position > 0 && position < size) {
            list.addInTheMiddle(value, position);
        } else {
            System.out.println("");
        }
    }

    public Integer getSize() {
        return size;
    }
}
