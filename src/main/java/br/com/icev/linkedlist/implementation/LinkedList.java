package br.com.icev.linkedlist.implementation;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private Integer size = 0;

    private void CheckIndexOfRange(Integer index){
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
    }

    private void addInHead(T value){
        Node <T> cell = new Node<>(value);
        if (size == 0) {
            head = cell;
            tail = cell;
            size++;
            return;
        }
        cell.setNext(head);
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
        for(int i = 0; i < position -1; i++){
            aux = aux.getNext();
        }
        cell.setNext(aux.getNext());
        aux.setNext(cell);
        size++;
    }

    public void add (T value, int position) {
        CheckIndexOfRange(position);
        if(position == 0){
            addInHead(value);
            System.out.println("Entrei no 0");
        }
        else if( position == size){
            addInTail(value);
            System.out.println("Entrei no 1");
        }
        else{
            addInTheMiddle(value, position);
            System.out.println("Entrei no 2");
        }

    }

//    public void push(int position){
//        for(T current : list){
//            System.out.println(current);
//        }
//    }
    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {

        if(size == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        Node<T> current = head;

        for (int i = 0; i < size - 1; i++) {
            builder.append(current.getValue()).append(",");
            current = current.getNext();
        }

        builder.append(current.getValue()).append("]");

        return builder.toString();
    }
}
