package com.github.hcsp;

public class Main {
    public static void main(String[] args) {
        // Complete createLinkedList() method to make the program output "1,2,3"
        // 补全createLinkedList()使得程序输出"1,2,3"
        LinkedListNode head = createLinkedList();
        System.out.println("" + head.value + "," + head.next.value + "," + head.next.next.value);
    }

    // Create a linked list: 1 -> 2 -> 3 and return the head node
    // 创建一个这样的链表：1 -> 2 -> 3 并返回头节点
    public static LinkedListNode createLinkedList() {
        // 初始化三个节点
        LinkedListNode node1 = new LinkedListNode();
        node1.value = 1;
        LinkedListNode node2 = new LinkedListNode();
        node2.value = 2;
        LinkedListNode node3 = new LinkedListNode();
        node3.value = 3;

        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        return node1;
    }
}
