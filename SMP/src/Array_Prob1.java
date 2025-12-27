import java.util.Arrays;
import java.util.Scanner;

public class Array_Prob1 {

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Input array elements
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = getConcatenation(nums);

        System.out.println("Concatenated Array:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
