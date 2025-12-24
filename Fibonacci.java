import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms fibonacci series: ");
        int n = input.nextInt();
        int First=0;
        int Second=1;
        int i=2;
       // int n=6;
        System.out.println(0);
        System.out.println(1);
        while(i<n){
            int next=First+Second;
            First=Second;
            Second=next;
            System.out.println(next);
            i++;
        }
    }
}
