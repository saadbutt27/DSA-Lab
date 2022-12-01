public class Main {
    public static void main(String[] args) {
        System.out.println("Singly Linked List");
        SingleLinkedList listS = new SingleLinkedList();
        int count = 0;
        for (int i=0; i<10; i++) {
            listS.insertNode(count);
            count += 10;
        }

        System.out.println("Traversing and printing nodes in the linked list");
        listS.traverseList();
        System.out.println("Traversing and printing nodes in the linked list in reverse order");
        listS.traverseListReverse(listS.head);
        System.out.println();

        System.out.println("Searching specific node in the linked list");
        listS.searchNode(25);

        System.out.println("Updating data value of a targeted node in linked list");
        listS.updateNode(45, 50);
        listS.traverseList();

        Node n1 = new Node(30);
        System.out.println("Updating a node in the linked list after specific data");
        listS.insertNodeAfter(55,n1);
        listS.traverseList();

        Node n2 = new Node(30);
        System.out.println("Inserting a node in the linked list before specific data");
        listS.insertNodeBefore(5, n2);
        listS.traverseList();

        System.out.println("Deleting a node in the linked list");
        listS.deleteNode(65);
        listS.traverseList();
    }
}