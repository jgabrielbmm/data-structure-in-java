package br.com.icev.stack.implementation;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

public class Stack <T> {
    protected final T[] arr;
    protected T top;
    protected final int  maxCapability;
    protected int size = 0;


    public Stack(Class<T> clazz, int capacity) {
        arr = (T[]) Array.newInstance(clazz,capacity);
        maxCapability = capacity;
    }

    private void maxCapabilityError(){
        throw new StackOverflowError(String.format("Stack already reach its max capability, max capability is %s.", maxCapability));
    }

    private void stackIsEmptyError(){
        throw new EmptyStackException();
    }

    public void push(T element){

        if(size == maxCapability){
            maxCapabilityError();
        }

        arr[size] = element;
        top = arr[size];
        size++;
    }

    public T pop(){
        if(isEmpty()){
            stackIsEmptyError();
        }

        T removedElement = arr[size -1];
        arr[size - 1] = null;

        if(size == 1) {
            top = null;
        } else {
            top = arr[size - 2];
        }
        size--;
        return removedElement;
    }

    public T peek(){
        if(isEmpty()){
            stackIsEmptyError();
        }

        return top;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        if (size == 0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        for(int i = 0; i < size -1; i++){
            builder.append(arr[i]);
            builder.append(",");
        }

        builder.append(arr[size -1]);

        builder.append("]");

        return builder.toString();
    }
}
