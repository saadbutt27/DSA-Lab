public class Singly {
    Node head;
    Node tail;
    Singly(){
        head=tail=null;
    }

    public void insert(int d){
        Node n = new Node(d);
        if(head == null) {
            head = n;
        }else {
            tail.next = n;
        }
        tail = n;
    }

    public void insert(int d, String name){
        ChildNode n = new ChildNode(d,name);
        if(head == null) {
            head = n;
        }else {
            tail.next = n;
        }
        tail = n;
    }

    public void insertAtLast(int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void insertAtFirst(int d){
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }

    public void traverse(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean insertAtMiddle(int d,int pos){
        Node newNode = new Node(d);
        Node current = head;
        int i=1;
        if(pos==1){
            newNode.next=head;
            head=newNode;

        }
        pos--;
        while (current !=null){
            if(pos==i){
                break;
            }
            i++;
            current=current.next;
        }
        if(current==null){
            return false;
        }
        newNode.next=current.next;
        current.next=newNode;
        return true;
    }

    public int searching(int key){
        Node current = head;
        int i = 1;
        while (current != null){
            if(current.data == key){
                return i;
            }
            current = current.next;
            i++;
        }
        return -1;
    }

    public boolean delete(int key){
        if (head.data == key) {
            head = head.next;
            return true;
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.next.data == key) {
                    current.next = current.next.next;
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }
}
