public class deleteAtBeginning {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static void DeleteAtBeginning(){
if (head==null) {
    return;
}
head = head.next;
    }
    public static void main(String[] args){
head = new Node(10);
head.next = new Node(20);
head.next.next = new Node(30);
DeleteAtBeginning();
Node temp = head;
while (temp!=null) {
    System.out.println(temp.data+" ");
    temp = temp.next;
}
    }
}
