
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class TwoSum {

    public void Brute(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("The elements are" + arr[i] + "," + arr[j]);
                }

            }
        }
        System.out.println("The are no elements ");
    }

    public int[] better(int arr[], int target) {

        HashMap<Integer, Integer> hash = new HashMap<>();
        int n = arr.length;
        int find = 0;
        for (int i = 0; i < n; i++) {
            find = target - arr[i];

            if (hash.containsKey(find)) {
                return new int[]{arr[i], find};
            }
            hash.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }

        public int[] twoSumIndices(int[] arr, int target) {
        int n = arr.length;
        int[][] numsWithIndex = new int[n][2];
        
        // Store element with original index
        for (int i = 0; i < n; i++) {
            numsWithIndex[i][0] = arr[i];
            numsWithIndex[i][1] = i;
        }
        
        // Sort by the value to apply two-pointer
        Arrays.sort(numsWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = numsWithIndex[left][0] + numsWithIndex[right][0];
            if (sum == target) {
                // Return original indices of the two numbers found
                return new int[] {numsWithIndex[left][1], numsWithIndex[right][1]};
            } else if (sum < target) {
                // Increase sum by moving left pointer forward
                left++;
            } else {
                // Decrease sum by moving right pointer backward
                right--;
            }
        }
        
        // No pair found
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array");
        int n = sc.nextInt();
        System.out.print("Enter the target element");
        int target = sc.nextInt();
        System.out.print("Enter the  the Array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        TwoSum ts = new TwoSum();
        // ts.Brute(arr, target);
        // System.out.println("The value is " +  ts.better(arr, target));

        int[] ans = ts.better(arr, target);

        System.out.println("The value is " + ans[0] + " " + ans[1]);
    }
}
