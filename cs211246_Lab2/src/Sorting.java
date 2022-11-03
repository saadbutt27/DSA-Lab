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
}
