package br.com.icev.stack.implementation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack <T> {
    private T[] arr;
    private T top;
    private int maxCapability;
    private int size = 0;

    private int topIndex;

    public Stack(Class<T> clazz, int capacity) {

        arr = (T[]) Array.newInstance(clazz,capacity);
        maxCapability = capacity;
    }

    private void maxCapabilityError(){
        throw new StackOverflowError(String.format("Stack already reach its max capability, max capability is %s.", maxCapability));
    }

    private void stackIsVoidError(){
        throw new ArrayIndexOutOfBoundsException("Stack is void.");
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
        if(size == 0){
            stackIsVoidError();
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

    public T top(){
        return arr[size -1];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "arr=" + Arrays.toString(arr) +
                ", top=" + top +
                ", size=" + size +
                '}';
    }
}
