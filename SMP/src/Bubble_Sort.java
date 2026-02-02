    import java.util.ArrayList;
    import java.util.Arrays;

    public class Bubble_Sort {
        static void bubbleSort(int[] arr){
            boolean swapped;
            for(int i=0;i<arr.length-1;i++){
                swapped = false;
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        swapped = true;
                    }
                }
                if(!swapped){
                    break;
                }
            }
        }
        public static void main(String[] args){
            int[] arr={4,3,5,1,9,7};
                    bubbleSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
