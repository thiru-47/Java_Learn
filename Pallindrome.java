import java.util.Scanner;

public class Pallindrome {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a String: ");
         String str = sc.nextLine();
         int start = 0;
         int end = str.length() - 1;
         boolean isPalindrome = true;

         while(start<=end){
             if(str.charAt(start) != str.charAt(end)){
                 isPalindrome = false;
             }
             start++;
             end--;
         }
         if(isPalindrome){
             System.out.println("The given String is an Pallindrome");
         }
         else{
             System.out.println("The given String is not a Pallindrome");
         }
         sc.close();
     }
}
