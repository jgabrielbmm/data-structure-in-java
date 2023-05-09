package br.com.icev.linkedlist;

import br.com.icev.linkedlist.implementation.LinkedList;
import br.com.icev.linkedlist.implementation.Node;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1, 0);
        list.add(4, 0);
        list.add(99, 0);
        list.add(5, 0);
        list.add(2, 0);
        list.add(9, 0);
        list.add(55, 0);
        list.add(11, 0);
        list.add(67, 0);
        System.out.println(list);

        list.reverseLinkedList();


        System.out.println(list);
    }


}
