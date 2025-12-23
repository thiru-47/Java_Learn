
package basics;
import java.util.Scanner;


public class EvenOdd{
public static void main(String [] args){
    Scanner sc = new Scanner(System.in); 
    //System.out.println("Enter a number to check even or odd:");
   // int num = sc.nextInt();
    /*System.out.println("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Welcome "+name);
    if (num%2==0){
        System.out.println(num+" is an even Number");
    }
    else{
        System.out.println(num+" is an Odd Number");
    }*/
//SIMPLE INTEREST CALCULATOR
    /*System.out.print("Enter the Principal Amount: ");
    int principal = sc.nextInt();
    System.out.print("Enter the Interest Rate: ");
    int interest = sc.nextInt();
    System.out.print("Enter the Number of Years: ");
    int numberOfYears = sc.nextInt();
    int SimpleInterestRate = (principal * interest*numberOfYears)/100;
    System.out.println("The Simple Interest Rate is "+SimpleInterestRate);*/

    //FIBONACCI SERIES UPTO N Numbers

    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int First=0, Second=1;

    System.out.println("Fibonacci Series upto "+n+" are : ");
    for(int i=0;i<=n;i++){
        System.out.print(First+" ");
        int next=First+Second;
        First=Second;
        Second=next;
    }

    sc.close();
}
}