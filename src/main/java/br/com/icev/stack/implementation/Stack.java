package br.com.icev.stack.implementation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack <T> {
    private T[] arr;
    private T top;

    private int size;

    public Stack(Class<T> clazz, int capacity) {
        arr = (T[]) Array.newInstance(clazz,capacity);
    }

    public void push(T element){
        if(size == 0){
            arr[0] = element;
            size++;
            top = arr[0];
            return;
        }

        arr[size] = element;
        top = arr[size];
        size++;
    }

    public T pop(){
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
