class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Insertion at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Merge two sorted linked lists
    private Node merge(Node left, Node right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        if (left.data <= right.data) {
            left.next = merge(left.next, right);
            return left;
        } else {
            right.next = merge(left, right.next);
            return right;
        }
    }

    // Merge sort algorithm for linked list
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        Node middle = findMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;
        
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);
        
        return merge(left, right);
    }

    // Helper method to find the middle of the linked list
    private Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class Sort {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(30);
        linkedList.insert(10);
        linkedList.insert(50);
        linkedList.insert(20);
        linkedList.insert(40);

        System.out.println("Linked List before sorting:");
        linkedList.display();

        linkedList.head = linkedList.mergeSort(linkedList.head);

        System.out.println("Linked List after sorting:");
        linkedList.display();
    }
}