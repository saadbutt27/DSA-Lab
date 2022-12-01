public class Main {
    public static void main(String[] args) {

//       Doubly Linked List Main
        System.out.println("Doubly Linked List");
        DoublyLinkedList list = new DoublyLinkedList();
        int count = 5;
        for (int i=0; i<10; i++) {
            list.insertNode(count);
            count += 10;
        }
        System.out.println("Traversing and printing nodes in doubly linked list");
        list.traverseList();

        System.out.println("Traversing and printing nodes in the doubly linked list in reverse order");
        list.traverseListReverse();

        System.out.println("Searching specific node in doubly linked list");
        list.searchNode(75);

        System.out.println("Searching specific node in doubly linked list through two way search");
        int key = 55;
        System.out.println("Key to search = " + key);
        System.out.println(!(list.twoWaySearch(key)) ? "Not found!" : "Found");
        key = 101;
        System.out.println("Key to search = " + key);
        System.out.println(!(list.twoWaySearch(key)) ? "Not found!" : "Found");

        System.out.println("Updating data value of a targeted node in doubly linked list");
        list.updateNode(45, 50);
        list.traverseList();

        System.out.println("Inserting a new node in doubly linked list at a given position");
        list.insertNodeAt(80, 6);
        list.traverseList();

        System.out.println("Combining two doubly linked list into one");
        DoublyLinkedList list2 = new DoublyLinkedList();
        int count2 = 6;
        for (int i=0; i<10; i++) {
            list2.insertNode(count2);
            count2 += 10;
        }
        System.out.println("List 1");
        list.traverseList();
        System.out.println("List 2");
        list2.traverseList();
        list.combineTwoLists(list, list2);
        System.out.println("Combined List");
        list.traverseList();
        System.out.println("List after combining in previous order");
        list.traverseListReverse();

        System.out.println("Deleting a node from doubly linked list");
        System.out.println((list.deleteNode(80)) ? "Node Deleted" : "Node doesn't exist");
        list.traverseList();

//        Singly Linked List Main
        System.out.println("\nSingly Linked List");
        SingleLinkedList listS = new SingleLinkedList();
        count = 5;
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
