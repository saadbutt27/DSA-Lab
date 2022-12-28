public class SentinelLinearSearch extends Search{

    public int search(int arr[], int key){
        int temp = arr[arr.length-1];
        arr[arr.length-1] = key;
        int i = 0;
        while(key != arr[i]){
            i++;
        }
        arr[arr.length-1] = temp;
        if((i<arr.length-1) || key == arr[arr.length-1]){
            return i;
        }

        return -1;
    }
}
