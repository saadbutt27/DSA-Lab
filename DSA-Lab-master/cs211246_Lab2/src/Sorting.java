public class Sorting {

    public int[] selectionSortAscending(int arr[]) {
        int min;
        for (int i=0; i<arr.length; i++) {
            min = i;
            for (int j=i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public int[] selectionSortDescending(int arr[]) {
        int max;
        for (int i=0; i<arr.length; i++) {
            max = i;
            for (int j=i+1; j < arr.length; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public int[] arrayBubbleSort (int arr[]) {
        // {3,5,9,7,11}
        boolean flag = false;
        int c=1;
        for (int i=0; i<arr.length-1; i++) {
            System.out.println("Iteration: "+ c);
            c++;
            flag = false;
            for (int j=0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (!flag)
                break;
        }
        return arr;
    }

    public int[] insertionSort(int arr[]) {
        for (int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }
    public int[] insertionSortForLoop(int arr[]) {
        for (int i=1; i<arr.length; i++) {
            int temp = arr[i];
            for (int j=i-1; j >= 0 && arr[j] > temp; j--) {
                arr[j+1] = temp;
            }
        }
        return arr;
    }
}
