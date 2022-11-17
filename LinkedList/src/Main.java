public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        int count = 5;
        for (int i=0; i<10; i++) {
            list.insertNode(count);
            count += 10;
        }

        System.out.println("Traversing and printing nodes in the linked list");
        list.traverseList();
        System.out.println("\nTraversing and printing nodes in the linked list in reverse order");
        list.traverseListReverse(list.head);

        System.out.println("\nSearching specific node in the linked list");
        list.searchNode(25);

        System.out.println("\nUpdating data value of a targeted node in linked list");
        list.updateNode(45, 50);
        list.traverseList();

        Node n1 = new Node(30);
        System.out.println("\nUpdating a node in the linked list after specific data");
        list.insertNodeAfter(55,n1);
        list.traverseList();

        Node n2 = new Node(30);
        System.out.println("\nInserting a node in the linked list before specific data");
        list.insertNodeBefore(5, n2);
        list.traverseList();

        System.out.println("\nDeleting a node in the linked list");
        list.deleteNode(65);
        list.traverseList();


    }
}