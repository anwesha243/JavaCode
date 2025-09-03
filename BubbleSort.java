import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        // System.out.print("Before Bubble sort: "+Arrays.toString(arr));
        // System.out.println("After Bubble sort: "+Arrays.toString(bubble(arr))); 
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int bubbleSort(int[] arr){
        //run the n-1 steps
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j =1;j<arr.length - i;j++){
                if(arr[j]<arr[j-1]){
                  int temp = arr[j];
                  arr[j] = arr[j-1];
                  arr[j-1] = temp;
                  swapped = true;
                }  
            }
            if(!swapped){
                break;
            }
        }
        return 0;
    }
}
