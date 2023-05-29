package br.com.icev.queue;

import br.com.icev.queue.implementation.Queue;
import br.com.icev.stack.implementation.MathExpressionVerificationStack;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(14);
        queue.enqueue(17);

        queue.dequeue();

        queue.enqueue(1);
        queue.enqueue(8);

        queue.dequeue();
        queue.enqueue(12);

        System.out.println(queue);
    }
}
