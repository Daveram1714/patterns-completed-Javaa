
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class longestSubarray {

    public int Brute(int n, int k, int nums[]) {
        int maxLength = 0;
        // for (int i = 0; i < n; i++) {
        //     long s = 0;
        //         for (int j = i; j < n; j++) {
        //                 s+=nums[j];

        //             if(s ==k){
        //                 maxLength = Math.max(maxLength, j-i+1);
        //             }
        //         }
        // }
        // Better version (O(N^2))
        for (int i = 0; i < n; i++) {
            long s = 0; // Start sum from i
            for (int j = i; j < n; j++) {
                s += nums[j]; // Just add the next element, no need for loop 'm'
                if (s == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    public int getLongestSubarray(int[] nums, int k) {
        Map<Long,Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

// If the current sum is exactly K, update maxLength
            if (sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }

// Check if (sum - k) exists in the map
            long remaining = sum - k;
            if (preSumMap.containsKey(remaining)) {
                int len = i - preSumMap.get(remaining);
                maxLength = Math.max(maxLength, len);
            }

// Store the sum only if it's NOT already in the map
// This ensures we keep the leftmost index for the longest subarray
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the Sum  of the k : ");
        int k = sc.nextInt();
        System.out.print("Enter the  the array Elements : ");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        longestSubarray ls = new longestSubarray();
        // System.out.println("The value is  : " + ls.Brute(n, k, nums));
        System.out.println("The value is  : " + ls.getLongestSubarray(nums, k));

    }

}
