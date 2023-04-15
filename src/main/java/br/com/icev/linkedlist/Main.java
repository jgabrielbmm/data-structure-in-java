package br.com.icev.linkedlist;

import br.com.icev.linkedlist.implementation.LinkedList;
import br.com.icev.linkedlist.implementation.Node;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1, 0);
        list.add(4, 1);
        list.add(7, 2);
        list.add(11, 0);
        list.add(65, 2);
        System.out.println(list.getSize());
        System.out.println(list);
    }
}
