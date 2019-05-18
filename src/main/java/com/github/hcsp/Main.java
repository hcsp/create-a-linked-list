package com.github.hcsp;

public class Main {
    public static void main(String[] args) {
        // Complete createLinkedList() method to make the program output "1,2,3"
        // 补全createLinkedList()使得程序输出"1,2,3"
        LinkedListNode head = createLinkedList();
        System.out.println("" + head.value + "," + head.next.value + "," + head.next.next.value);
    }

    // Create a linked list: 1 -> 2 -> 3
    // 创建一个这样的链表：1 -> 2 -> 3
    public static LinkedListNode createLinkedList() {}
}
