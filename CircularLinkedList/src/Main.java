public class Main {
    public static void main(String[] args) {
        // BlockChain
        BlockChain block = new BlockChain();
        block.addBlock("Usman");
        block.addBlock("Saad");
        block.addBlock("Danial");
        block.addBlock("Yasir");
        block.addBlock("Rahim");

        block.traverseBlockChain();

        //Circular Linked List
        System.out.println("Circular Doubly Linked List");
        CircularLinkedList circularList = new CircularLinkedList();
        circularList.insertNode(5);
        circularList.insertNode(98);
        circularList.insertNode(32);
        circularList.insertNode(10);
        circularList.insertNode(66);
        circularList.insertNode(79);
        circularList.insertNode(2);
        System.out.println("Traversing and printing nodes in circular doubly linked list");
        circularList.traverse();
    }
}