public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        int count = 5;
        for (int i=0; i<10; i++) {
            list.insertNode(count);
            count += 10;
        }

        list.traverseList();
//
//        list.searchNode(25);
//
//        list.updateNode(45, 50);
//        list.traverseList();
//
//        Node n = new Node(30);
//        list.insertNodeAfter(55,n);
//        list.traverseList();

//        list.printListReverse(list.head);

        list.deleteNode(5);

        list.traverseList();

    }
}