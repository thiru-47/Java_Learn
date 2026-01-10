public class Linear_Search {
    static int method(int[] arr, int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        int target = 6;
        int result = method(arr, target);
        if (result == -1){
            System.out.println("Not Found");
        }
        else {
            System.out.println("Element Found at index: "+result);
        }
    }
}
