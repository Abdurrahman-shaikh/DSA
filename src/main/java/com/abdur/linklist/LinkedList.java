package com.abdur.linklist;

public class LinkedList {

    static class Node {
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        Node p = node;
        p.next = new Node(2);
        p = p.next;
        p.next = new Node(3);

        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }
}
