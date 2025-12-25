import java.util.Scanner;
public class Max_Min {
    void Max(int a,int b, int c){
        System.out.println(Math.max(a,Math.max(b,c)));
    }
    void Min(int a,int b, int c){
        System.out.println(Math.min(a,Math.min(b,c)));
    }
    public static void main(String[] args) {
        Max_Min obj = new Max_Min();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        System.out.println("Enter Third Number:");
        int c =sc.nextInt();

        obj.Max(a,b,c);
        obj.Min(a,b,c);
    }
}
