public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {5, 4, 2, 3, 1};
        insertion(arr);

        // Print sorted array
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    static void insertion(int[] arr){
        for(int i = 1; i < arr.length; i++){   // start from index 1
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);   // pass indexes, not values
                } else {
                    break;  // stop if no swap needed
                }
            }
        }
    }

    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
