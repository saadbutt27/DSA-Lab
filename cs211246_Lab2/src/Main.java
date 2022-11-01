import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int arr[] = {40, 50, 3, 94, 2, 100, 5, 85, 67};
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter key element: ");
        int key = input.nextInt();

        LinearSearch obj = new LinearSearch();

        System.out.println("Linear Search");
        obj.linearSearch(arr, key);

        System.out.println("Sentinel Linear Search");
        obj.twoWayLinearSearch(arr,key);

        System.out.println("Two Way Linear Search");
        obj.sentinelLinearSearch(arr,key);

        System.out.println("Probabilistic Linear Search");
        obj.probabilisticSearch(arr,key);

        System.out.println("Binary Search");
        System.out.println(Arrays.toString(obj.arrayBubbleSort(arr)));
        obj.binarySearch(obj.arrayBubbleSort(arr), key);

    }
}
