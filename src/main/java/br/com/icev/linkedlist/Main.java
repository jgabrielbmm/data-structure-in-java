package br.com.icev.linkedlist;

import br.com.icev.linkedlist.implementation.LinkedList;
import br.com.icev.linkedlist.implementation.Node;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1, 0);
        list.push(0);
        list.push(0);
        System.out.println(list);
    }
}
