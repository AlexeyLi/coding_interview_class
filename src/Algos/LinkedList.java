package Algos;

public class LinkedList {

    public ListNode head = null;
    public ListNode tail = null;

    public void printLinkedList() {
        ListNode tmp = head;
        System.out.println();
        while(tmp != null) {
            System.out.print(tmp.val + " => ");
            tmp = tmp.next;
        }
        System.out.print("null");
        System.out.println();

        // TIME: O(n)
    }

    public void addNode(int val) {
        if (head == null) {
            ListNode tmp = new ListNode(val);
            head = tmp;
            tail = tmp;
        } else {
            tail.next = new ListNode(val);
            tail = tail.next;
        }

        // TIME: O(1)
    }

    public void addNodeAtStart(int val) {
        if (head == null) {
            ListNode tmp = new ListNode(val);
            head = tmp;
            tail = tmp;
        } else {
            ListNode tmp = new ListNode(val);
            tmp.next = head;
            head = tmp;
        }

        // TIME: O(1)
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
