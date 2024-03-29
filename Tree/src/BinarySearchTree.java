public class BinarySearchTree {
    //  Traversing --> In Order(Ascending) L root R // Pre Order Root L R // Post Order L R root
    Node root;

    BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
            return;
        }
        Node current = root;
        Node prev = current;
        while (current != null) {
            prev = current;
            if (current.data < data) {
                current = current.right;
            } else if (current.data > data) {
                current = current.left;
            }
        }
        if (prev.data < data) {
            prev.right = n;
        } else {
            prev.left = n;
        }
    }

    public void inOrder(Node n) {
        if (n != null) {
            inOrder(n.left);
            System.out.print(n.data + ", ");
            inOrder(n.right);
        }
    }

    public void preOrder(Node n) {
        if (n != null) {
            System.out.print(n.data + ", ");
            preOrder(n.left);
            preOrder(n.right);
        }
    }

    public void postOrder(Node n) {
        if (n != null) {
            postOrder(n.left);
            postOrder(n.right);
            System.out.print(n.data + ", ");
        }
    }

    public boolean search(int key) {
        Node current  = root;
        while (current != null) {
            if (current.data == key) {
                return true;
            } else if (current.data > key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;

    }

    public Node leftMost (Node l) {
        while (l.left != null) {
            l = l.left;
        }
        return l;
    }

    public Node rightMost (Node r) {
        while (r.right != null) {
            r = r.right
            ;
        }
        return r;
    }


}
