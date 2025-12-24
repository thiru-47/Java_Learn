 import java.util.Scanner;
public class Armstrong_Number{
    void count_digits(int num){
        int temp=num;
        int sum=0;
        int digits=0;
        while(temp!=0){
            temp=temp/10;
            digits++;
            //System.out.println(digits);
        }
        System.out.println(digits);
        temp=num;
        while(temp!=0){
            int digit=temp%10;
            sum = (int) (sum+Math.pow(digit,digits));
            temp=temp/10;
        }
        System.out.println(sum);
        if(sum==num){
            System.out.println(sum+" is an Pallindrome Number");
        }
        else{
            System.out.println(sum+" is not an Pallindrome Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        Armstrong_Number a = new Armstrong_Number();
        a.count_digits(num);
        sc.close();
    }
}