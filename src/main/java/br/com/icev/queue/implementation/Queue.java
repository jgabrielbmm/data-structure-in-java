package br.com.icev.queue.implementation;

import java.util.Arrays;

public class Queue {
    private Integer[] queue;
    private int rear;
    private int front;
    private int size;
    private int maxCapability;

    public Queue(int capability) {
        this.maxCapability = capability;
        this.queue = new Integer[capability];
        this.rear = 0;
        this.front = 0;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int item){
        if (maxCapability == size){
            throw new Error("Queue is full!");
        }
        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new Error("Queue is empty");
        }
        int aux = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        size--;
        return aux;
    }

    public int peek(){
        if(isEmpty()){
            throw new Error("Queue is empty");
        }

        return queue[front];
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "{"
                + Arrays.toString(queue) +
                ", rear=" + rear +
                ", front=" + front +
                ", size=" + size +
                ", maxCapability=" + maxCapability +
                '}';
    }
}
