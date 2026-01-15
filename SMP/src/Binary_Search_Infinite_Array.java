

public class Binary_Search_Infinite_Array {

    static int BinarySearch(int[] arr, int target, int low, int high){

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

static int findpos(int[] arr, int target){
        int low=0,high=1;
        while(high<arr.length && arr[high]<target){
            low=high;
            high=high*2;
        }
        if(high>=arr.length){
            high=arr.length-1;
        }
        return BinarySearch(arr,target,low,high);
}

public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 50;
        int position =  findpos(arr,target);
        //System.out.println(position);
    if(position!=-1){
        System.out.println("Element found at position "+position+" in array");
    }
    else{
        System.out.println("Element not found");
    }
}
}
