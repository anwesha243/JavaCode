// import java.lang.*;
public class rotatedSortedDistinct {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int index = search(arr,target);
        System.out.print(index);
    }
     static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        //if you did not find the pivot then array is not rotated.
        if(pivot == -1){
            return binarySearch(arr,target, 0 ,arr.length-1);
        }
        //if pivot is found then you have found two ascending sorted array
        if(arr[pivot] == target){
            return pivot;
        }
        if(target>=arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        else{
            return binarySearch(arr,target,pivot+1,arr.length-1);
        }
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if((mid < end) && (arr[mid]>arr[mid+1])){
                return mid;
            }
            if((mid > start) && (arr[mid]<arr[mid-1])){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target,int start,int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]<target){
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}

