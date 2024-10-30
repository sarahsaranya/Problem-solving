
class preordertraversal {

    static void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + "->");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);

        preorder(node);
    }
}
