import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList1 {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of kids: ");
        int n = sc.nextInt();

        int[] candies = new int[n];

        System.out.println("Enter candies for each kid:");
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }

        System.out.print("Enter extra candies: ");
        int extraCandies = sc.nextInt();

        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.println("Result: " + result);

        sc.close();
    }
}
