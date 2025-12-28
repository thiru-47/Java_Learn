import java.util.Scanner;

public class Array_Prob2_Running_Sum {
    static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = runningSum(nums);
        System.out.println("Running Sum Array:");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
