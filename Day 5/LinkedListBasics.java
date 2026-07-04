
public class LinkedListBasics {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    static Node head;

    static void DeleteAtEnd() {
        if (head == null) {
            return;
        }
        Node temp = head;
        if (temp.next == null) {
            head = null;
            return;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    static int CountNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;

            temp = temp.next;

        }
        return count;
    }

    static boolean Search(int key) {

        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;

        }
        return false;
    }

    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        DeleteAtEnd();

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" ");
        int result = CountNodes();
        System.out.println("Number Of Nodes " + result);
        System.out.println(" ");
        System.out.println(Search(20));
    }
}
