import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("Enter a Number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
          factorial = factorial*i;}
          System.out.println(factorial);

}}