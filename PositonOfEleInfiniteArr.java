import java.util.*;
public class PositonOfEleInfiniteArr {
    public static void main(String[] args){
        int[] arr = {2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target = 15;
        int position = ans(arr,target);
        System.out.print("The position of the element is : "+position );

    }

    static int ans(int[] arr, int target){
        //first find the range 
        //start a box size of 2
        int start = 0;
        int end = 1;

        //conditon for the target to lie in the range
        if(target > arr[end]){
            int temp = end + 1;
            //double the box size
            //end = sizeofbox * 2
            end = end + (end - start + 1)*2;
            start = temp;
        }
        
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    
}
