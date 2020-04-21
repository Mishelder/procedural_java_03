package DoubleLinkedList;

public class DoubleNode {

    public int data;
    public DoubleNode next;
    public DoubleNode prev;

    public DoubleNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
