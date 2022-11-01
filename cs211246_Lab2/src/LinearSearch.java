public class LinearSearch {
    // Methods for searching an elements in an array

    public void linearSearch(int arr[], int key) {
        boolean flag = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found on index: " + i);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Element not found!");
        }

    }
    public void sentinelLinearSearch(int arr[], int key) {
        int n = arr.length;
        int last = arr[n-1];
        arr[n-1] = key;
        int i=0;
        while (arr[i] != key) {
            i++;
        }
        arr[n-1] = last;
        if ((i < n-1) || (arr[n-1] == key)) {
            System.out.println(key + " found on index " + i);
        } else {
            System.out.println(key + " is not found in array");
        }
    }

    public void twoWayLinearSearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        boolean flag = false;

        while (start <= end) {
            if (arr[start] == key){
                System.out.println("Element found on index: " + start);
                flag = true;
                break;
            } else if (arr[end] == key) {
                flag = true;
                System.out.println("Element found on index: " + end);
            }
            start++;
            end--;
        }
        if (!flag) {
            System.out.println("Element not found");
        }
    }

    public void probabilisticSearch (int arr[], int key) {
        boolean flag = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found on index: " + i);
                flag = true;
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
        if (!flag) {
            System.out.println("Element not found");
        }
    }

    public void binarySearch (int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        boolean flag = false;
        int mid;
        while(start <= end) {
            mid = (start+end)/2;
            if (arr[mid] == key) {
                System.out.println("Element found on index: " + mid);
                flag = true;
                break;
            }
            else if (arr[mid] < key) {
                start = mid+1;
            } else if (arr[mid] > key) {
                end = mid-1;
            }
        }
        if (!flag) {
            System.out.println("Element not found!");
        }
    }

    public int[] arrayBubbleSort (int arr[]) {
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
