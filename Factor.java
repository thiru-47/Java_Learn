import java.util.Scanner;
public class Factor {
    static void factor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);

            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        System.out.print("The Factors are :");
        factor(num);
    }
}
