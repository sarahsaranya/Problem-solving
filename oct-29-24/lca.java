class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class lca {

    static Node find(int a, int b, Node node) {
        if (node == null)
            return null;
        if (node.data > a && node.data > b) {
            return find(a, b, node.left);
        }
        if (node.data < a && node.data < b) {
            return find(a, b, node.right);
        }
        return node;
    }

    public static void main(String[] args) {
        Node node = new Node(20);
        node.left = new Node(8);
        node.right = new Node(22);
        node.left.left = new Node(4);
        node.left.right = new Node(12);
        node.left.right.left = new Node(10);
        node.left.right.right = new Node(14);

        int a = 10, b = 14;
        System.out.print("lca of " + a + " and " + b + " is " + find(a, b, node).data);

    }
}
