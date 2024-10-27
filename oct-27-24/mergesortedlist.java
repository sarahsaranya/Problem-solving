import java.util.ArrayList;
import java.util.Collections;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

class mergesortedlist {
    static Node merge(Node a, Node b) {
        ArrayList<Integer> aa = new ArrayList<>();
        while (a != null) {
            aa.add(a.data);
            a = a.next;
        }
        while (b != null) {
            aa.add(b.data);
            b = b.next;
        }
        Collections.sort(aa);
        Node temp = new Node(-1);
        Node head = temp;
        for (int v : aa) {
            temp.next = new Node(v);
            temp = temp.next;
        }
        head = head.next;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(6);
        a.next = new Node(7);
        a.next.next = new Node(8);

        Node b = new Node(1);
        b.next = new Node(2);
        b.next.next = new Node(3);

        Node u = merge(a, b);
        while (u != null) {
            System.out.print(u.data + "->");
            u = u.next;
        }

    }
}
