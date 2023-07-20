class Node {
    Node left,right;
    int data;
    public Node(int data) {
        this.data=data;
        left=right=null;
    }
 }
public class BinarySearchTree {
    Node root;
    public int data;
    public BinarySearchTree leftChild,rightChild;
    public BinarySearchTree() {
        root=null;
    }
    void insert(int data) {
        root=insertRecursive(root,data);
    }
    Node insertRecursive(Node root,int data) {
        if(root==null) {
            root=new Node(data);
            return root;
        }
        if(data<root.data) {
            root.left=insertRecursive(root.left,data);
        }
        else if(data>root.data) {
            root.right=insertRecursive(root.right,data);
        }
        return root;
    }
    void delete(int d) {
        root= recursivedelete(root,d);
    }
    Node recursivedelete(Node root,int d) {
        if(root==null) {
            return root;
        }
        if(root.data>d){
            root.left=recursivedelete(root.left,d);
            return root;
        }
        else if(root.data<d) {
            root.right=recursivedelete(root.right,d);
            return root;
        }
        if (root.left == null) {
            Node temp = root.right;
            return temp;
        } else if (root.right == null) {
            Node temp = root.left;
            return temp;
        }
 
        // If both children exist
        else {
 
            Node succParent = root;
 
            // Find successor
            Node succ = root.right;
            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }
            if (succParent != root)
            succParent.left = succ.right;
        else
            succParent.right = succ.right;

        // Copy Successor Data to root
        root.data = succ.data;

        // Delete Successor and return root
        return root;
    }
    }
    void preorder(Node root) {
        if(root!=null) {
            System.out.println(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(Node root) {
         if(root!=null) {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data+" ");
        }
    }
    void inorder(Node root) {
         if(root!=null) {
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(5);
        bst.insert(9);
        bst.insert(10);
        bst.insert(2);
        bst.insert(15);
        bst.delete(10);
       // bst.preorder(bst.root);
       // bst.postorder(bst.root);
        bst.inorder(bst.root);
    }
}
