public class bst {
    int value;
    bst leftChild;
    bst rightChild;

    bst(int val) {
        this.value = val;
        this.leftChild = null;
        this.rightChild = null;
    }

    public static bst insert(int value, bst current) {
        if (current == null) {
            bst newNode = new bst(value);
            return newNode;
        } else {
            if (value < current.value)
                current.leftChild = insert(value, current.leftChild);
            else
                current.rightChild = insert(value, current.rightChild);
        }
        return current;
    }

    public static boolean search(int key, bst current) {
        if (current == null)
            return false;
        if (current.value == key)
            return true;
        else {
            if (key < current.value)
                return search(key, current.leftChild);
            else
                return search(key, current.rightChild);
        }
    }

    public static void preorder(bst current) {
        if (current == null)
            return;
        else {
            System.out.print(current.value + " ");
            preorder(current.leftChild);
            preorder(current.rightChild);
        }
    }

    public static void postorder(bst current) {
        if (current == null)
            return;
        else {
            postorder(current.leftChild);
            postorder(current.rightChild);
            System.out.print(current.value + " ");
        }
    }

    public static void inorder(bst current) {
        if (current == null)
            return;
        else {
            inorder(current.leftChild);
            System.out.print(current.value + " ");
            inorder(current.rightChild);
        }
    }

    public static void main(String args[]) {
        // constructing the tree
        bst root = new bst(12);
        root = insert(7, root);
        root = insert(20, root);
        root = insert(5, root);
        root = insert(9, root);
        root = insert(21, root);
        System.out.println(search(7, root));
        System.out.println(search(9, root));

        // Traversals
        System.out.println("\n\nAfter deletion");
        System.out.print("\nPreorder Traversal: ");
        preorder(root);
        System.out.print("\nPostorder Traversal: ");
        postorder(root);
        System.out.print("\nInorder Traversal: ");
        inorder(root);
        System.out.print("\nLevel Order Traversal: ");
        // levelOrder(root);
    }
}
