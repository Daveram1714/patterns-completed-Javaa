import java.util.HashMap;

class NumberOFSubbarray {

    public int brute(int arr[], int k) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;

                for (int m = i; m <= j; m++) {
                    sum += arr[m];
                }
                if (sum == k) {
                    count++;
                }
            }

        }
        return count;
    }

    public int better(int arr[], int k) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public int optimal(int arr[], int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            int remove = prefixSum - k;

            if (prefixSumCount.containsKey(remove)) {
                count += prefixSumCount.get(remove);
            }
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);

        }

        return count;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };

        // Target sum
        int k = 6;

        // Create Solution object
        NumberOFSubbarray sol = new NumberOFSubbarray();

        // Call function and store result
        // int result = sol.brute(arr, k);
        // int result = sol.better(arr, k);
        int result = sol.optimal(arr, k);

        // Print the count of subarrays
        System.out.println("The number of subarrays is: " + result);
    }
}