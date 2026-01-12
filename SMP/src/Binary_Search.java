import java.util.Scanner;
public class Binary_Search {
    public static int binary_search(int[] arr, int target){
        int low=0;
        int high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            //return -1;
        }
        return low;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target element : ");
        int target = sc.nextInt();
        //int[] arr = {1,2,3,4,5,6,7};
        //int target = 6;
        int result = binary_search(arr,target);
        if (result==-1){
            System.out.println("Target not found");
        }
        else{
            System.out.println("Target found at index: "+result);
        }
    }
}
