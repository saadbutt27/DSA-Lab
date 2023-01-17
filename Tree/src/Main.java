public class Main {
    public static void main(String[] args) {
        System.out.println("Binary Search Tree");
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(19);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        bst.insert(21);
        bst.insert(15);
        bst.insert(4);

        bst.inOrder(bst.root);
        System.out.println();
        bst.preOrder(bst.root);
        System.out.println();
        bst.postOrder(bst.root);
        System.out.println();

        System.out.println(bst.search(100));
        System.out.println(bst.search(19));

        System.out.println(bst.leftMost(bst.root).data);
        System.out.println(bst.rightMost(bst.root).data);
    }
}