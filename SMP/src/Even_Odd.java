import java.util.Scanner;
public class Even_Odd {
    void even_odd(int a){
        if( a%2==0){
            System.out.println(a+" is an Even number");
        }
        else{
            System.out.println(a+"is an Odd Number");
        }
    }
    public static void main(String[] args) {
        Even_Odd obj = new Even_Odd();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int a = sc.nextInt();
        obj.even_odd(a);
    }
}
