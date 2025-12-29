public class RichestCustomer_2D_Array_Prob {
static int Currentwealth=0;
static int Maxwealth=0;

    public static void main(String[] args){
        int[][] arr = {
                {2,4,6},
                {3,5,7},
                {1,2,3}
        };

        for(int i=0;i<arr.length;i++){
            Currentwealth=0;
            for (int j=0;j<arr[i].length;j++){
                Currentwealth+=arr[i][j];
            }
            if(Currentwealth>Maxwealth){
                Maxwealth=Currentwealth;
            }
        }
        System.out.println(Maxwealth);
    }
}
