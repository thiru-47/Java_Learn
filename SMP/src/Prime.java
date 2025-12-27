import java.util.Scanner;

public class Prime {
    void prime(int n) {
        if (n <= 1) {
            System.out.println("The number is not a Prime Number");
            return;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("The number is not a Prime Number");
                return;
            }
        }

        System.out.println("The number is a Prime Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prime obj = new Prime();

        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        obj.prime(n);
        sc.close();
    }
}
