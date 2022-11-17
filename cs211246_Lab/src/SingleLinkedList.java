public class SingleLinkedList {
    public Node head;
    Node tail;

    public SingleLinkedList() {
        head = null;
        tail = null;
    }

    public void insertNode (int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            tail.next = n;
        }
        tail = n;
    }

    public void traverseList() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data + " " + temp.next);
            temp = temp.next;
        }
    }

    public void searchNode(int searchValue) {
        Node temp = head;
        boolean flag = false;
        while (temp.next != null) {
            if (temp.data == searchValue) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println(searchValue + " exists in the List at " + temp);
        } else {
            System.out.println(searchValue + " doesn't exist in List");
        }
    }

    public void updateNode(int searchValue, int newValue) {
        Node temp = head;
        boolean flag = false;
        while (temp.next != null) {
            if (temp.data == searchValue) {
                temp.data = newValue;
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println(searchValue + " updated at " + temp + " to " + newValue);
        } else {
            System.out.println(searchValue + " doesn't exist in List");
        }
    }

//    public void insertNodeBefore(int d, Node n) {
//        Node temp = head;
//        boolean flag = false;
//        while (temp.next != null) {
//            if (temp.data == d) {
//                flag = true;
//                break;
//            }
//            temp = temp.next;
//        }
//        if (flag) {
//            n.next = temp.next;
//            temp.next = n;
//        }
//    }

    public void insertNodeAfter(int d, Node n) {
        Node temp = head;
        boolean flag = false;
        while (temp.next != null) {
            if (temp.data == d) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            n.next = temp.next;
            temp.next = n;
        }
    }

    public void printListReverse(Node current) {
        if (current != null) {
            printListReverse(current.next);
            System.out.println(current.data + " " + current.next);
        }

    }

    public void deleteNode(int dataToDelete) {
        if (head.data == dataToDelete) {
            head = head.next;
        } else {
            Node current = head;
            while (current.next != null) {
                if (dataToDelete == tail.data) {
                    tail = current;
                    tail.next = null;
                } else if (current.next.data == dataToDelete){
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
            }
        }
    }
    // 2 5 7 6
}
