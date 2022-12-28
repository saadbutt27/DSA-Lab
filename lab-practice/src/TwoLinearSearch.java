public class TwoLinearSearch extends Search{
    public int search(int arr[],int key){

        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            if(arr[s] == key){
                return s;
            } else if(arr[e] == key){
                return e;
            }
            s++;
            e--;
        }
        return -1;
    }
}
