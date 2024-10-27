class Node {
    int data;
    Node next;

    Node(int new_Data) {
        data = new_Data;
        next = null;
    }
}

class reverseLL {

    static Node reverse(Node head) {
        Node curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = reverse(head);
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }

    }
}
