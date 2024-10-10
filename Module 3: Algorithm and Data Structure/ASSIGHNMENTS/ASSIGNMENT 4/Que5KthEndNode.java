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

class KthEndNode {
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

    // Function to find the nth node from the end
    public int findNthFromEnd(int n) {
        Node first = head;
        Node second = head;

        // Move the first pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (first == null) {
                // If n is larger than the number of nodes
                return -1; // Handle invalid input
            }
            first = first.next;
        }

        // Move both pointers until the first pointer reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // The second pointer is now at the nth node from the end
        return second.data;
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

public class Que5KthEndNode {
    public static void main(String[] args) {
        KthEndNode list = new KthEndNode(); // Corrected class name
        Scanner sc = new Scanner(System.in);

        // Input: List elements
        System.out.print("Enter the number of elements in the list: ");
        int numElements = sc.nextInt();

        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < numElements; i++) {
            list.addNode(sc.nextInt());
        }

        // Display the list
        System.out.print("The linked list is: ");
        list.displayList();

        // Input: nth node to find from the end
        System.out.print("Enter the value of n (to find the nth node from the end): ");
        int n = sc.nextInt();

        // Find and print the nth node from the end
        int result = list.findNthFromEnd(n);
        if (result == -1) {
            System.out.println("Invalid input: n is greater than the length of the list.");
        } else {
            System.out.println("The " + n + "th node from the end is: " + result);
        }
    }
}
