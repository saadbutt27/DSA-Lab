public class BinarySearch extends Search{
    public int search(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        int mid;

        while (start <= end) {
            mid = start + (end-start)/ 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
