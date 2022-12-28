public class Main {
    public static void main(String[] args) {
        System.out.println("Singly Linked List");
        SingleLinkedList list = new SingleLinkedList();
        SingleLinkedList list2 = new SingleLinkedList();
        int count = 10;
        for (int i=0; i<10; i++) {
            list2.insertNode(count);
            count += 10;
        }

        list.insertNode(1);
        list.insertNode(11);
        list.insertNode(3);
        list.insertNode(12);
        list.insertNode(5);
        list.insertNode(13);
        list.insertNode(7);

//        System.out.println("Traversing and printing nodes in the linked list");
        System.out.println("List before:");
        list.traverseList();
//        list.swapNodes(0,70);
        list.arrangeOrder();
        System.out.println("List after ");
        list.traverseList();


        System.out.println();
        System.out.println("List before:");
        list2.traverseList();
        list2.arrangeOrder();
        System.out.println("List after ");
        list2.traverseList();
//        System.out.println("Traversing and printing nodes in the linked list in reverse order");
//        list.traverseListReverse(listS.head);
//        System.out.println();
//
//        System.out.println("Searching specific node in the linked list");
//        list.searchNode(25);
//
//        System.out.println("Updating data value of a targeted node in linked list");
//        list.updateNode(45, 50);
//        list.traverseList();
//
//        Node n1 = new Node(30);
//        System.out.println("Updating a node in the linked list after specific data");
//        list.insertNodeAfter(55,n1);
//        list.traverseList();
//
//        Node n2 = new Node(30);
//        System.out.println("Inserting a node in the linked list before specific data");
//        list.insertNodeBefore(5, n2);
//        list.traverseList();
//
//        System.out.println("Deleting a node in the linked list");
//        list.deleteNode(65);
//        list.traverseList();
    }
}