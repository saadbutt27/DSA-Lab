import java.sql.SQLOutput;

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
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }

    public void traverseListReverse(Node current) {
        if (current != null) {
            traverseListReverse(current.next);
            System.out.print(current.data + ", ");
        }
    }

    public void searchNode(int searchValue) {
        Node temp = head;
        int count = 0;
        boolean flag = false;
        while (temp.next != null) {
            count++;
            if (temp.data == searchValue) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println(searchValue + " exists in the List at position " + count);
        } else {
            System.out.println(searchValue + " doesn't exist in List");
        }
    }

    public void updateNode(int searchValue, int newValue) {
        Node temp = head;
        int count = 0;
        boolean flag = false;
        while (temp.next != null) {
            count++;
            if (temp.data == searchValue) {
                temp.data = newValue;
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println(searchValue + " updated at position " + count + " to " + newValue);
        } else {
            System.out.println(searchValue + " doesn't exist in List");
        }
    }

    public void insertNodeBefore(int data, Node n) {
        if (head.data == data) {
            n.next = head;
            head = n;
        } else {
            Node temp = head;
            boolean flag = false;
            while (temp.next != null) {
                if (temp.next.data == data) {
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
    }

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

    public void deleteNode(int dataToDelete) {
        if (head.data == dataToDelete) {
            head = head.next;
        } else {
            Node current = head;
            boolean flag = false;
            while (current.next != null) {
                if (dataToDelete == tail.data) {
                    tail = current;
                    tail.next = null;
                    flag  = true;
                } else if (current.next.data == dataToDelete){
                    current.next = current.next.next;
                    flag = true;
                    break;
                }
                current = current.next;
            }
            if (!flag)
                System.out.println("Data to be deleted does not exist in the list");
        }
    }
}
