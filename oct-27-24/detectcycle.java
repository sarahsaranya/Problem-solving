class Node {
    int data;
    Node next;
    Node left, right;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

class detectcycle {

    static boolean cycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        if (cycle(head)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
