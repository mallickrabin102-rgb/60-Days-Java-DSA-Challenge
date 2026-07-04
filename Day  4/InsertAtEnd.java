public class InsertAtEnd {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static void insertAtEnd(int data) {
Node newNode = new Node(data);
if (head == null) {
    head = newNode;
    return;
}
Node temp = head;
while (temp.next!=null) {
    temp = temp.next;
}
temp.next= newNode;
    }

    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        insertAtEnd(40);
Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
