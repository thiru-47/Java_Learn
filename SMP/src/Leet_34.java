import java.util.Arrays;

public class Leet_34 {
    public static int First_Occurrence(int[] arr, int target) {
        int low =0;
        int index = -1;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
                high=mid-1;
            }
            else{
                low = mid+1;
            }
            if (arr[mid]==target){
                index= mid;
            }
        }
        return index;
    }

    public static int Last_Occurrence(int[] arr, int target) {
        int low =0;
        int index = -1;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            if (arr[mid]==target){
                index= mid;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,4};
        int a = First_Occurrence(arr, 4);
        int b = Last_Occurrence(arr, 4);
        int[] result = {a,b};
        System.out.println(Arrays.toString(result));
    }
}
