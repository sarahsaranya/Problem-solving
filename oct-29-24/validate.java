class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class validate {

    static boolean find(Node node, Node k) {
        if (node == null && k == null) {
            return true;
        }

        return (find(node.left, k.left) && find(node.right, k.right));

    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.left = new Node(7);
        node.right = new Node(15);
        node.left.left = new Node(4);
        node.left.right = new Node(9);
        node.right.right = new Node(20);

        Node y = new Node(100);
        y.left = new Node(70);
        y.right = new Node(150);
        y.left.left = new Node(40);
        y.left.right = new Node(90);
        y.right.right = new Node(200);
        if (find(node, y)) {
            System.out.print("same");
        } else {
            System.out.print("no");
        }
    }
}
