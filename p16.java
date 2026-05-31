public class p16 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Insert into BST
    static Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Inorder Traversal
    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Search in BST
    static boolean search(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }

    // Find Minimum Value
    static int findMin(Node root) {

        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }

        while (root.left != null) {
            root = root.left;
        }

        return root.data;
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 15);
        root = insert(root, 2);
        root = insert(root, 20);

        System.out.print("Inorder Traversal: ");
        inorder(root);

        System.out.println();

        System.out.println("Search 15: " + search(root, 15));
        System.out.println("Search 100: " + search(root, 100));

        System.out.println("Minimum Value: " + findMin(root));
    }
}