import java.util.Scanner;
public class Check_Age {
    void check(int a){
        if(a>=18){
            System.out.println("Allowed to cast his/her Vote");
        }
        else{
            System.out.println("Not Allowed to cast his/her Vote");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Check_Age obj = new Check_Age();
        System.out.println("Enter the Age that is needed to be checked: ");
        int a = sc.nextInt();
        obj.check(a);
    }
}
