public class LinkedList {
    Node head;
    Node tail;
    LinkedList(){
        head = null;
        tail = null;
    }

    public void mids() {
        LinkedList tempList = new LinkedList();
        Node current = head;
        while(current != null) {
            if(current.data%2 == 0){
                tempList.insertLast(current.data);
            }
            current = current.next;
        }

        current = head;
        while(current != null) {
            if(current.data%2 != 0) {
                tempList.insertLast(current.data);
            }
            current = current.next;
        }

        head = tempList.head;
        tail = tempList.tail;
    }

    public char prob2(String str) {
        int flag = 0;
        for(int i=0; i<str.length(); i++) {
            flag = 0;
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    flag++;
                }
            }
            if(flag == 1){
                return str.charAt(i);
            }
        }

        return '$';
    }

    public int myprob(String str,String start, String end){
        String check = start+end;
        int flag;
        int out = 0;
        for(int i=0; i<str.length(); i++) {
            flag = 0;
            for(int j=0; j<check.length(); j++) {
                if(str.charAt(i) != check.charAt(j)){
                    flag = 0;
                } else {
                    flag = 1;
                }
            }
            if(flag == 1){
                out++;
            }
        }

        return out;
    }




    public void prob1() {
        int arr[][] = {{1,2,3},{4,5,6}};


   }

    public void insertLast (int data){
        Node n = new Node(data);
        if(head != null){
            tail.next = n;
            tail = n;
        } else {
            head = n;
            tail = n;
        }
    }

    public void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ==> ");
            temp = temp.next;
        }
    }

    public boolean search(int key){
        Node temp = head;
        while(temp != null){
            if(key == temp.data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public boolean update(int oldKey,int newKey){
        Node temp = head;
        while(temp != null){
            if(oldKey == temp.data){
                temp.data = newKey;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public boolean insertAfter(int data,Node newNode){
        Node temp = head;
        boolean flag = false;
        while(temp != null){
            if(data == temp.data){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            newNode.next = temp.next;
            temp.next = newNode;
            return true;
        }
        return false;
    }

    public void printReverse(Node n){
        Node temp = n;
        if(temp != null){
            printReverse(temp.next);
            System.out.println(temp.data);
        }
    }

    public void delete(int key){
        Node temp = head;
        if(head.data == key){
            head = head.next;
        } else if(tail.data == key){
            while(temp.next != null){
                if(temp.next.data == key){
                    temp.next = null;
                    tail = temp;
                    return;
                }
            }
        } else {
            while(temp.next.data != key){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
}
