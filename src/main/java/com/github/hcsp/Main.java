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
        LinkedListNode head = new LinkedListNode();
        LinkedListNode mid = new LinkedListNode();
        LinkedListNode tail = new LinkedListNode();
        head.value = 1;
        head.next = mid;
        mid.value = 2;
        mid.next = tail;
        tail.value = 3;
        return head;
    }
}
