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

    private void CheckIfListIsVoid(){
        if(size == 0){
            throw new IndexOutOfBoundsException("LinkedList is void");
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
        }
        else if( position == size){
            addInTail(value);
        }
        else{
            addInTheMiddle(value, position);
        }

    }


    private void removeInHead() {
        if(size == 1){
            head.setNext(null);
            tail = head;
            size--;
            return;
        }

        Node<T> current = head;
        head = current.getNext();
        current.setNext(null);
        size--;
    }

    private void removeInTail(){
        Node<T> aux = head;

        while(aux.getNext() != tail){
            aux = aux.getNext();
        }

        aux.setNext(null);
        size--;
    }

    private void removeInTheMiddle(int position){
        Node<T> aux = head;
        for(int i = 0; i < position - 1; i++){
            aux = aux.getNext();
        }
        Node<T> aux2 = aux.getNext();
        aux.setNext(aux2.getNext());
        size--;
    }

    public void push(int position){
        CheckIfListIsVoid();
        CheckIndexOfRange(position);
        if(position == 0){
            removeInHead();
        }
        else if( position == size){
            removeInTail();
        }
        else{
            removeInTheMiddle(position);
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public void reverseLinkedList(){
        Node<T> aux = head;
        tail = aux;
        if (aux.getNext() == null){
            return;
        }

        Node<T> referenceNode = aux.getNext();

        Node<T> auxChangeRef;

        while (referenceNode.getNext() != null){
            auxChangeRef = referenceNode;
            referenceNode = referenceNode.getNext();
            auxChangeRef.setNext(aux);
            aux = auxChangeRef;
            head = referenceNode;
        }

        head.setNext(aux);
    }


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