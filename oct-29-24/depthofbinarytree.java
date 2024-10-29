
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class depthofbinarytree {
    static int maxDep(Node k) {
        if (k == null)
            return 0;

        int lD = maxDep(k.left);
        int rD = maxDep(k.right);
        return Math.max(lD, rD) + 1;
    }

    public static void main(String[] args) {
        Node k = new Node(1);
        k.left = new Node(2);
        k.right = new Node(3);
        k.left.left = new Node(4);
        k.left.right = new Node(5);
        System.out.print(maxDep(k));
    }
}
