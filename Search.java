public class Search {
      public static void main(String[] args) {
    int[] array = {34, 67, 23, 89, 2, 90, 11};
    int largest=array[0];
    for (int i=0;i<array.length;i++){
        if (array[i]>largest){
            largest=array[i];
        }
    }
  
        System.out.println("The largest element in the array is : "+largest);
    }
}
