public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list1 = new DoublyLinkedList();
        int count = 5;
        for (int i=0; i<10; i++) {
            list1.insertNode(count);
            count += 10;
        }
        DoublyLinkedList list2 = new DoublyLinkedList();
        int count2 = 6;
        for (int i=0; i<10; i++) {
            list2.insertNode(count2);
            count2 += 10;
        }
//        list1.traverseList();
//        list1.searchNode(85);
//        list1.updateNode(75, 105);
//        list1.traverseList();

//        list1.traverseList();
//        list1.insertNodeAt(72, 10);
//        list1.traverseList();

//        list1.traverseList();
//        list2.traverseList();
////        DoublyLinkedList li = DoublyLinkedList.combineLists(list1, list2);
//        li.traverseList();
//        System.out.println(li.tail.data);
//        list1.traverseListReverse();

//        list1.traverseList();
//        list1.deleteNode(5);
//        list1.traverseList();

//        SingleLinkedList list = new SingleLinkedList();
//        int count = 5;
//        for (int i=0; i<10; i++) {
//            list.insertNode(count);
//            count += 10;
//        }
//
//        list.traverseList();
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

//        list.deleteNode(5);
//
//        list.traverseList();


//        Recursion rec1 = new Recursion();
//        rec1.a(0);
//        Sorting insSort = new Sorting();
//        int arr1[] = {11,9,7,5,3,1};
//        System.out.println("Original Array: " + Arrays.toString(arr1));
//        System.out.println("Insertion Sort While Loop: " + Arrays.toString(insSort.insertionSort(arr1)));
//        System.out.println("Insertion Sort For Loop: " + Arrays.toString(insSort.insertionSortForLoop(arr1)));
        // Task
//        Scanner input = new Scanner(System.in);
//        String id;
//        String name;
//        String age;
//        String email;
//        Student[] std = new Student[10];
//        for (int i=0; i<10; i++) {
//            System.out.println("Student " + (i+1));
//            System.out.print("Enter id: ");
//            id = input.nextLine();
//            System.out.print("Enter name: ");
//            name = input.nextLine();
//            System.out.print("Enter age: ");
//            age = input.nextLine();
//            System.out.print("Enter email: ");
//            email = input.nextLine();
//            std[i] = new Student(id, name, age, email);
//        }
//
//        LinearSearch search = new LinearSearch();
//        search.linearSearch(std, "Ali");

        // Sorting
//        int arr1[] = {3,5,9,7,11};
//        System.out.println("Original Array");
//        System.out.println(Arrays.toString(arr1));
//        Sorting sort1 = new Sorting();
//        System.out.println("Selection Sort Ascending Order");
//        System.out.println(Arrays.toString(sort1.selectionSortAscending(arr1)));
//        System.out.println("Selection Sort Descending Order");
//        System.out.println(Arrays.toString(sort1.selectionSortDescending(arr1)));
//        System.out.println("Bubble Sort");
//        System.out.println(Arrays.toString(sort1.arrayBubbleSort(arr1)));

        // Linear Search
//        int arr[] = {40, 50, 3, 94, 2, 100, 5, 85, 67};
//        Scanner input = new Scanner(System.in);
//        System.out.println(Arrays.toString(arr));
//        System.out.print("Enter key element: ");
//        int key = input.nextInt();
//
//        LinearSearch obj = new LinearSearch();
//
//        System.out.println("Linear Search");
//        obj.linearSearch(arr, key);
//
//        System.out.println("Sentinel Linear Search");
//        obj.twoWayLinearSearch(arr,key);
//
//        System.out.println("Two Way Linear Search");
//        obj.sentinelLinearSearch(arr,key);
//
//        System.out.println("Probabilistic Linear Search");
//        obj.probabilisticSearch(arr,key);
//
//        System.out.println("Binary Search");
//        System.out.println(Arrays.toString(sort1.arrayBubbleSort(arr)));
//        obj.binarySearch(sort1.arrayBubbleSort(arr), key);

    }
}
