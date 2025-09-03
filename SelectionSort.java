import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args){
        int[] arr ={5,4,2,3,1};
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            //find the maximum element in the remaining array and swap with correct index
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i =start;i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}