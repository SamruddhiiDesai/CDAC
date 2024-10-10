
import java.util.Scanner;

class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class KthLinkedList {
    Node head;

    // Function to add a new node at the end of the list
    public void addNode(int data) {
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

    // Function to find the kth node in the list
    public Node getKthNode(int k) {
        Node current = head;
        int count = 1;

        // Traverse the list
        while (current != null) {
            if (count == k) {
                return current; // Kth node found
            }
            count++;
            current = current.next;
        }

        return null; // Kth node does not exist if k is out of range
    }

    // Function to display the list
    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class KthNodeLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       KthLinkedList list = new KthLinkedList();

        // Input number of elements in the list
        System.out.print("Enter number of nodes in the linked list: ");
        int n = sc.nextInt();

        // Input elements for the linked list
        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.addNode(value);
        }

        // Display the linked list
        System.out.println("Linked List:");
        list.displayList();

        // Input value of k
        System.out.print("Enter the value of k to find the kth node: ");
        int k = sc.nextInt();

        // Find the kth node
        Node kthNode = list.getKthNode(k);

        if (kthNode != null) {
            System.out.println("The " + k + "th node in the list is: " + kthNode.data);
        } else {
            System.out.println("The " + k + "th node does not exist in the list.");
        }

        sc.close();
    }
}
